// Generated from /Users/zapotocnylubos/syncthing/ni-gen/src/grammar/TCParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TCParser}.
 */
public interface TCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#declaratorList}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorList(TCParser.DeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#declaratorList}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorList(TCParser.DeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(TCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(TCParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(TCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(TCParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(TCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(TCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TCParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TCParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(TCParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(TCParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(TCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(TCParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(TCParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(TCParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(TCParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(TCParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(TCParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(TCParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(TCParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(TCParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(TCParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(TCParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(TCParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(TCParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(TCParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(TCParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(TCParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(TCParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(TCParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(TCParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(TCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(TCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(TCParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(TCParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(TCParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(TCParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TCParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(TCParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(TCParser.ArgumentListContext ctx);
}