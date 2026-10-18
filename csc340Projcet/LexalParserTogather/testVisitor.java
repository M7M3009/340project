// Generated from test.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(testParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(testParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(testParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(testParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(testParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(testParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#elsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsePart(testParser.ElsePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(testParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(testParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(testParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(testParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(testParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#orExprPrime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExprPrime(testParser.OrExprPrimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(testParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#andExprPrime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExprPrime(testParser.AndExprPrimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(testParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#equalityExprPrime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExprPrime(testParser.EqualityExprPrimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#eqOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOp(testParser.EqOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(testParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#relExprPrime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExprPrime(testParser.RelExprPrimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(testParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(testParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#addExprPrime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExprPrime(testParser.AddExprPrimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(testParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#mulExprPrime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExprPrime(testParser.MulExprPrimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(testParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(testParser.PrimaryContext ctx);
}