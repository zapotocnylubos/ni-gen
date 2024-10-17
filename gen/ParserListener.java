// Generated from /Users/zapotocnylubos/syncthing/ni-gen/src/grammar/Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#declaratorList}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorList(Parser.DeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#declaratorList}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorList(Parser.DeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(Parser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(Parser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(Parser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(Parser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(Parser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(Parser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(Parser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(Parser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(Parser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(Parser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(Parser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(Parser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(Parser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(Parser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(Parser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(Parser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(Parser.ArgumentListContext ctx);
}