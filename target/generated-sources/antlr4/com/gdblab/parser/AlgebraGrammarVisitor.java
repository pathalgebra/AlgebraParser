// Generated from com\gdblab\parser\AlgebraGrammar.g4 by ANTLR 4.7.1
package com.gdblab.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgebraGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgebraGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(AlgebraGrammarParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#pathPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathPattern(AlgebraGrammarParser.PathPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#nodePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodePattern(AlgebraGrammarParser.NodePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#edgePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgePattern(AlgebraGrammarParser.EdgePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(AlgebraGrammarParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#partitionSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSelector(AlgebraGrammarParser.PartitionSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#groupSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupSelector(AlgebraGrammarParser.GroupSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#pathSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathSelector(AlgebraGrammarParser.PathSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARBITRARY}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARBITRARY(AlgebraGrammarParser.ARBITRARYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SIMPLE}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIMPLE(AlgebraGrammarParser.SIMPLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TRAIL}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTRAIL(AlgebraGrammarParser.TRAILContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ACYCLIC}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitACYCLIC(AlgebraGrammarParser.ACYCLICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SHORTEST}
	 * labeled alternative in {@link AlgebraGrammarParser#restrictor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSHORTEST(AlgebraGrammarParser.SHORTESTContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#orderby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby(AlgebraGrammarParser.OrderbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#groupby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby(AlgebraGrammarParser.GroupbyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARTITION}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARTITION(AlgebraGrammarParser.PARTITIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GROUP}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGROUP(AlgebraGrammarParser.GROUPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPATH(AlgebraGrammarParser.PATHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARTITIONGROUP}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARTITIONGROUP(AlgebraGrammarParser.PARTITIONGROUPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARTITIONPATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARTITIONPATH(AlgebraGrammarParser.PARTITIONPATHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GROUPPATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGROUPPATH(AlgebraGrammarParser.GROUPPATHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARTITIONGROUPPATH}
	 * labeled alternative in {@link AlgebraGrammarParser#orderbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARTITIONGROUPPATH(AlgebraGrammarParser.PARTITIONGROUPPATHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SOURCE}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSOURCE(AlgebraGrammarParser.SOURCEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TARGET}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTARGET(AlgebraGrammarParser.TARGETContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLENGTH(AlgebraGrammarParser.LENGTHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SOURCETARGET}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSOURCETARGET(AlgebraGrammarParser.SOURCETARGETContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SOURCELENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSOURCELENGTH(AlgebraGrammarParser.SOURCELENGTHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TARGETLENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTARGETLENGTH(AlgebraGrammarParser.TARGETLENGTHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SOURCETARGETLENGTH}
	 * labeled alternative in {@link AlgebraGrammarParser#groupbyoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSOURCETARGETLENGTH(AlgebraGrammarParser.SOURCETARGETLENGTHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negated}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegated(AlgebraGrammarParser.NegatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatenation}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(AlgebraGrammarParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(AlgebraGrammarParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lbl}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbl(AlgebraGrammarParser.LblContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alternation}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternation(AlgebraGrammarParser.AlternationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optional}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(AlgebraGrammarParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reverse}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse(AlgebraGrammarParser.ReverseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(AlgebraGrammarParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link AlgebraGrammarParser#rpq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(AlgebraGrammarParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#rpqrestrictor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpqrestrictor(AlgebraGrammarParser.RpqrestrictorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(AlgebraGrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#pathName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathName(AlgebraGrammarParser.PathNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(AlgebraGrammarParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#complexCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexCondition(AlgebraGrammarParser.ComplexConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(AlgebraGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#compareSym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareSym(AlgebraGrammarParser.CompareSymContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AlgebraGrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(AlgebraGrammarParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(AlgebraGrammarParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(AlgebraGrammarParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AlgebraGrammarParser.NumberContext ctx);
}