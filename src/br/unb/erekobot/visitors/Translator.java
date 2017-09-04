package br.unb.erekobot.visitors;



import java.util.ArrayList;
import java.util.List;

import br.unb.erekobot.parser.LuaBaseVisitor;
import br.unb.erekobot.parser.LuaParser.AddSubContext;
import br.unb.erekobot.parser.LuaParser.AndContext;
import br.unb.erekobot.parser.LuaParser.ArgsContext;
import br.unb.erekobot.parser.LuaParser.BitWiseContext;
import br.unb.erekobot.parser.LuaParser.BlockContext;
import br.unb.erekobot.parser.LuaParser.BreakContext;
import br.unb.erekobot.parser.LuaParser.ChunkContext;
import br.unb.erekobot.parser.LuaParser.CleanupContext;
import br.unb.erekobot.parser.LuaParser.ComparisonContext;
import br.unb.erekobot.parser.LuaParser.DoContext;
import br.unb.erekobot.parser.LuaParser.ExplistContext;
import br.unb.erekobot.parser.LuaParser.FalseContext;
import br.unb.erekobot.parser.LuaParser.FieldContext;
import br.unb.erekobot.parser.LuaParser.FieldlistContext;
import br.unb.erekobot.parser.LuaParser.FieldsepContext;
import br.unb.erekobot.parser.LuaParser.FirstTimeAttribContext;
import br.unb.erekobot.parser.LuaParser.FirstTimeIfContext;
import br.unb.erekobot.parser.LuaParser.ForContext;
import br.unb.erekobot.parser.LuaParser.ForMultiAttribContext;
import br.unb.erekobot.parser.LuaParser.FuncCallContext;
import br.unb.erekobot.parser.LuaParser.FuncDeclarationContext;
import br.unb.erekobot.parser.LuaParser.FuncDefContext;
import br.unb.erekobot.parser.LuaParser.FuncbodyContext;
import br.unb.erekobot.parser.LuaParser.FuncnameContext;
import br.unb.erekobot.parser.LuaParser.FunctioncallContext;
import br.unb.erekobot.parser.LuaParser.FunctiondefContext;
import br.unb.erekobot.parser.LuaParser.GetHandleContext;
import br.unb.erekobot.parser.LuaParser.GetObjectContext;
import br.unb.erekobot.parser.LuaParser.GetScriptContext;
import br.unb.erekobot.parser.LuaParser.GotoContext;
import br.unb.erekobot.parser.LuaParser.IfContext;
import br.unb.erekobot.parser.LuaParser.LabelContext;
import br.unb.erekobot.parser.LuaParser.LabellContext;
import br.unb.erekobot.parser.LuaParser.LocalAttribContext;
import br.unb.erekobot.parser.LuaParser.LocalFuncDeclarationContext;
import br.unb.erekobot.parser.LuaParser.LoopFunContext;
import br.unb.erekobot.parser.LuaParser.MultDivModContext;
import br.unb.erekobot.parser.LuaParser.MultiAttribContext;
import br.unb.erekobot.parser.LuaParser.NameAndArgsContext;
import br.unb.erekobot.parser.LuaParser.NamelistContext;
import br.unb.erekobot.parser.LuaParser.NilContext;
import br.unb.erekobot.parser.LuaParser.NumberContext;
import br.unb.erekobot.parser.LuaParser.NumberrContext;
import br.unb.erekobot.parser.LuaParser.OperatorAddSubContext;
import br.unb.erekobot.parser.LuaParser.OperatorAndContext;
import br.unb.erekobot.parser.LuaParser.OperatorBitwiseContext;
import br.unb.erekobot.parser.LuaParser.OperatorComparisonContext;
import br.unb.erekobot.parser.LuaParser.OperatorMulDivModContext;
import br.unb.erekobot.parser.LuaParser.OperatorOrContext;
import br.unb.erekobot.parser.LuaParser.OperatorPowerContext;
import br.unb.erekobot.parser.LuaParser.OperatorPowerrContext;
import br.unb.erekobot.parser.LuaParser.OperatorStrcatContext;
import br.unb.erekobot.parser.LuaParser.OperatorUnaryContext;
import br.unb.erekobot.parser.LuaParser.OrContext;
import br.unb.erekobot.parser.LuaParser.ParenExpContext;
import br.unb.erekobot.parser.LuaParser.ParlistContext;
import br.unb.erekobot.parser.LuaParser.PrefixExpressionContext;
import br.unb.erekobot.parser.LuaParser.RepeatContext;
import br.unb.erekobot.parser.LuaParser.RetincenceContext;
import br.unb.erekobot.parser.LuaParser.RetstatContext;
import br.unb.erekobot.parser.LuaParser.SemiColonContext;
import br.unb.erekobot.parser.LuaParser.SensingContext;
import br.unb.erekobot.parser.LuaParser.SetJointContext;
import br.unb.erekobot.parser.LuaParser.SetScriptContext;
import br.unb.erekobot.parser.LuaParser.SetupFunContext;
import br.unb.erekobot.parser.LuaParser.StrCatContext;
import br.unb.erekobot.parser.LuaParser.StringContext;
import br.unb.erekobot.parser.LuaParser.StringgContext;
import br.unb.erekobot.parser.LuaParser.TableConstructorrContext;
import br.unb.erekobot.parser.LuaParser.TableconstructorContext;
import br.unb.erekobot.parser.LuaParser.TrueContext;
import br.unb.erekobot.parser.LuaParser.UnaryOperatorContext;
import br.unb.erekobot.parser.LuaParser.VarContext;
import br.unb.erekobot.parser.LuaParser.VarSuffixContext;
import br.unb.erekobot.parser.LuaParser.WhileContext;

