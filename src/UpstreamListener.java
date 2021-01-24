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

import java.util.HashMap;

class UpstreamListener extends NginxBaseListener {
	HashMap<String, Upstream> upstreams;
	Upstream upstream;

	public UpstreamListener() {
		upstreams = new HashMap<String, Upstream>();
	}

	public void enterUpstreamDirective(NginxParser.UpstreamDirectiveContext ctx) {
		upstream = new Upstream(ctx.ID().getText());
		if (System.getProperty("DEBUG") != null) {
			System.out.printf("upstreamDirective: upstream %s\n", ctx.ID().getText());
		}
	}

	public void exitUpstreamDirective(NginxParser.UpstreamDirectiveContext ctx) {
		upstreams.put(ctx.ID().getText(), upstream);
	}

	public void exitServerDirective(NginxParser.ServerDirectiveContext ctx) {
		if (ctx.value().size() > 1) {
			if (System.getProperty("DEBUG") != null) {
				System.out.printf("(DEBUG) serverIncludeDirective: server %s\n", ctx.value(0).getText());
			}
			upstream.servers.add(ctx.value(0).getText());
		}
	}

}
