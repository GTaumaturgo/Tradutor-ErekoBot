// Generated from Lua.g4 by ANTLR 4.7
package br.unb.erekobot.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LuaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LuaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LuaParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(LuaParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LuaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SemiColon}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemiColon(LuaParser.SemiColonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetupFun}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetupFun(LuaParser.SetupFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopFun}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopFun(LuaParser.LoopFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sensing}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensing(LuaParser.SensingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cleanup}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCleanup(LuaParser.CleanupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetScript}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetScript(LuaParser.GetScriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetScript}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetScript(LuaParser.SetScriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetObject}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetObject(LuaParser.GetObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetHandle}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetHandle(LuaParser.GetHandleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetJoint}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetJoint(LuaParser.SetJointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FirstTimeIf}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstTimeIf(LuaParser.FirstTimeIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FirstTimeAttrib}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstTimeAttrib(LuaParser.FirstTimeAttribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiAttrib}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiAttrib(LuaParser.MultiAttribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(LuaParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Labell}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabell(LuaParser.LabellContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(LuaParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Goto}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(LuaParser.GotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Do}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(LuaParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LuaParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Repeat}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(LuaParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LuaParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LuaParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForMultiAttrib}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForMultiAttrib(LuaParser.ForMultiAttribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDeclaration}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(LuaParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalFuncDeclaration}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalFuncDeclaration(LuaParser.LocalFuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalAttrib}
	 * labeled alternative in {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalAttrib(LuaParser.LocalAttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#retstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetstat(LuaParser.RetstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(LuaParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(LuaParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(LuaParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(LuaParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(LuaParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitWise}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWise(LuaParser.BitWiseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LuaParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(LuaParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(LuaParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(LuaParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nil}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(LuaParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableConstructorr}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstructorr(LuaParser.TableConstructorrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Numberr}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberr(LuaParser.NumberrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(LuaParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(LuaParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivMod(LuaParser.MultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LuaParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(LuaParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Stringg}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringg(LuaParser.StringgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorPowerr}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorPowerr(LuaParser.OperatorPowerrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Retincence}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetincence(LuaParser.RetincenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOperator}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(LuaParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrCat}
	 * labeled alternative in {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrCat(LuaParser.StrCatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(LuaParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(LuaParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Varr}
	 * labeled alternative in {@link LuaParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarr(LuaParser.VarrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link LuaParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(LuaParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LuaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#varSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSuffix(LuaParser.VarSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#nameAndArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAndArgs(LuaParser.NameAndArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LuaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(LuaParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(LuaParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(LuaParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstructor(LuaParser.TableconstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(LuaParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(LuaParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsep(LuaParser.FieldsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOr(LuaParser.OperatorOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAnd(LuaParser.OperatorAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorComparison(LuaParser.OperatorComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorStrcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorStrcat(LuaParser.OperatorStrcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAddSub(LuaParser.OperatorAddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorMulDivMod(LuaParser.OperatorMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorBitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorBitwise(LuaParser.OperatorBitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorUnary(LuaParser.OperatorUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorPower(LuaParser.OperatorPowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LuaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LuaParser.StringContext ctx);
}