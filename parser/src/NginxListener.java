// Generated from src/Nginx.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NginxParser}.
 */
public interface NginxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NginxParser#nginx}.
	 * @param ctx the parse tree
	 */
	void enterNginx(NginxParser.NginxContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#nginx}.
	 * @param ctx the parse tree
	 */
	void exitNginx(NginxParser.NginxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UpstreamBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterUpstreamBlock(NginxParser.UpstreamBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UpstreamBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitUpstreamBlock(NginxParser.UpstreamBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContextBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterContextBlock(NginxParser.ContextBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContextBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitContextBlock(NginxParser.ContextBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServerBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterServerBlock(NginxParser.ServerBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServerBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitServerBlock(NginxParser.ServerBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(NginxParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(NginxParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncludeBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIncludeBlock(NginxParser.IncludeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncludeBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIncludeBlock(NginxParser.IncludeBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocationBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLocationBlock(NginxParser.LocationBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocationBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLocationBlock(NginxParser.LocationBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterValueBlock(NginxParser.ValueBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitValueBlock(NginxParser.ValueBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValuesBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterValuesBlock(NginxParser.ValuesBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValuesBlock}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitValuesBlock(NginxParser.ValuesBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Values}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterValues(NginxParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Values}
	 * labeled alternative in {@link NginxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitValues(NginxParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#ifDirective}.
	 * @param ctx the parse tree
	 */
	void enterIfDirective(NginxParser.IfDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#ifDirective}.
	 * @param ctx the parse tree
	 */
	void exitIfDirective(NginxParser.IfDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void enterEqualLocation(NginxParser.EqualLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void exitEqualLocation(NginxParser.EqualLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HeadRegexLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void enterHeadRegexLocation(NginxParser.HeadRegexLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HeadRegexLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void exitHeadRegexLocation(NginxParser.HeadRegexLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ICaseRegexLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void enterICaseRegexLocation(NginxParser.ICaseRegexLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ICaseRegexLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void exitICaseRegexLocation(NginxParser.ICaseRegexLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegexLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void enterRegexLocation(NginxParser.RegexLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegexLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void exitRegexLocation(NginxParser.RegexLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void enterNormalLocation(NginxParser.NormalLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalLocation}
	 * labeled alternative in {@link NginxParser#locationDirective}.
	 * @param ctx the parse tree
	 */
	void exitNormalLocation(NginxParser.NormalLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#upstreamDirective}.
	 * @param ctx the parse tree
	 */
	void enterUpstreamDirective(NginxParser.UpstreamDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#upstreamDirective}.
	 * @param ctx the parse tree
	 */
	void exitUpstreamDirective(NginxParser.UpstreamDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#contextDirective}.
	 * @param ctx the parse tree
	 */
	void enterContextDirective(NginxParser.ContextDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#contextDirective}.
	 * @param ctx the parse tree
	 */
	void exitContextDirective(NginxParser.ContextDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#includeDirective}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDirective(NginxParser.IncludeDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#includeDirective}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDirective(NginxParser.IncludeDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#serverDirective}.
	 * @param ctx the parse tree
	 */
	void enterServerDirective(NginxParser.ServerDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#serverDirective}.
	 * @param ctx the parse tree
	 */
	void exitServerDirective(NginxParser.ServerDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(NginxParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(NginxParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(NginxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(NginxParser.BlockContext ctx);
}