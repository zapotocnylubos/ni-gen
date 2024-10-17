// Generated from /Users/zapotocnylubos/syncthing/ni-gen/src/grammar/TCParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TCParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#declaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorList(TCParser.DeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(TCParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(TCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(TCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TCParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(TCParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(TCParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TCParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(TCParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(TCParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TCParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(TCParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(TCParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(TCParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(TCParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(TCParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(TCParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(TCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(TCParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(TCParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TCParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TCParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(TCParser.ArgumentListContext ctx);
}