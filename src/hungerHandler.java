import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
 



import org.antlr.v4.runtime.tree.ParseTree;

public class hungerHandler {

	public void handle(ParseTree tree){
		if (tree.getChild(1).getText() == "newRecipe"){
			
		}
		
		
	}
	
	public static void recipeHandler(ParseTree tree) throws IOException 
	{
		//File f = new File("D:\baas.txt");
		
		//if (f.exists()) // faili ei eksisteeri
		//{
			//PrintWriter writer = new PrintWriter("baas.txt", "UTF-8"); // tekitame selle
			//writer.close();
			//System.out.println("Faili ei eksisteeri.");
		//}
		//else
		BufferedWriter writer = new BufferedWriter( new FileWriter( "D:\\baas.txt" , true ) );
		int l = tree.getChildCount();
		writer.append("Recipe: ");
		writer.append(tree.getChild(2).getText());
		writer.append(", Ingredients - ");
		for (int i = 4; i < l-1; i++)
		{
			writer.append(tree.getChild(i).getText());
		}
		writer.newLine();
		writer.close();
		
	}
	
	public static void newFood(ParseTree tree) throws IOException
	{
		java.io.File fail = new java.io.File("D:\\baas.txt");
		java.util.Scanner sc = new java.util.Scanner(fail);
		
		while (sc.hasNextLine())
		{
			String rida = sc.nextLine().toUpperCase();
			String[] tykid = rida.split(" ");
			for (int i = 0; i < tykid.length; i++)
			{
				if (tykid.length - 1 == i)
				{
					break;
				}
				/*if (tykid[i] == "Ingredients")
				{
					
				}*/
			}
		}
	}
	
}










