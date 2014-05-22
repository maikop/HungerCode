import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlrgen.hungerLexer;
import antlrgen.hungerParser;
import antlrgen.hungerParser.KoodContext;
import antlrgen.hungerParser.LauseContext;
import antlrgen.hungerParser.LitreContext;
import antlrgen.hungerParser.NewRecipeContext;
import antlrgen.hungerParser.PieceContext;
import antlrgen.hungerParser.RecipeNameContext;

public class HungerRecognizer {

	public static List<String> hunger(ParseTree tree) {
		// if (tree instanceof NewRecipeContext){
		// return Arrays.asList(tree.getChild(0).getText());
		// }
		if (tree instanceof KoodContext){
			return hunger(tree.getChild(0));
		}
		else if (tree instanceof LauseContext){
			return hunger(tree.getChild(0));
		}
		else if (tree instanceof PieceContext) {
			return Arrays.asList(tree.getChild(1).getText());
		} else if (tree instanceof LitreContext) {
			return Arrays.asList(tree.getChild(1).getText());
		} else if (tree instanceof RecipeNameContext) {
			return Arrays.asList(tree.getChild(1).getText());
		}
		return Arrays.asList("lol");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uus = "\"bannan\"";
		ANTLRInputStream input = new ANTLRInputStream(uus);
		hungerLexer lexer = new hungerLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		hungerParser parser = new hungerParser(tokens);
		ParseTree tree = parser.kood();
		System.out.println(hunger(tree));

	}

}