public class Translator extends LuaBaseVisitor<String>{
	int tabCount = -1;
	
	List<String> var_list = new ArrayList<String>();
	
	private String tabulacao(){
		String acc = "";
		for(int j = 0; j < tabCount; j++)
			acc += "\t";
		return acc;
	}
	
	public List<String> getVars(){
		return var_list;
	}

	
	public String visitChunk(ChunkContext ctx){
		return visit(ctx.block());
	}
	public String visitSetupFun(SetupFunContext ctx){
		return "void setup(){\n" + visit(ctx.block()) + "}\n";
	}
	
	
	public String visitLoopFun(LoopFunContext ctx){
		return "void loop(){\n\tdelay(17);\n" + visit(ctx.block()) + "}\n";
	}
	
	public String visitSensing(SensingContext ctx){
		return "";
	}
	
	public String visitGetScript(GetScriptContext ctx){
		return "";
	}
	
	public String visitGetHandle(GetHandleContext ctx){
		return "";
	}
	public String visitGetObject(GetObjectContext ctx){
		return "";
	}
	public String visitSetJoint(SetJointContext ctx){
		return "Motor.write(((" + visit(ctx.exp(1)) + ") * 180/ 3.14159265) + 90 )";
	}
	public String visitFirstTimeIf(FirstTimeIfContext ctx){
		return "";
	}
	public String visitSetScript(SetScriptContext ctx){
		return "";
	}
	public String visitFirstTimeAttrib(FirstTimeAttribContext ctx){
		return "";
	}
	
	public String visitCleanup(CleanupContext ctx){
		return "";
	}
	
	
			
		public String visitBlock(BlockContext ctx){
			tabCount ++;
			String result = "";
			String temp;
			for(int i = 0; i < ctx.stat().size();i++){
				temp =  visit(ctx.stat(i));
				if(!temp.equals("")){
					result += tabulacao();
					result += temp + ";\n";
				}
			}
			
			if(ctx.retstat() != null)
				result += visit(ctx.retstat());
			tabCount--;
			return result;
	}
	
	public String visitRetstat(RetstatContext ctx){
		return "return " + visit(ctx.explist()) + ';';
	}


	@Override
	public String visitSemiColon(SemiColonContext ctx) {
		return ";";
	}

	@Override
	public String visitMultiAttrib(MultiAttribContext ctx) {
		int n = ctx.explist().exp().size();
		String acc = "";
		for(int i = 0; i < n; i++){
			if(ctx.explist().exp(i).getText().contains("{"))// Se é declaração de lista, ignore
				continue;
			acc += visit(ctx.varlist().var(i)) + " = " + visit(ctx.explist().exp(i));
			if(i != n-1)
				acc += '\n';
		}
		
		return acc;
	}

	@Override
	public String visitFuncCall(FuncCallContext ctx) {
		String acc = "";
		int n = ctx.functioncall().nameAndArgs().size();
		acc += visit(ctx.functioncall().varOrExp());
		if(n > 0)
		{
			acc += "(";
			acc += visit(ctx.functioncall().nameAndArgs(0));
		}
		for(int i = 1; i < n; i++){
			acc += "," + visit(ctx.functioncall().nameAndArgs(i));
		}
		
		if(n>0)
			acc += ")";
		
		return acc;
	}

	@Override
	public String visitBreak(BreakContext ctx) {
		return "break";
	}

