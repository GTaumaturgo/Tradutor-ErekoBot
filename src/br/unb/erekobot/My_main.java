package br.unb.erekobot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import br.unb.erekobot.parser.LuaLexer;
import br.unb.erekobot.parser.LuaParser;
import br.unb.erekobot.visitors.Translator;

public class My_main {

	public static void main(String[] args) {
		ANTLRInputStream input;
//		View  mView = new View();
		try {
			input = new ANTLRInputStream(getFileContent("./src/br/unb/erekobot/parser/input.demo"));
			LuaLexer lexer = new LuaLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			LuaParser parser = new LuaParser(tokens);
			ParseTree tree = parser.chunk();
			Translator t = new Translator();
			FileWriter fw = new FileWriter("./output/output.txt");
			fw.write(t.visit(tree));
			
			
			fw.close();
			
			
			
			String str = getFileContent("./output/output.txt");
			fw = new FileWriter("./output/output.txt");
			String procurada = "void setup(){\n";
			
			String antes = str.substring(0,str.indexOf(procurada));
			String depois = str.substring(procurada.length()+ str.indexOf(procurada));
			fw.write(antes);
			fw.write(procurada);
			fw.write(getFileContent("./output/setup.txt"));
			fw.write(depois);
			fw.close();
			
			Map <String,String> fixed_types = new HashMap<>();
			str = getFileContent("./output/types.txt");
			String[] lines = str.split("\n");
			for(String line:lines){
				String[] temp = line.split(" ");
				System.out.println(temp[1]);
				fixed_types.put(temp[1], temp[0]);
			}
			str = getFileContent("./output/output.txt");

			
			fw = new FileWriter("./output/output.txt");
			fw.write(getFileContent("./output/header.txt"));
			List<String> vars = t.getVars();
			Map <String,String> def_types = new HashMap<>();
			for(String s:vars){
				if(fixed_types.get(s) != null)
				{ 
					def_types.put(s, fixed_types.get(s));
				}
				else{
					
					def_types.put(s, "float");
				}
				
			}
			
			
			for(int i = 0; i < vars.size(); i++){
				if(def_types.get(vars.get(i)).indexOf("[") > 0){ //Se for um vetor, escreva diferenciadamente
					String raw = def_types.get(vars.get(i));
					String name = raw.substring(0,raw.indexOf("[")); 
					String rest = raw.substring(raw.indexOf("["));
					
					fw.write(name + " "+ vars.get(i) + rest +";\n");
				}
				else{
					
					fw.write(def_types.get(vars.get(i)) + " "+ vars.get(i) + ";\n");
				}
			}
			
			fw.write(str);
			fw.close();
			str = getFileContent("./output/output.txt");
			fw = new FileWriter("./output/output.txt");
			String[] lista = str.split("\n");
			int n =  lista.length;
			List<String> nova = new ArrayList<String>();
			for(int i = 0; i < n; i++){
				if(!lista[i].equals(";")){
					fw.write(lista[i] + "\n");
				}
			}
			
			fw.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

	
	private static String getFileContent(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String everything;
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		} finally {
	
			br.close();
		}
		return everything;
	}


}
