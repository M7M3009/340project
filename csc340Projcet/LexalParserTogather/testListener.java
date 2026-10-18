// Generated from test.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(testParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(testParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(testParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(testParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(testParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(testParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(testParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(testParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(testParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(testParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void enterElsePart(testParser.ElsePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void exitElsePart(testParser.ElsePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(testParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(testParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(testParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(testParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(testParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(testParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(testParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(testParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(testParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(testParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#orExprPrime}.
	 * @param ctx the parse tree
	 */
	void enterOrExprPrime(testParser.OrExprPrimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#orExprPrime}.
	 * @param ctx the parse tree
	 */
	void exitOrExprPrime(testParser.OrExprPrimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(testParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(testParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#andExprPrime}.
	 * @param ctx the parse tree
	 */
	void enterAndExprPrime(testParser.AndExprPrimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#andExprPrime}.
	 * @param ctx the parse tree
	 */
	void exitAndExprPrime(testParser.AndExprPrimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(testParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(testParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#equalityExprPrime}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExprPrime(testParser.EqualityExprPrimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#equalityExprPrime}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExprPrime(testParser.EqualityExprPrimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(testParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(testParser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(testParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(testParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#relExprPrime}.
	 * @param ctx the parse tree
	 */
	void enterRelExprPrime(testParser.RelExprPrimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#relExprPrime}.
	 * @param ctx the parse tree
	 */
	void exitRelExprPrime(testParser.RelExprPrimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(testParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(testParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(testParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(testParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#addExprPrime}.
	 * @param ctx the parse tree
	 */
	void enterAddExprPrime(testParser.AddExprPrimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#addExprPrime}.
	 * @param ctx the parse tree
	 */
	void exitAddExprPrime(testParser.AddExprPrimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(testParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(testParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#mulExprPrime}.
	 * @param ctx the parse tree
	 */
	void enterMulExprPrime(testParser.MulExprPrimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#mulExprPrime}.
	 * @param ctx the parse tree
	 */
	void exitMulExprPrime(testParser.MulExprPrimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(testParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(testParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(testParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(testParser.PrimaryContext ctx);
}