//import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.misc.MultiMap;
//import org.antlr.v4.runtime.misc.OrderedHashSet;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.stringtemplate.v4.ST;
//
//
//
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.util.Set;

import java.util.ArrayList;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

class IncludeListener extends NginxBaseListener {
	ArrayList<String> paths;
	String baseDir;

	public IncludeListener(String dir) {
		paths = new ArrayList<String>();
		baseDir = dir;
	}

	public void addPath(String dir, String path) throws IOException {		
		String glob ;
		if(path.startsWith("/")) {
			glob = "glob:"+path;	
		}else {
     		glob = "glob:"+dir+"/"+path;
		}
		if (System.getProperty("DEBUG") != null) {
			System.out.println("(DEBUG) IncludeListener: include glob "+glob);
		}
		PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);

		Files.walkFileTree(Paths.get(dir), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				// System.out.println(file);
				if (pathMatcher.matches(file)) {
					// System.out.println(file);
					paths.add(file.toString());
				}
				return FileVisitResult.CONTINUE;
			}
		});
	}

	public void exitIncludeDirective(NginxParser.IncludeDirectiveContext ctx) {
		if (System.getProperty("DEBUG") != null) {
			System.out.printf("(DEBUG) IncludeListener: found include %s\n", ctx.value().getText());
		}
		// paths.add(ctx.value().getText());
		try {
			addPath(baseDir, ctx.value().getText());
		} catch (Exception e) {
			System.out.printf("exitIncludeDirective: add path %s\n", e.getMessage());
		}
	}

}
