import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class hungerUtils {
	public static Map<String, Integer> getVariablesFromCmdLine(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		for (int i=0; i < args.length; i += 2) {
			map.put(args[i], Integer.parseInt(args[i+1]));
		}
		
		return map;
	}
	
	public static String[] parseExpression(String expr) {
		String preparedExpr = expr.trim();
		
		return preparedExpr.split("\\s+");
	}
	
	public static String getAKTKFileContent(String filename) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(filename));
		String expr = sc.nextLine(); 
		while (sc.hasNextLine()){
			expr += (sc.nextLine());
		}
		sc.close();
		return expr;
	}
}
