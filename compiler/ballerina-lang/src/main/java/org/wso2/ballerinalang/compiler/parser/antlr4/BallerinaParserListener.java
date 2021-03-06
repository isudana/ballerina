// Generated from BallerinaParser.g4 by ANTLR 4.5.3
package org.wso2.ballerinalang.compiler.parser.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BallerinaParser}.
 */
public interface BallerinaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(BallerinaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(BallerinaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(BallerinaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(BallerinaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(BallerinaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(BallerinaParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(BallerinaParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(BallerinaParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(BallerinaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(BallerinaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#orgName}.
	 * @param ctx the parse tree
	 */
	void enterOrgName(BallerinaParser.OrgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#orgName}.
	 * @param ctx the parse tree
	 */
	void exitOrgName(BallerinaParser.OrgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(BallerinaParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(BallerinaParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#serviceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterServiceDefinition(BallerinaParser.ServiceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#serviceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitServiceDefinition(BallerinaParser.ServiceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#serviceBody}.
	 * @param ctx the parse tree
	 */
	void enterServiceBody(BallerinaParser.ServiceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#serviceBody}.
	 * @param ctx the parse tree
	 */
	void exitServiceBody(BallerinaParser.ServiceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#resourceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterResourceDefinition(BallerinaParser.ResourceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#resourceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitResourceDefinition(BallerinaParser.ResourceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#callableUnitBody}.
	 * @param ctx the parse tree
	 */
	void enterCallableUnitBody(BallerinaParser.CallableUnitBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#callableUnitBody}.
	 * @param ctx the parse tree
	 */
	void exitCallableUnitBody(BallerinaParser.CallableUnitBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(BallerinaParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(BallerinaParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunction(BallerinaParser.LambdaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunction(BallerinaParser.LambdaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#callableUnitSignature}.
	 * @param ctx the parse tree
	 */
	void enterCallableUnitSignature(BallerinaParser.CallableUnitSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#callableUnitSignature}.
	 * @param ctx the parse tree
	 */
	void exitCallableUnitSignature(BallerinaParser.CallableUnitSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#connectorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConnectorDefinition(BallerinaParser.ConnectorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#connectorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConnectorDefinition(BallerinaParser.ConnectorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#connectorBody}.
	 * @param ctx the parse tree
	 */
	void enterConnectorBody(BallerinaParser.ConnectorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#connectorBody}.
	 * @param ctx the parse tree
	 */
	void exitConnectorBody(BallerinaParser.ConnectorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#actionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterActionDefinition(BallerinaParser.ActionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#actionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitActionDefinition(BallerinaParser.ActionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(BallerinaParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(BallerinaParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(BallerinaParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(BallerinaParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#streamletDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStreamletDefinition(BallerinaParser.StreamletDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#streamletDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStreamletDefinition(BallerinaParser.StreamletDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#streamletBody}.
	 * @param ctx the parse tree
	 */
	void enterStreamletBody(BallerinaParser.StreamletBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#streamletBody}.
	 * @param ctx the parse tree
	 */
	void exitStreamletBody(BallerinaParser.StreamletBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#streamingQueryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStreamingQueryDeclaration(BallerinaParser.StreamingQueryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#streamingQueryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStreamingQueryDeclaration(BallerinaParser.StreamingQueryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#privateStructBody}.
	 * @param ctx the parse tree
	 */
	void enterPrivateStructBody(BallerinaParser.PrivateStructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#privateStructBody}.
	 * @param ctx the parse tree
	 */
	void exitPrivateStructBody(BallerinaParser.PrivateStructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#annotationDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDefinition(BallerinaParser.AnnotationDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#annotationDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDefinition(BallerinaParser.AnnotationDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(BallerinaParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(BallerinaParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(BallerinaParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(BallerinaParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#globalVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDefinition(BallerinaParser.GlobalVariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#globalVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDefinition(BallerinaParser.GlobalVariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#transformerDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTransformerDefinition(BallerinaParser.TransformerDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#transformerDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTransformerDefinition(BallerinaParser.TransformerDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#attachmentPoint}.
	 * @param ctx the parse tree
	 */
	void enterAttachmentPoint(BallerinaParser.AttachmentPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#attachmentPoint}.
	 * @param ctx the parse tree
	 */
	void exitAttachmentPoint(BallerinaParser.AttachmentPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(BallerinaParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(BallerinaParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#workerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterWorkerDeclaration(BallerinaParser.WorkerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#workerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitWorkerDeclaration(BallerinaParser.WorkerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#workerDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWorkerDefinition(BallerinaParser.WorkerDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#workerDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWorkerDefinition(BallerinaParser.WorkerDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#globalEndpointDefinition}.
	 * @param ctx the parse tree
	 */
	void enterGlobalEndpointDefinition(BallerinaParser.GlobalEndpointDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#globalEndpointDefinition}.
	 * @param ctx the parse tree
	 */
	void exitGlobalEndpointDefinition(BallerinaParser.GlobalEndpointDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#endpointDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEndpointDeclaration(BallerinaParser.EndpointDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#endpointDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEndpointDeclaration(BallerinaParser.EndpointDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#endpointType}.
	 * @param ctx the parse tree
	 */
	void enterEndpointType(BallerinaParser.EndpointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#endpointType}.
	 * @param ctx the parse tree
	 */
	void exitEndpointType(BallerinaParser.EndpointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(BallerinaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(BallerinaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#builtInTypeName}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInTypeName(BallerinaParser.BuiltInTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#builtInTypeName}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInTypeName(BallerinaParser.BuiltInTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#referenceTypeName}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTypeName(BallerinaParser.ReferenceTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#referenceTypeName}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTypeName(BallerinaParser.ReferenceTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#userDefineTypeName}.
	 * @param ctx the parse tree
	 */
	void enterUserDefineTypeName(BallerinaParser.UserDefineTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#userDefineTypeName}.
	 * @param ctx the parse tree
	 */
	void exitUserDefineTypeName(BallerinaParser.UserDefineTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#anonStructTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAnonStructTypeName(BallerinaParser.AnonStructTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#anonStructTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAnonStructTypeName(BallerinaParser.AnonStructTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#valueTypeName}.
	 * @param ctx the parse tree
	 */
	void enterValueTypeName(BallerinaParser.ValueTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#valueTypeName}.
	 * @param ctx the parse tree
	 */
	void exitValueTypeName(BallerinaParser.ValueTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#builtInReferenceTypeName}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInReferenceTypeName(BallerinaParser.BuiltInReferenceTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#builtInReferenceTypeName}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInReferenceTypeName(BallerinaParser.BuiltInReferenceTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(BallerinaParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(BallerinaParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#xmlNamespaceName}.
	 * @param ctx the parse tree
	 */
	void enterXmlNamespaceName(BallerinaParser.XmlNamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#xmlNamespaceName}.
	 * @param ctx the parse tree
	 */
	void exitXmlNamespaceName(BallerinaParser.XmlNamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#xmlLocalName}.
	 * @param ctx the parse tree
	 */
	void enterXmlLocalName(BallerinaParser.XmlLocalNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#xmlLocalName}.
	 * @param ctx the parse tree
	 */
	void exitXmlLocalName(BallerinaParser.XmlLocalNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#annotationAttachment}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationAttachment(BallerinaParser.AnnotationAttachmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#annotationAttachment}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationAttachment(BallerinaParser.AnnotationAttachmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BallerinaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BallerinaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#variableDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitionStatement(BallerinaParser.VariableDefinitionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#variableDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitionStatement(BallerinaParser.VariableDefinitionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#recordLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRecordLiteral(BallerinaParser.RecordLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#recordLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRecordLiteral(BallerinaParser.RecordLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#recordKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterRecordKeyValue(BallerinaParser.RecordKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#recordKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitRecordKeyValue(BallerinaParser.RecordKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#recordKey}.
	 * @param ctx the parse tree
	 */
	void enterRecordKey(BallerinaParser.RecordKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#recordKey}.
	 * @param ctx the parse tree
	 */
	void exitRecordKey(BallerinaParser.RecordKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(BallerinaParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(BallerinaParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#typeInitExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeInitExpr(BallerinaParser.TypeInitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#typeInitExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeInitExpr(BallerinaParser.TypeInitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(BallerinaParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(BallerinaParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#variableReferenceList}.
	 * @param ctx the parse tree
	 */
	void enterVariableReferenceList(BallerinaParser.VariableReferenceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#variableReferenceList}.
	 * @param ctx the parse tree
	 */
	void exitVariableReferenceList(BallerinaParser.VariableReferenceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(BallerinaParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(BallerinaParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void enterIfClause(BallerinaParser.IfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void exitIfClause(BallerinaParser.IfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void enterElseIfClause(BallerinaParser.ElseIfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void exitElseIfClause(BallerinaParser.ElseIfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(BallerinaParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(BallerinaParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(BallerinaParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(BallerinaParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#intRangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntRangeExpression(BallerinaParser.IntRangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#intRangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntRangeExpression(BallerinaParser.IntRangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(BallerinaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(BallerinaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#nextStatement}.
	 * @param ctx the parse tree
	 */
	void enterNextStatement(BallerinaParser.NextStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#nextStatement}.
	 * @param ctx the parse tree
	 */
	void exitNextStatement(BallerinaParser.NextStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(BallerinaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(BallerinaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#forkJoinStatement}.
	 * @param ctx the parse tree
	 */
	void enterForkJoinStatement(BallerinaParser.ForkJoinStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#forkJoinStatement}.
	 * @param ctx the parse tree
	 */
	void exitForkJoinStatement(BallerinaParser.ForkJoinStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(BallerinaParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(BallerinaParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyJoinCondition}
	 * labeled alternative in {@link BallerinaParser#joinConditions}.
	 * @param ctx the parse tree
	 */
	void enterAnyJoinCondition(BallerinaParser.AnyJoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyJoinCondition}
	 * labeled alternative in {@link BallerinaParser#joinConditions}.
	 * @param ctx the parse tree
	 */
	void exitAnyJoinCondition(BallerinaParser.AnyJoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allJoinCondition}
	 * labeled alternative in {@link BallerinaParser#joinConditions}.
	 * @param ctx the parse tree
	 */
	void enterAllJoinCondition(BallerinaParser.AllJoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allJoinCondition}
	 * labeled alternative in {@link BallerinaParser#joinConditions}.
	 * @param ctx the parse tree
	 */
	void exitAllJoinCondition(BallerinaParser.AllJoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#timeoutClause}.
	 * @param ctx the parse tree
	 */
	void enterTimeoutClause(BallerinaParser.TimeoutClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#timeoutClause}.
	 * @param ctx the parse tree
	 */
	void exitTimeoutClause(BallerinaParser.TimeoutClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(BallerinaParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(BallerinaParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauses(BallerinaParser.CatchClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauses(BallerinaParser.CatchClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(BallerinaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(BallerinaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(BallerinaParser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(BallerinaParser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(BallerinaParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(BallerinaParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(BallerinaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(BallerinaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#workerInteractionStatement}.
	 * @param ctx the parse tree
	 */
	void enterWorkerInteractionStatement(BallerinaParser.WorkerInteractionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#workerInteractionStatement}.
	 * @param ctx the parse tree
	 */
	void exitWorkerInteractionStatement(BallerinaParser.WorkerInteractionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invokeWorker}
	 * labeled alternative in {@link BallerinaParser#triggerWorker}.
	 * @param ctx the parse tree
	 */
	void enterInvokeWorker(BallerinaParser.InvokeWorkerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invokeWorker}
	 * labeled alternative in {@link BallerinaParser#triggerWorker}.
	 * @param ctx the parse tree
	 */
	void exitInvokeWorker(BallerinaParser.InvokeWorkerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invokeFork}
	 * labeled alternative in {@link BallerinaParser#triggerWorker}.
	 * @param ctx the parse tree
	 */
	void enterInvokeFork(BallerinaParser.InvokeForkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invokeFork}
	 * labeled alternative in {@link BallerinaParser#triggerWorker}.
	 * @param ctx the parse tree
	 */
	void exitInvokeFork(BallerinaParser.InvokeForkContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#workerReply}.
	 * @param ctx the parse tree
	 */
	void enterWorkerReply(BallerinaParser.WorkerReplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#workerReply}.
	 * @param ctx the parse tree
	 */
	void exitWorkerReply(BallerinaParser.WorkerReplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xmlAttribVariableReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterXmlAttribVariableReference(BallerinaParser.XmlAttribVariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xmlAttribVariableReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitXmlAttribVariableReference(BallerinaParser.XmlAttribVariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleVariableReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVariableReference(BallerinaParser.SimpleVariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleVariableReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVariableReference(BallerinaParser.SimpleVariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invocationReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterInvocationReference(BallerinaParser.InvocationReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invocationReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitInvocationReference(BallerinaParser.InvocationReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionInvocationReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocationReference(BallerinaParser.FunctionInvocationReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionInvocationReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocationReference(BallerinaParser.FunctionInvocationReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldVariableReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterFieldVariableReference(BallerinaParser.FieldVariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldVariableReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitFieldVariableReference(BallerinaParser.FieldVariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapArrayVariableReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterMapArrayVariableReference(BallerinaParser.MapArrayVariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapArrayVariableReference}
	 * labeled alternative in {@link BallerinaParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitMapArrayVariableReference(BallerinaParser.MapArrayVariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(BallerinaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(BallerinaParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(BallerinaParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(BallerinaParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#xmlAttrib}.
	 * @param ctx the parse tree
	 */
	void enterXmlAttrib(BallerinaParser.XmlAttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#xmlAttrib}.
	 * @param ctx the parse tree
	 */
	void exitXmlAttrib(BallerinaParser.XmlAttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocation(BallerinaParser.FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocation(BallerinaParser.FunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(BallerinaParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(BallerinaParser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#invocationArgList}.
	 * @param ctx the parse tree
	 */
	void enterInvocationArgList(BallerinaParser.InvocationArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#invocationArgList}.
	 * @param ctx the parse tree
	 */
	void exitInvocationArgList(BallerinaParser.InvocationArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#invocationArg}.
	 * @param ctx the parse tree
	 */
	void enterInvocationArg(BallerinaParser.InvocationArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#invocationArg}.
	 * @param ctx the parse tree
	 */
	void exitInvocationArg(BallerinaParser.InvocationArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#actionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterActionInvocation(BallerinaParser.ActionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#actionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitActionInvocation(BallerinaParser.ActionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(BallerinaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(BallerinaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(BallerinaParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(BallerinaParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStatement(BallerinaParser.TransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStatement(BallerinaParser.TransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#transactionClause}.
	 * @param ctx the parse tree
	 */
	void enterTransactionClause(BallerinaParser.TransactionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#transactionClause}.
	 * @param ctx the parse tree
	 */
	void exitTransactionClause(BallerinaParser.TransactionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#transactionPropertyInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransactionPropertyInitStatement(BallerinaParser.TransactionPropertyInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#transactionPropertyInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransactionPropertyInitStatement(BallerinaParser.TransactionPropertyInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#transactionPropertyInitStatementList}.
	 * @param ctx the parse tree
	 */
	void enterTransactionPropertyInitStatementList(BallerinaParser.TransactionPropertyInitStatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#transactionPropertyInitStatementList}.
	 * @param ctx the parse tree
	 */
	void exitTransactionPropertyInitStatementList(BallerinaParser.TransactionPropertyInitStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLockStatement(BallerinaParser.LockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#lockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLockStatement(BallerinaParser.LockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#failedClause}.
	 * @param ctx the parse tree
	 */
	void enterFailedClause(BallerinaParser.FailedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#failedClause}.
	 * @param ctx the parse tree
	 */
	void exitFailedClause(BallerinaParser.FailedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#abortStatement}.
	 * @param ctx the parse tree
	 */
	void enterAbortStatement(BallerinaParser.AbortStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#abortStatement}.
	 * @param ctx the parse tree
	 */
	void exitAbortStatement(BallerinaParser.AbortStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#retriesStatement}.
	 * @param ctx the parse tree
	 */
	void enterRetriesStatement(BallerinaParser.RetriesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#retriesStatement}.
	 * @param ctx the parse tree
	 */
	void exitRetriesStatement(BallerinaParser.RetriesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#namespaceDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclarationStatement(BallerinaParser.NamespaceDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#namespaceDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclarationStatement(BallerinaParser.NamespaceDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(BallerinaParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(BallerinaParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryDivMulModExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryDivMulModExpression(BallerinaParser.BinaryDivMulModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryDivMulModExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryDivMulModExpression(BallerinaParser.BinaryDivMulModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOrExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOrExpression(BallerinaParser.BinaryOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOrExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOrExpression(BallerinaParser.BinaryOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xmlLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterXmlLiteralExpression(BallerinaParser.XmlLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xmlLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitXmlLiteralExpression(BallerinaParser.XmlLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueTypeTypeExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueTypeTypeExpression(BallerinaParser.ValueTypeTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueTypeTypeExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueTypeTypeExpression(BallerinaParser.ValueTypeTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLiteralExpression(BallerinaParser.SimpleLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLiteralExpression(BallerinaParser.SimpleLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringTemplateLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringTemplateLiteralExpression(BallerinaParser.StringTemplateLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringTemplateLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringTemplateLiteralExpression(BallerinaParser.StringTemplateLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaFunctionExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunctionExpression(BallerinaParser.LambdaFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaFunctionExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunctionExpression(BallerinaParser.LambdaFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryEqualExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryEqualExpression(BallerinaParser.BinaryEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryEqualExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryEqualExpression(BallerinaParser.BinaryEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRecordLiteralExpression(BallerinaParser.RecordLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRecordLiteralExpression(BallerinaParser.RecordLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(BallerinaParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiteralExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(BallerinaParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAccessExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeAccessExpression(BallerinaParser.TypeAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAccessExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeAccessExpression(BallerinaParser.TypeAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracedExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracedExpression(BallerinaParser.BracedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracedExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracedExpression(BallerinaParser.BracedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableReferenceExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableReferenceExpression(BallerinaParser.VariableReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableReferenceExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableReferenceExpression(BallerinaParser.VariableReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeCastingExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastingExpression(BallerinaParser.TypeCastingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeCastingExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastingExpression(BallerinaParser.TypeCastingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryAndExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAndExpression(BallerinaParser.BinaryAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryAndExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAndExpression(BallerinaParser.BinaryAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryAddSubExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAddSubExpression(BallerinaParser.BinaryAddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryAddSubExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAddSubExpression(BallerinaParser.BinaryAddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversionExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversionExpression(BallerinaParser.TypeConversionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversionExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversionExpression(BallerinaParser.TypeConversionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryCompareExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryCompareExpression(BallerinaParser.BinaryCompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryCompareExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryCompareExpression(BallerinaParser.BinaryCompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code builtInReferenceTypeTypeExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInReferenceTypeTypeExpression(BallerinaParser.BuiltInReferenceTypeTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code builtInReferenceTypeTypeExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInReferenceTypeTypeExpression(BallerinaParser.BuiltInReferenceTypeTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(BallerinaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(BallerinaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableQueryExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTableQueryExpression(BallerinaParser.TableQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableQueryExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTableQueryExpression(BallerinaParser.TableQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(BallerinaParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(BallerinaParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInitExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeInitExpression(BallerinaParser.TypeInitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInitExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeInitExpression(BallerinaParser.TypeInitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryPowExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryPowExpression(BallerinaParser.BinaryPowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryPowExpression}
	 * labeled alternative in {@link BallerinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryPowExpression(BallerinaParser.BinaryPowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#nameReference}.
	 * @param ctx the parse tree
	 */
	void enterNameReference(BallerinaParser.NameReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#nameReference}.
	 * @param ctx the parse tree
	 */
	void exitNameReference(BallerinaParser.NameReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void enterReturnParameters(BallerinaParser.ReturnParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void exitReturnParameters(BallerinaParser.ReturnParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#parameterTypeNameList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeNameList(BallerinaParser.ParameterTypeNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#parameterTypeNameList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeNameList(BallerinaParser.ParameterTypeNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#parameterTypeName}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeName(BallerinaParser.ParameterTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#parameterTypeName}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeName(BallerinaParser.ParameterTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(BallerinaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(BallerinaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(BallerinaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(BallerinaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#defaultableParameter}.
	 * @param ctx the parse tree
	 */
	void enterDefaultableParameter(BallerinaParser.DefaultableParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#defaultableParameter}.
	 * @param ctx the parse tree
	 */
	void exitDefaultableParameter(BallerinaParser.DefaultableParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#restParameter}.
	 * @param ctx the parse tree
	 */
	void enterRestParameter(BallerinaParser.RestParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#restParameter}.
	 * @param ctx the parse tree
	 */
	void exitRestParameter(BallerinaParser.RestParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(BallerinaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(BallerinaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(BallerinaParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(BallerinaParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#simpleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLiteral(BallerinaParser.SimpleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#simpleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLiteral(BallerinaParser.SimpleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#namedArgs}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgs(BallerinaParser.NamedArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#namedArgs}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgs(BallerinaParser.NamedArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#restArgs}.
	 * @param ctx the parse tree
	 */
	void enterRestArgs(BallerinaParser.RestArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#restArgs}.
	 * @param ctx the parse tree
	 */
	void exitRestArgs(BallerinaParser.RestArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#xmlLiteral}.
	 * @param ctx the parse tree
	 */
	void enterXmlLiteral(BallerinaParser.XmlLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#xmlLiteral}.
	 * @param ctx the parse tree
	 */
	void exitXmlLiteral(BallerinaParser.XmlLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#xmlItem}.
	 * @param ctx the parse tree
	 */
	void enterXmlItem(BallerinaParser.XmlItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#xmlItem}.
	 * @param ctx the parse tree
	 */
	void exitXmlItem(BallerinaParser.XmlItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(BallerinaParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(BallerinaParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(BallerinaParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(BallerinaParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(BallerinaParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(BallerinaParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#startTag}.
	 * @param ctx the parse tree
	 */
	void enterStartTag(BallerinaParser.StartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#startTag}.
	 * @param ctx the parse tree
	 */
	void exitStartTag(BallerinaParser.StartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(BallerinaParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(BallerinaParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#emptyTag}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTag(BallerinaParser.EmptyTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#emptyTag}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTag(BallerinaParser.EmptyTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#procIns}.
	 * @param ctx the parse tree
	 */
	void enterProcIns(BallerinaParser.ProcInsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#procIns}.
	 * @param ctx the parse tree
	 */
	void exitProcIns(BallerinaParser.ProcInsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(BallerinaParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(BallerinaParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(BallerinaParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(BallerinaParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#xmlQuotedString}.
	 * @param ctx the parse tree
	 */
	void enterXmlQuotedString(BallerinaParser.XmlQuotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#xmlQuotedString}.
	 * @param ctx the parse tree
	 */
	void exitXmlQuotedString(BallerinaParser.XmlQuotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#xmlSingleQuotedString}.
	 * @param ctx the parse tree
	 */
	void enterXmlSingleQuotedString(BallerinaParser.XmlSingleQuotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#xmlSingleQuotedString}.
	 * @param ctx the parse tree
	 */
	void exitXmlSingleQuotedString(BallerinaParser.XmlSingleQuotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#xmlDoubleQuotedString}.
	 * @param ctx the parse tree
	 */
	void enterXmlDoubleQuotedString(BallerinaParser.XmlDoubleQuotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#xmlDoubleQuotedString}.
	 * @param ctx the parse tree
	 */
	void exitXmlDoubleQuotedString(BallerinaParser.XmlDoubleQuotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#xmlQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterXmlQualifiedName(BallerinaParser.XmlQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#xmlQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitXmlQualifiedName(BallerinaParser.XmlQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#stringTemplateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringTemplateLiteral(BallerinaParser.StringTemplateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#stringTemplateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringTemplateLiteral(BallerinaParser.StringTemplateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#stringTemplateContent}.
	 * @param ctx the parse tree
	 */
	void enterStringTemplateContent(BallerinaParser.StringTemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#stringTemplateContent}.
	 * @param ctx the parse tree
	 */
	void exitStringTemplateContent(BallerinaParser.StringTemplateContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#anyIdentifierName}.
	 * @param ctx the parse tree
	 */
	void enterAnyIdentifierName(BallerinaParser.AnyIdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#anyIdentifierName}.
	 * @param ctx the parse tree
	 */
	void exitAnyIdentifierName(BallerinaParser.AnyIdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(BallerinaParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(BallerinaParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#tableQuery}.
	 * @param ctx the parse tree
	 */
	void enterTableQuery(BallerinaParser.TableQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#tableQuery}.
	 * @param ctx the parse tree
	 */
	void exitTableQuery(BallerinaParser.TableQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#aggregationQuery}.
	 * @param ctx the parse tree
	 */
	void enterAggregationQuery(BallerinaParser.AggregationQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#aggregationQuery}.
	 * @param ctx the parse tree
	 */
	void exitAggregationQuery(BallerinaParser.AggregationQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#streamingQueryStatement}.
	 * @param ctx the parse tree
	 */
	void enterStreamingQueryStatement(BallerinaParser.StreamingQueryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#streamingQueryStatement}.
	 * @param ctx the parse tree
	 */
	void exitStreamingQueryStatement(BallerinaParser.StreamingQueryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(BallerinaParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(BallerinaParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(BallerinaParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(BallerinaParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#selectExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpressionList(BallerinaParser.SelectExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#selectExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpressionList(BallerinaParser.SelectExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpression(BallerinaParser.SelectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpression(BallerinaParser.SelectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(BallerinaParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(BallerinaParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(BallerinaParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(BallerinaParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#streamingAction}.
	 * @param ctx the parse tree
	 */
	void enterStreamingAction(BallerinaParser.StreamingActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#streamingAction}.
	 * @param ctx the parse tree
	 */
	void exitStreamingAction(BallerinaParser.StreamingActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(BallerinaParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(BallerinaParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#setAssignmentClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentClause(BallerinaParser.SetAssignmentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#setAssignmentClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentClause(BallerinaParser.SetAssignmentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#streamingInput}.
	 * @param ctx the parse tree
	 */
	void enterStreamingInput(BallerinaParser.StreamingInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#streamingInput}.
	 * @param ctx the parse tree
	 */
	void exitStreamingInput(BallerinaParser.StreamingInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#joinStreamingInput}.
	 * @param ctx the parse tree
	 */
	void enterJoinStreamingInput(BallerinaParser.JoinStreamingInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#joinStreamingInput}.
	 * @param ctx the parse tree
	 */
	void exitJoinStreamingInput(BallerinaParser.JoinStreamingInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#pattenStreamingInput}.
	 * @param ctx the parse tree
	 */
	void enterPattenStreamingInput(BallerinaParser.PattenStreamingInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#pattenStreamingInput}.
	 * @param ctx the parse tree
	 */
	void exitPattenStreamingInput(BallerinaParser.PattenStreamingInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#pattenStreamingEdgeInput}.
	 * @param ctx the parse tree
	 */
	void enterPattenStreamingEdgeInput(BallerinaParser.PattenStreamingEdgeInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#pattenStreamingEdgeInput}.
	 * @param ctx the parse tree
	 */
	void exitPattenStreamingEdgeInput(BallerinaParser.PattenStreamingEdgeInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(BallerinaParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(BallerinaParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionClause(BallerinaParser.FunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionClause(BallerinaParser.FunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(BallerinaParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(BallerinaParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#queryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterQueryDeclaration(BallerinaParser.QueryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#queryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitQueryDeclaration(BallerinaParser.QueryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#queryDefinition}.
	 * @param ctx the parse tree
	 */
	void enterQueryDefinition(BallerinaParser.QueryDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#queryDefinition}.
	 * @param ctx the parse tree
	 */
	void exitQueryDefinition(BallerinaParser.QueryDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#deprecatedAttachment}.
	 * @param ctx the parse tree
	 */
	void enterDeprecatedAttachment(BallerinaParser.DeprecatedAttachmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#deprecatedAttachment}.
	 * @param ctx the parse tree
	 */
	void exitDeprecatedAttachment(BallerinaParser.DeprecatedAttachmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#deprecatedText}.
	 * @param ctx the parse tree
	 */
	void enterDeprecatedText(BallerinaParser.DeprecatedTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#deprecatedText}.
	 * @param ctx the parse tree
	 */
	void exitDeprecatedText(BallerinaParser.DeprecatedTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#deprecatedTemplateInlineCode}.
	 * @param ctx the parse tree
	 */
	void enterDeprecatedTemplateInlineCode(BallerinaParser.DeprecatedTemplateInlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#deprecatedTemplateInlineCode}.
	 * @param ctx the parse tree
	 */
	void exitDeprecatedTemplateInlineCode(BallerinaParser.DeprecatedTemplateInlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#singleBackTickDeprecatedInlineCode}.
	 * @param ctx the parse tree
	 */
	void enterSingleBackTickDeprecatedInlineCode(BallerinaParser.SingleBackTickDeprecatedInlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#singleBackTickDeprecatedInlineCode}.
	 * @param ctx the parse tree
	 */
	void exitSingleBackTickDeprecatedInlineCode(BallerinaParser.SingleBackTickDeprecatedInlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#doubleBackTickDeprecatedInlineCode}.
	 * @param ctx the parse tree
	 */
	void enterDoubleBackTickDeprecatedInlineCode(BallerinaParser.DoubleBackTickDeprecatedInlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#doubleBackTickDeprecatedInlineCode}.
	 * @param ctx the parse tree
	 */
	void exitDoubleBackTickDeprecatedInlineCode(BallerinaParser.DoubleBackTickDeprecatedInlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#tripleBackTickDeprecatedInlineCode}.
	 * @param ctx the parse tree
	 */
	void enterTripleBackTickDeprecatedInlineCode(BallerinaParser.TripleBackTickDeprecatedInlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#tripleBackTickDeprecatedInlineCode}.
	 * @param ctx the parse tree
	 */
	void exitTripleBackTickDeprecatedInlineCode(BallerinaParser.TripleBackTickDeprecatedInlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#documentationAttachment}.
	 * @param ctx the parse tree
	 */
	void enterDocumentationAttachment(BallerinaParser.DocumentationAttachmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#documentationAttachment}.
	 * @param ctx the parse tree
	 */
	void exitDocumentationAttachment(BallerinaParser.DocumentationAttachmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#documentationTemplateContent}.
	 * @param ctx the parse tree
	 */
	void enterDocumentationTemplateContent(BallerinaParser.DocumentationTemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#documentationTemplateContent}.
	 * @param ctx the parse tree
	 */
	void exitDocumentationTemplateContent(BallerinaParser.DocumentationTemplateContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#documentationTemplateAttributeDescription}.
	 * @param ctx the parse tree
	 */
	void enterDocumentationTemplateAttributeDescription(BallerinaParser.DocumentationTemplateAttributeDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#documentationTemplateAttributeDescription}.
	 * @param ctx the parse tree
	 */
	void exitDocumentationTemplateAttributeDescription(BallerinaParser.DocumentationTemplateAttributeDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#docText}.
	 * @param ctx the parse tree
	 */
	void enterDocText(BallerinaParser.DocTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#docText}.
	 * @param ctx the parse tree
	 */
	void exitDocText(BallerinaParser.DocTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#documentationTemplateInlineCode}.
	 * @param ctx the parse tree
	 */
	void enterDocumentationTemplateInlineCode(BallerinaParser.DocumentationTemplateInlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#documentationTemplateInlineCode}.
	 * @param ctx the parse tree
	 */
	void exitDocumentationTemplateInlineCode(BallerinaParser.DocumentationTemplateInlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#singleBackTickDocInlineCode}.
	 * @param ctx the parse tree
	 */
	void enterSingleBackTickDocInlineCode(BallerinaParser.SingleBackTickDocInlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#singleBackTickDocInlineCode}.
	 * @param ctx the parse tree
	 */
	void exitSingleBackTickDocInlineCode(BallerinaParser.SingleBackTickDocInlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#doubleBackTickDocInlineCode}.
	 * @param ctx the parse tree
	 */
	void enterDoubleBackTickDocInlineCode(BallerinaParser.DoubleBackTickDocInlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#doubleBackTickDocInlineCode}.
	 * @param ctx the parse tree
	 */
	void exitDoubleBackTickDocInlineCode(BallerinaParser.DoubleBackTickDocInlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BallerinaParser#tripleBackTickDocInlineCode}.
	 * @param ctx the parse tree
	 */
	void enterTripleBackTickDocInlineCode(BallerinaParser.TripleBackTickDocInlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BallerinaParser#tripleBackTickDocInlineCode}.
	 * @param ctx the parse tree
	 */
	void exitTripleBackTickDocInlineCode(BallerinaParser.TripleBackTickDocInlineCodeContext ctx);
}