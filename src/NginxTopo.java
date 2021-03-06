import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import java.io.File;

public class NginxTopo {

	static String baseDir;
	static HashMap<String, Upstream> upstreams;
    
   
	public static void parseFile(String inputFile,ICollector collector) {
		CharStream input = null;
		try {
			input = CharStreams.fromFileName(inputFile);
		} catch (Exception e) {
			System.out.printf("input file %s cannot be parsed %s\n", inputFile, e.getMessage());
			System.exit(1);
		}

		NginxLexer lexer = new NginxLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		NginxParser parser = new NginxParser(tokens);
		parser.setBuildParseTree(true);
		ParseTree tree = parser.nginx();
		if (System.getProperty("DEBUG") != null) {
			System.out.printf("(DEBUG) parseFile: %s\n", tree.toStringTree(parser));
		}

		ParseTreeWalker walker = new ParseTreeWalker();

		NginxBaseListener listener = collector.getListener();
		walker.walk(listener, tree);
		collector.collect();

		
		IncludeListener include = new IncludeListener(baseDir);
		walker.walk(include, tree);
		
		if (System.getProperty("DEBUG") != null) {
			System.out.println("(DEBUG) IncludeListener: return "+include.paths);
		}
		for (String path : include.paths) {
			if (System.getProperty("DEBUG") != null) {
				System.out.println("(DEBUG)include "+path);
			}
			parseFile(path,collector);
		}
	}

	public static void main(String[] args) throws Exception {
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
		if (inputFile == null) {
			System.out.println("no config to parse! will exit.");
			System.exit(1);
		}
		if (args.length > 2) {
			baseDir = args[2];
		} else {
			baseDir = new File(inputFile).getParent();
	       if(System.getProperty("DEBUG")!=null){
	            System.out.println("(DEBUG) base_dir:"+ baseDir);
	        }
			
		}
		if (System.getProperty("DEBUG") != null) {
			System.out.println("(DEBUG) step 1 :parse upstreams");
		}
		parseUpstreams(inputFile);
		if (System.getProperty("DEBUG") != null) {
			System.out.println("(DEBUG) step 2 :parse topo");
		}
		toDot(inputFile);
		
		
		

	}

	private static void toDot(String inputFile) {
		DotCollector dotCollector=new DotCollector();
		dotCollector.setListener(new DotListener());
		System.out.print("digraph ws {\n"
				+ "nodesep = .5;\n"
                + "rankdir = LR ;"
				+ "node[shape=record, width=.1, height=.1];\n"
				+ "node[color=\"#550000\"];\n"
				);
		parseFile(inputFile,dotCollector);
		
		Set<String> uniq_edges=new HashSet<String>();
		for (Pair<String, String> edge : DotListener.edges.getPairs()) {
			uniq_edges.add(edge.a+"->"+edge.b);		
		}
		
		for (String edge: uniq_edges) {
			System.out.println(edge);
		}
		
		for (Entry<String, String> server : DotListener.serversInUse.entrySet()) {
			System.out.println("http->"+server.getKey());
		}
		
		for (Entry<String, String> url : DotListener.urls.entrySet()) {
			System.out.println(url.getValue()+"[label=\""+url.getKey()+"\"]");
		}
		
		for (Entry<String, String> upstream : DotListener.upstreamsInUse.entrySet()) {
			String proxy_pass=upstream.getValue();
			System.out.print("\"upstream_"+proxy_pass+"\"[label=\"");
			System.out.print(upstream.getKey());
			if (NginxTopo.upstreams.get(proxy_pass)!=null) {
				   System.out.print("|");
		        	ArrayList<String> servers=NginxTopo.upstreams.get(proxy_pass).servers;
		        	for (int i=0;i<servers.size();i++) {
		        		System.out.print(servers.get(i));
		        		if(i<servers.size()-1) {
		        			System.out.print("|");
		        		}
		        	}
		        }
			System.out.println("\"]");
		}

		
		System.out.print("}\n");
	}

	private static void parseUpstreams(String inputFile) {
		UpstreamCollector upstreamCollector=new UpstreamCollector();
		upstreamCollector.setListener(new UpstreamListener());
		
		parseFile(inputFile,upstreamCollector);
		if (System.getProperty("DEBUG") != null) {
			System.out.println("(DEBUG) upstreams:"+upstreamCollector.getUpstreams());
		}
		upstreams=upstreamCollector.getUpstreams();
	}

	/*
	 * private static void parseNginx(String inputFile) { UpstreamCollector
	 * upstreamCollector=new UpstreamCollector(); upstreamCollector.setListener(new
	 * UpstreamListener());
	 * 
	 * parseFile(inputFile,upstreamCollector); if (System.getProperty("DEBUG") !=
	 * null) {
	 * System.out.println("(DEBUG) upstreams:"+upstreamCollector.getUpstreams()); }
	 * upstreams=upstreamCollector.getUpstreams(); }
	 */
}
