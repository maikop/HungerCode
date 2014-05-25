import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
 




import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.tree.ParseTree;

public class hungerHandler {

	public void handle(ParseTree tree){
		if (tree.getChild(1).getText() == "newRecipe"){
		}
		
	}
	
	public static void recipeHandler(ParseTree tree) throws IOException 
	{
		java.io.File recipe = new java.io.File("recipe.txt");
		recipe.createNewFile();		// kui olemas, loob uue faili, kui pole, tagastab false
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("recipe.txt", true));
		int l = tree.getChildCount();
		writer.append(tree.getChild(2).getText());
		writer.append(";"); 		// kirjutab faili kujul "recipeName";ingredient1,ingr2,...
		for (int i = 4; i < l-1; i++)
		{
			writer.append(tree.getChild(i).getText());
		}
		writer.newLine();
		writer.close();
		
	}
	
	public static void foodHandler(ParseTree tree) throws IOException
	{
		java.io.File fail = new java.io.File("recipe.txt");
		java.util.Scanner sc = new java.util.Scanner(fail);
		HashMap<String, ArrayList<String>> recipeMap = new HashMap<String, ArrayList<String>>();
		
		while (sc.hasNextLine())
		{
			String rida = sc.nextLine().toUpperCase();
			String[] tykid = rida.split("[,;]");
			String key = tykid[0];					// see on recipeName, läheb võtmeks
			ArrayList<String> ingredients = new ArrayList<String>();
			for (int i = 1; i < tykid.length; i++)
			{
				ingredients.add(tykid[i]);			// need on ingredientid, lähevad listina mapi väärtuseks
			}
			recipeMap.put(key, ingredients); 		// Map<recipeName, listWithIngredients[]>
		}
		sc.close();
		
		Set<String> keys = recipeMap.keySet();
		
		for(String key : keys){
			if (recipeMap.get(key).contains(tree.getChild(2).getText().toUpperCase()))
				// pmst 'if recipeName.ingredients contains "newFoodiArgument", siis prindib välja'
			{
				System.out.print(key + ": ");		// kujul "recipeName: ingr1 ingr2 ..."
				for(String ingredient : recipeMap.get(key))
				{
					System.out.print(ingredient + " ");
				}
				System.out.println();				// new line :)
			}
		}
	}
	
}










