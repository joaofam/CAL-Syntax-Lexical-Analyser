// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fileParser}.
 */
public interface fileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fileParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(fileParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(fileParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(fileParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(fileParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(fileParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(fileParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(fileParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(fileParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl(fileParser.Const_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl(fileParser.Const_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_list(fileParser.Function_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_list(fileParser.Function_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(fileParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(fileParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(fileParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(fileParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(fileParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(fileParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_parameter_list(fileParser.Nemp_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_parameter_list(fileParser.Nemp_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(fileParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(fileParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(fileParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(fileParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(fileParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(fileParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(fileParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(fileParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_arith_op(fileParser.Binary_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_arith_op(fileParser.Binary_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#fragment2}.
	 * @param ctx the parse tree
	 */
	void enterFragment2(fileParser.Fragment2Context ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#fragment2}.
	 * @param ctx the parse tree
	 */
	void exitFragment2(fileParser.Fragment2Context ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(fileParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(fileParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(fileParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(fileParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(fileParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(fileParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link fileParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_arg_list(fileParser.Nemp_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link fileParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_arg_list(fileParser.Nemp_arg_listContext ctx);
}