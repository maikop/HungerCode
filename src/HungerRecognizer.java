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
			return hunger(tree.getChild(0));
		} else if (tree instanceof LauseContext){
			return hunger(tree.getChild(0));
		} else if (tree instanceof DefineerimineContext){
			return hunger(tree.getChild(0));
		} else if (tree instanceof NewFoodContext) {
			hungerHandler.foodHandler(tree);
			//return Arrays.asList(tree.getChild(0).getText());
		} else if (tree instanceof NewRecipeContext) {
			hungerHandler.recipeHandler(tree);
			//return Arrays.asList(tree.getChild(0).getText());
		} else if (tree instanceof OmistamineContext){
			return Arrays.asList(tree.getChild(0).getText());
		} else if (tree instanceof KilogramContext) {
			return Arrays.asList(tree.getChild(1).getText());
		} else if (tree instanceof PieceContext) {
			return Arrays.asList(tree.getChild(1).getText());
		} else if (tree instanceof LitreContext) {
			return Arrays.asList(tree.getChild(1).getText());
		} else if (tree instanceof RecipeNameContext) {
			return Arrays.asList(tree.getChild(1).getText());
			
		}
		return Arrays.asList("Bon appetit!");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String uus = "newFood(egg, fish, sugar, milk, cow, birds, flour, True)";
		ANTLRInputStream input = new ANTLRInputStream(uus);
		hungerLexer lexer = new hungerLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		hungerParser parser = new hungerParser(tokens);
		ParseTree tree = parser.kood();
		System.out.println(hunger(tree));

	}

}
