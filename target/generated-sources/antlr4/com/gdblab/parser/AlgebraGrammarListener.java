// Generated from com\gdblab\parser\AlgebraGrammar.g4 by ANTLR 4.7.1
package com.gdblab.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgebraGrammarParser}.
 */
public interface AlgebraGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#pathQuery}.
	 * @param ctx the parse tree
	 */
	void enterPathQuery(AlgebraGrammarParser.PathQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#pathQuery}.
	 * @param ctx the parse tree
	 */
	void exitPathQuery(AlgebraGrammarParser.PathQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(AlgebraGrammarParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(AlgebraGrammarParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#partProj}.
	 * @param ctx the parse tree
	 */
	void enterPartProj(AlgebraGrammarParser.PartProjContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#partProj}.
	 * @param ctx the parse tree
	 */
	void exitPartProj(AlgebraGrammarParser.PartProjContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#groupProj}.
	 * @param ctx the parse tree
	 */
	void enterGroupProj(AlgebraGrammarParser.GroupProjContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#groupProj}.
	 * @param ctx the parse tree
	 */
	void exitGroupProj(AlgebraGrammarParser.GroupProjContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#pathProj}.
	 * @param ctx the parse tree
	 */
	void enterPathProj(AlgebraGrammarParser.PathProjContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#pathProj}.
	 * @param ctx the parse tree
	 */
	void exitPathProj(AlgebraGrammarParser.PathProjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WALK}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void enterWALK(AlgebraGrammarParser.WALKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WALK}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void exitWALK(AlgebraGrammarParser.WALKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TRAIL}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void enterTRAIL(AlgebraGrammarParser.TRAILContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TRAIL}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void exitTRAIL(AlgebraGrammarParser.TRAILContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SIMPLE}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void enterSIMPLE(AlgebraGrammarParser.SIMPLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SIMPLE}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void exitSIMPLE(AlgebraGrammarParser.SIMPLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ACYCLIC}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void enterACYCLIC(AlgebraGrammarParser.ACYCLICContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ACYCLIC}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void exitACYCLIC(AlgebraGrammarParser.ACYCLICContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SHORTEST}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void enterSHORTEST(AlgebraGrammarParser.SHORTESTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SHORTEST}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor_ext}.
	 * @param ctx the parse tree
	 */
	void exitSHORTEST(AlgebraGrammarParser.SHORTESTContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#orderby}.
	 * @param ctx the parse tree
	 */
	void enterOrderby(AlgebraGrammarParser.OrderbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#orderby}.
	 * @param ctx the parse tree
	 */
	void exitOrderby(AlgebraGrammarParser.OrderbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#groupby}.
	 * @param ctx the parse tree
	 */
	void enterGroupby(AlgebraGrammarParser.GroupbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#groupby}.
	 * @param ctx the parse tree
	 */
	void exitGroupby(AlgebraGrammarParser.GroupbyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARTITION}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void enterPARTITION(AlgebraGrammarParser.PARTITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARTITION}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void exitPARTITION(AlgebraGrammarParser.PARTITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GROUP}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void enterGROUP(AlgebraGrammarParser.GROUPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GROUP}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void exitGROUP(AlgebraGrammarParser.GROUPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void enterPATH(AlgebraGrammarParser.PATHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void exitPATH(AlgebraGrammarParser.PATHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARTITIONGROUP}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void enterPARTITIONGROUP(AlgebraGrammarParser.PARTITIONGROUPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARTITIONGROUP}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void exitPARTITIONGROUP(AlgebraGrammarParser.PARTITIONGROUPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARTITIONPATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void enterPARTITIONPATH(AlgebraGrammarParser.PARTITIONPATHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARTITIONPATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void exitPARTITIONPATH(AlgebraGrammarParser.PARTITIONPATHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GROUPPATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void enterGROUPPATH(AlgebraGrammarParser.GROUPPATHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GROUPPATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void exitGROUPPATH(AlgebraGrammarParser.GROUPPATHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARTITIONGROUPPATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void enterPARTITIONGROUPPATH(AlgebraGrammarParser.PARTITIONGROUPPATHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARTITIONGROUPPATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 */
	void exitPARTITIONGROUPPATH(AlgebraGrammarParser.PARTITIONGROUPPATHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SOURCE}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void enterSOURCE(AlgebraGrammarParser.SOURCEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SOURCE}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void exitSOURCE(AlgebraGrammarParser.SOURCEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TARGET}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void enterTARGET(AlgebraGrammarParser.TARGETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TARGET}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void exitTARGET(AlgebraGrammarParser.TARGETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void enterLENGTH(AlgebraGrammarParser.LENGTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void exitLENGTH(AlgebraGrammarParser.LENGTHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SOURCETARGET}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void enterSOURCETARGET(AlgebraGrammarParser.SOURCETARGETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SOURCETARGET}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void exitSOURCETARGET(AlgebraGrammarParser.SOURCETARGETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SOURCELENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void enterSOURCELENGTH(AlgebraGrammarParser.SOURCELENGTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SOURCELENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void exitSOURCELENGTH(AlgebraGrammarParser.SOURCELENGTHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TARGETLENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void enterTARGETLENGTH(AlgebraGrammarParser.TARGETLENGTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TARGETLENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void exitTARGETLENGTH(AlgebraGrammarParser.TARGETLENGTHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SOURCETARGETLENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void enterSOURCETARGETLENGTH(AlgebraGrammarParser.SOURCETARGETLENGTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SOURCETARGETLENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 */
	void exitSOURCETARGETLENGTH(AlgebraGrammarParser.SOURCETARGETLENGTHContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#pathPattern}.
	 * @param ctx the parse tree
	 */
	void enterPathPattern(AlgebraGrammarParser.PathPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#pathPattern}.
	 * @param ctx the parse tree
	 */
	void exitPathPattern(AlgebraGrammarParser.PathPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#nodePattern}.
	 * @param ctx the parse tree
	 */
	void enterNodePattern(AlgebraGrammarParser.NodePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#nodePattern}.
	 * @param ctx the parse tree
	 */
	void exitNodePattern(AlgebraGrammarParser.NodePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#edgePattern}.
	 * @param ctx the parse tree
	 */
	void enterEdgePattern(AlgebraGrammarParser.EdgePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#edgePattern}.
	 * @param ctx the parse tree
	 */
	void exitEdgePattern(AlgebraGrammarParser.EdgePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negated}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void enterNegated(AlgebraGrammarParser.NegatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negated}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void exitNegated(AlgebraGrammarParser.NegatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(AlgebraGrammarParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(AlgebraGrammarParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void enterStar(AlgebraGrammarParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void exitStar(AlgebraGrammarParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lbl}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void enterLbl(AlgebraGrammarParser.LblContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lbl}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void exitLbl(AlgebraGrammarParser.LblContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alternation}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void enterAlternation(AlgebraGrammarParser.AlternationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alternation}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void exitAlternation(AlgebraGrammarParser.AlternationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optional}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void enterOptional(AlgebraGrammarParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optional}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void exitOptional(AlgebraGrammarParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reverse}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void enterReverse(AlgebraGrammarParser.ReverseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reverse}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void exitReverse(AlgebraGrammarParser.ReverseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(AlgebraGrammarParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(AlgebraGrammarParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void enterPlus(AlgebraGrammarParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 */
	void exitPlus(AlgebraGrammarParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#rpqrestrictor}.
	 * @param ctx the parse tree
	 */
	void enterRpqrestrictor(AlgebraGrammarParser.RpqrestrictorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#rpqrestrictor}.
	 * @param ctx the parse tree
	 */
	void exitRpqrestrictor(AlgebraGrammarParser.RpqrestrictorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(AlgebraGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(AlgebraGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#pathName}.
	 * @param ctx the parse tree
	 */
	void enterPathName(AlgebraGrammarParser.PathNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#pathName}.
	 * @param ctx the parse tree
	 */
	void exitPathName(AlgebraGrammarParser.PathNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(AlgebraGrammarParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(AlgebraGrammarParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#complexCondition}.
	 * @param ctx the parse tree
	 */
	void enterComplexCondition(AlgebraGrammarParser.ComplexConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#complexCondition}.
	 * @param ctx the parse tree
	 */
	void exitComplexCondition(AlgebraGrammarParser.ComplexConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AlgebraGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AlgebraGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#compareSym}.
	 * @param ctx the parse tree
	 */
	void enterCompareSym(AlgebraGrammarParser.CompareSymContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#compareSym}.
	 * @param ctx the parse tree
	 */
	void exitCompareSym(AlgebraGrammarParser.CompareSymContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AlgebraGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AlgebraGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(AlgebraGrammarParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(AlgebraGrammarParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(AlgebraGrammarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(AlgebraGrammarParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(AlgebraGrammarParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(AlgebraGrammarParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AlgebraGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AlgebraGrammarParser.NumberContext ctx);
}