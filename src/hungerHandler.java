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
import java.util.Collections;

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
		HashMap<Integer, String> ingredientMap = new HashMap<Integer, String>();
		while (sc.hasNextLine())
		{
			String rida = sc.nextLine().toUpperCase();
			String[] tykid = rida.split("[,;=]");
			String key = tykid[0];					// see on recipeName, l�heb v�tmeks
			ArrayList<String> ingredients = new ArrayList<String>();
			for (int i = 1; i < tykid.length; i++)
			{
				ingredients.add(tykid[i]);			// need on ingredientid, l�hevad listina mapi v��rtuseks
			}
			recipeMap.put(key, ingredients); 		// Map<recipeName, listWithIngredients[]>
		}
		sc.close();		
		//System.out.println(tree.getChild(2).getText());
		//tree.getChild(tree.getChildCount()-2).getText();
		String bool = tree.getChild(tree.getChildCount()-2).getText(); 	//kas l�pus on "True" v�i "False"	
		
		if (bool.equals("True"))
		{

			
			for(String key : recipeMap.keySet())
			{
				boolean boo = true;
				String[] arguments = tree.getText().toUpperCase().substring(8, (tree.getText().length()-6)).split(",");
				for (int i = 0; i < recipeMap.get(key).size(); i += 2)
				{	// Kontroll, kas retsept koosneb AINULT newFoodi argumentidest
					
					if (!Arrays.asList(arguments).contains(recipeMap.get(key).toArray()[i]))
					{
						boo = false;
						break;
					}

				}
				// Kui retsept koosneb AINULT newFoodi argumentidest, prindime retsepti v�lja
				if (boo)
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
		
		else
		{
			for(String key : recipeMap.keySet()){
				int counter = 0;			// See osa vaatab, mitu antud ingredienti retseptis olemas on
				for(int i = 2; i<=tree.getChildCount() - 2; i++)
				{
					if (recipeMap.get(key).contains(tree.getChild(i).getText().toUpperCase()))
					{
						counter += 1;		// kui mingi toiduaine on olemas retseptis, increment 1
					}
				}
				
				if (ingredientMap.containsKey(counter))
				{
					ingredientMap.put(counter, ingredientMap.get(counter) +","+ key); 	// map<Ingredientide arv, recipeName>
				}
				else
				{
					ingredientMap.put(counter, key);
				}
			}
			Object[] ingredientList = ingredientMap.keySet().toArray();
			Arrays.sort(ingredientList);
			try
			{
				for(int i = 1; i < 5 ; i++)
				{
					//System.out.println( ingredientMap.get(ingredientList[ingredientList.length - i]) );
					String[] keys = ingredientMap.get(ingredientList[ingredientList.length - i]).split(",");
					for (int j = 0; j < keys.length ; j++)
					{
						String key = keys[j];
						
						{
							System.out.print(key + ": ");		// kujul "recipeName: ingr1 ingr2 ..."
							for(String ingredient : recipeMap.get(key))
							{
								System.out.print(ingredient + " ");
							}
							System.out.print("  (Sul on " + ingredientList[ingredientList.length - i] + " toiduainet olemas)");
							System.out.println();				// new line :)
						}
					}
				}
			}
			catch (ArrayIndexOutOfBoundsException e){}
		}
	}
	
static Map<String, Double> kilo = new HashMap<String, Double>();
	public static void kiloHandler(ParseTree tree){
		String ingredient = tree.getChild(0).getChild(1).getText();
		String value = tree.getChild(2).getText();
		double amount = Double.parseDouble(value);
		if (tree.getChild(3).getText().equals("kg")){
			amount = amount*1000;
		}
		else if (tree.getChild(3).getText().equals("mg")){
			amount = amount/1000;
		}
		kilo.put(ingredient, amount);
		
	}
	static Map<String, Double> litre = new HashMap<String, Double>();
	public static void litreHandler(ParseTree tree){
		String ingredient = tree.getChild(0).getChild(1).getText();
		String value = tree.getChild(2).getText();
		double amount = Double.parseDouble(value);
		if (tree.getChild(3).getText().equals("dl")){
			amount = amount/10;
		}
		else if (tree.getChild(3).getText().equals("ml")){
			amount = amount/1000;
		}
		litre.put(ingredient, amount);
		
	}
	static Map<String, Double> piece = new HashMap<String, Double>();
	public static void pieceHandler(ParseTree tree){
		String ingredient = tree.getChild(0).getChild(1).getText();
		String value = tree.getChild(2).getText();
		double amount = Double.parseDouble(value);
		
		piece.put(ingredient, amount);
	}

}


//System.out.println(recipeMap.get(key).toArray()[i]); print out recipe ingredients

//if( contains(recipeMap.get(key).toArray()[i]) )
//
//	!recipeMap.get(key).contains(tree.getChild(i).getText().toUpperCase())
//{	
//	boo = false;
//	break;
//}