	@Override
	public String visitGoto(GotoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitDo(DoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitWhile(WhileContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitRepeat(RepeatContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitIf(IfContext ctx) {
			int n = ctx.exp().size();
		String acc = "";
		
		
		acc += "if(" + visit(ctx.exp(0)) + "){\n" + visit(ctx.block(0)) + "\n";
		acc += tabulacao();
		acc += "}\n";
		
		for(int i = 1;i < n; i++){
			acc += "else if(" + visit(ctx.exp(i)) + "){\n" + visit(ctx.block(i)) + "\n}\n";
			if(i == n-1)
				acc += "else{\n" + visit(ctx.block(1)) + "\n}\n";
			
		}
		
		return acc;
	}

	@Override
	public String visitFor(ForContext ctx) {
		
		String acc = "";
		addVar(ctx.NAME().getText());
		acc +="for(" + ctx.NAME().getText() + " = " + visit(ctx.exp(0)) + "; " +
		ctx.NAME() + " < " + visit(ctx.exp(1)) + ";";
		if(ctx.exp(2)== null)
			acc += ctx.NAME().getText() + "+= 1";
		else
			acc += ctx.NAME().getText() + "+=" + visit(ctx.exp(2));
		acc += "){\n" + visit(ctx.block()) + "\n";
		acc += tabulacao() + "}\n";
		return acc;
	}

	@Override
	public String visitForMultiAttrib(ForMultiAttribContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitFuncDeclaration(FuncDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return "TYPE " + visit(ctx.funcname()) + " " + visit(ctx.funcbody());
	}
	@Override
	public String visitLocalFuncDeclaration(LocalFuncDeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitLocalAttrib(LocalAttribContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitLabel(LabelContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitFuncname(FuncnameContext ctx) {
		// TODO Auto-generated method stub
		return ctx.getText();
	}



	@Override
	public String visitNamelist(NamelistContext ctx){
		int n = ctx.NAME().size();
		String result = "";
			
		if (ctx.parent instanceof ParlistContext)
			result += "TYPE ";
		if (n > 0)
			result += ctx.NAME(0).getText();
		for(int i = 1; i < n; i++){
			if (ctx.parent instanceof ParlistContext)
				result += "TYPE ";
			result += ',' + ctx.NAME(i).getText();
		}
		
		return result;
	}

	@Override
	public String visitExplist(ExplistContext ctx) {
		if(ctx.parent instanceof RetstatContext)
			return visit(ctx.exp(0));
		else if(ctx.parent instanceof ArgsContext){
			String acc = "";
			int n = ctx.exp().size();
			if(n > 0)
			{
				acc += visit(ctx.exp(0));
			}
			for(int i = 1; i < n; i++){
				acc += "," + visit(ctx.exp(i));
			}

			return acc;
		
		}
		else return null;
	}



	@Override
	public String visitFunctioncall(FunctioncallContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public String visitVar(VarContext ctx) {
		addVar(ctx.getText());
		return ctx.getText();
	}

	
	private void addVar(String text) {
		if(text.indexOf("[") > -1){


			return;
		}

		int n = var_list.size();
		for(int i = 0; i < n ; i++){
			if(var_list.get(i).equals(text)){
				return;
			}
		}
		
		var_list.add(text);
		
	}

	@Override
	public String visitParenExp(ParenExpContext ctx) {
		return  "(" + visit(ctx.exp())+ ")";
	}
	@Override
	public String visitVarSuffix(VarSuffixContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitNameAndArgs(NameAndArgsContext ctx) {

		return visit(ctx.args());
	}

	@Override
	public String visitArgs(ArgsContext ctx) {
		if(ctx.explist() != null)
			return visit(ctx.explist());
		else{
			System.out.println("alguma possibilidade nao está sendo coberta");
			return visit(ctx.explist());
		}
	}

	@Override
	public String visitFunctiondef(FunctiondefContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitFuncbody(FuncbodyContext ctx) {
		String acc = "";
		acc += ctx.parlist() == null ? "()" : "(" + visit(ctx.parlist()) + "){\n";
		acc += visit(ctx.block());
		acc += "\n}\n";
		return acc;
	}

	@Override
	public String visitParlist(ParlistContext ctx) {
		return visit(ctx.namelist());
	}



	@Override
	public String visitOperatorOr(OperatorOrContext ctx) {
		return " || ";
	}

	@Override
	public String visitOperatorAnd(OperatorAndContext ctx) {
		return " && ";
	}

	@Override
	public String visitOperatorComparison(OperatorComparisonContext ctx) {
		// TODO Auto-generated method stub
		return " == ";
	}

	@Override
	public String visitOperatorStrcat(OperatorStrcatContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitOperatorAddSub(OperatorAddSubContext ctx) {
		return " " + ctx.getText() + " ";
	}

	@Override
	public String visitOperatorMulDivMod(OperatorMulDivModContext ctx) {
		
		return " " + ctx.getText() + " ";
	}

	@Override
	public String visitOperatorBitwise(OperatorBitwiseContext ctx) {
		// TODO Auto-generated method stub
		return ctx.getText();
	}

	@Override
	public String visitOperatorUnary(OperatorUnaryContext ctx) {
		if(ctx.getText().equals("not"))
			return "!";
		else return ctx.getText();
	}

	@Override
	public String visitOperatorPower(OperatorPowerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitString(StringContext ctx) {
		return "string";
	}





	@Override
	public String visitLabell(LabellContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitBitWise(BitWiseContext ctx) {
		// TODO Auto-generated method stub
		return visit(ctx.exp(0)) + visit(ctx.operatorBitwise()) + visit(ctx.exp(1));
	}

	@Override
	public String visitOr(OrContext ctx) {
		// TODO Auto-generated method stub
		return visit(ctx.exp(0)) + visit(ctx.operatorOr()) + visit(ctx.exp(1));
	}

	@Override
	public String visitAddSub(AddSubContext ctx) {
		// TODO Auto-generated method stub
		return   visit(ctx.exp(0)) + visit(ctx.operatorAddSub()) + visit(ctx.exp(1)) ;
	}

	@Override
	public String visitTrue(TrueContext ctx) {
		// TODO Auto-generated method stub
		return "1";
	}

	@Override
	public String visitFalse(FalseContext ctx) {
		// TODO Auto-generated method stub
		return "0";
	}

	@Override
	public String visitTableConstructorr(TableConstructorrContext ctx) {
		// TODO Auto-generated method stub
		return "VETOR";
	}

	@Override
	public String visitNil(NilContext ctx) {
		// TODO Auto-generated method stub
		return "NULL";
	}

	@Override
	public String visitNumberr(NumberrContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitNumber(NumberContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitComparison(ComparisonContext ctx) {
		return visit(ctx.exp(0)) + visit(ctx.operatorComparison()) + visit(ctx.exp(1));
	}

	@Override
	public String visitFuncDef(FuncDefContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitMultDivMod(MultDivModContext ctx) {
		// TODO Auto-generated method stub
		return   visit(ctx.exp(0)) + visit(ctx.operatorMulDivMod()) + visit(ctx.exp(1)) ;
	}

	@Override
	public String visitAnd(AndContext ctx) {
		// TODO Auto-generated method stub
		return visit(ctx.exp(0)) + visit(ctx.operatorAnd()) + visit(ctx.exp(1)) ;

	}

	@Override
	public String visitPrefixExpression(PrefixExpressionContext ctx) {
		String acc = "";
		int n = ctx.prefixexp().nameAndArgs().size();
		if(ctx.prefixexp().varOrExp().getText().equals("math.sin")){
			acc += "sin( " + visit(ctx.prefixexp().nameAndArgs(0)) + ")";
			return acc;
		}
		else if(ctx.prefixexp().varOrExp().getText().equals("math.pi")){
			
			return "3.14159265";
		}
			
		
		
		acc += visit(ctx.prefixexp().varOrExp()) ;
		if(n > 0)
		{
			acc += "(";
			acc += visit(ctx.prefixexp().nameAndArgs(0));
		}
		for(int i = 1; i < n; i++){
			acc += "," + visit(ctx.prefixexp().nameAndArgs(i));
		}
		
		if(n>0)
			acc += ")";
		
		return acc;
	}

	@Override
	public String visitStringg(StringgContext ctx) {
		
		return ctx.getText();
	}

	@Override
	public String visitOperatorPowerr(OperatorPowerrContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitRetincence(RetincenceContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitUnaryOperator(UnaryOperatorContext ctx) {
		
		return "(" + visit(ctx.operatorUnary()) + " " + visit(ctx.exp()) + ")";
	}

	@Override
	public String visitStrCat(StrCatContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitTableconstructor(TableconstructorContext ctx) {
		// TODO Auto-generated method stub
		return "VETOR";
	}

	@Override
	public String visitFieldlist(FieldlistContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitField(FieldContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitFieldsep(FieldsepContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
