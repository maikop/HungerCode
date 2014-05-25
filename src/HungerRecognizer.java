import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;




import antlrgen.hungerLexer;
import antlrgen.hungerParser;
import antlrgen.hungerParser.DefineerimineContext;
import antlrgen.hungerParser.KilogramContext;
import antlrgen.hungerParser.KoodContext;
import antlrgen.hungerParser.LauseContext;
import antlrgen.hungerParser.LitreContext;
import antlrgen.hungerParser.NewFoodContext;
import antlrgen.hungerParser.NewRecipeContext;
import antlrgen.hungerParser.OmistamineContext;
import antlrgen.hungerParser.PieceContext;
import antlrgen.hungerParser.RecipeNameContext;

public class HungerRecognizer {
	
	//static hungerHandler hh;

	public static List<String> hunger(ParseTree tree) throws IOException {
		if (tree instanceof KoodContext){
			System.out.println(tree.getChildCount());
			for (int i = 0; i<tree.getChildCount()-1; i += 2){
				
			System.out.println("1" + i);
			hunger(tree.getChild(i));}
		} else if (tree instanceof LauseContext){
			hunger(tree.getChild(0));
		} else if (tree instanceof DefineerimineContext){
			
			if (tree.getChild(0).getChild(0).getText().equals("Kilogram")){
				hungerHandler.kiloHandler(tree);
			}
			else if (tree.getChild(0).getChild(0).getText().equals("Litre")){
				hungerHandler.litreHandler(tree);
			}
			else if (tree.getChild(0).getChild(0).getText().equals("Piece")){
				hungerHandler.pieceHandler(tree);
			}
			return hunger(tree.getChild(0));
		} else if (tree instanceof NewFoodContext) {
			hungerHandler.foodHandler(tree);
			//return Arrays.asList(tree.getChild(0).getText());
		} else if (tree instanceof NewRecipeContext) {
			hungerHandler.recipeHandler(tree);
			//return Arrays.asList(tree.getChild(0).getText());
			//return Arrays.asList(tree.getChild(0).getText());
		} else if (tree instanceof OmistamineContext){
			
			return Arrays.asList(tree.getChild(0).getText());
		
		} 
		
		else if (tree instanceof KilogramContext) {
			return Arrays.asList(tree.getChild(1).getText());
		} else if (tree instanceof PieceContext) {
			return Arrays.asList(tree.getChild(1).getText());
		} else if (tree instanceof LitreContext) {
			return Arrays.asList(tree.getChild(1).getText());
		} else if (tree instanceof RecipeNameContext) {
			return Arrays.asList(tree.getChild(1).getText());
			//
		}
		else hunger(tree.getChild(0));
		return Arrays.asList("Bon appetit!");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		String uus = "newFood( spaghetti, cow, egg, butter, milk, flour, sugar, fish, True)";
		ANTLRInputStream input = new ANTLRInputStream(uus);
=======
		String fileName = args[0];
		String expr = hungerUtils.getAKTKFileContent(fileName);
		System.out.println(expr);
		ANTLRInputStream input = new ANTLRInputStream(expr);
>>>>>>> 10bb68210467e1db71855cace6311a16862581b5
		hungerLexer lexer = new hungerLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		hungerParser parser = new hungerParser(tokens);
		ParseTree tree = parser.kood();
		System.out.println(hunger(tree));

	}

}
