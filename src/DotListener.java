import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DotListener extends NginxBaseListener {
	ParseTreeProperty<String> nodes;  
	static String currentContext="global";
	static int server_count=1;
	static int url_count=1;
	static HashMap<String, String> urls=new HashMap<String, String>();
	static HashMap<String, String> upstreamsInUse=new HashMap<String, String>();
	static HashMap<String, String> serversInUse=new HashMap<String, String>();
	static MultiMap<String, String> edges=new MultiMap<String, String>();
	
	
	String currentServer;
	String currentUrl;
	
	public void enterContextDirective(NginxParser.ContextDirectiveContext ctx) { 
		currentContext=ctx.getStart().getText();
		//System.out.println(currentContext);
	}
	
	public void exitValues(NginxParser.ValuesContext ctx) {
		if(currentContext.equals("server")&&ctx.value(0).getText().equals("server_name")) {	
			currentServer="site_"+ server_count++;
			System.out.print(	currentServer +"[label=\"{");
			
			StringBuilder servers_str=new StringBuilder();
			for (int i = 1; i < ctx.value().size(); i++) {
				servers_str.append(ctx.value(i).getText());
				if(i<ctx.value().size()-1) {
					servers_str.append("|");
				}
				System.out.print(servers_str);	
            }
		   System.out.println("}\"]");   
		   serversInUse.put(currentServer,servers_str.toString());
		}else if(currentContext.contains("server")&&ctx.value(0).getText().equals("proxy_pass")) {
	       String proxy_pass=ctx.value(1).getText().replace("http://", "").replace("https://", "");
			upstreamsInUse.put("upstream_"+proxy_pass,proxy_pass);
			//System.out.println(currentUrl+"->"+"\"upstream_"+proxy_pass+"\"");
		    edges.map(currentUrl, "\"upstream_"+proxy_pass+"\"");  
			
			if (System.getProperty("DEBUG") != null) {
				System.out.println("found upstreams: "+proxy_pass+NginxTopo.upstreams.get(proxy_pass));
			}
	       
//			System.out.print(currentUrl+"->"+"\"upstream_"+proxy_pass+"\"[label=\"");
//	       if (NginxTopo.upstreams.get(proxy_pass)!=null) {
//
//	        	ArrayList<String> servers=NginxTopo.upstreams.get(proxy_pass).servers;
//	        	for (int i=0;i<servers.size();i++) {
//	        		System.out.print(servers.get(i));
//	        		if(i<servers.size()-1) {
//	        			System.out.print("|");
//	        		}
//	        	}
//	        }
//			System.out.println("\"]");
			
		}
	}
	
	public void enterRegexLocation(NginxParser.RegexLocationContext ctx) {
		currentUrl=uniqLocation(ctx.value().getText());
		//System.out.println(currentServer+"->" + currentUrl);
		edges.map(currentServer, currentUrl);
	}
	
	public void enterNormalLocation(NginxParser.NormalLocationContext ctx) {
		currentUrl=uniqLocation(ctx.value().getText());
		//System.out.println(currentServer+ "->" +currentUrl);
		edges.map(currentServer, currentUrl);
	}

	private String uniqLocation(String location) {
		String tmpUrl=urls.get(location);
		if(tmpUrl==null) {
		   tmpUrl=	"url_"+ url_count++;
		   urls.put(location, tmpUrl) ;
		}
		return tmpUrl;
	}
	
	
	
}
