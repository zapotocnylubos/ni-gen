// Generated from /Users/zapotocnylubos/syncthing/ni-gen/src/grammar/Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#declaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorList(Parser.DeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(Parser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(Parser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(Parser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(Parser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(Parser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(Parser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(Parser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(Parser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(Parser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(Parser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(Parser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Parser.ArgumentListContext ctx);
}