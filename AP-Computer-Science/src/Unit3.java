import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Unit3 {

	public static void main(String[] args) throws IOException {
		//exercise3();
		//arrayPopulation();
		arrayTable();
	}
	
	@SuppressWarnings("resource")
	public static void exercise1() throws FileNotFoundException {
		String fileName = "textFile.txt";
		File f = new File(fileName);
		if(f.exists()) {
			int totalCount = 0;
			int evenCount = 0;
			Scanner parseFile = new Scanner(f);
			int sum = 0;
			while(parseFile.hasNext()) {
				int number = parseFile.nextInt();
				sum += number;
				totalCount ++;
				if(isEven(number)) {
					evenCount ++;
				}
			}
			
			double pers = ((double)evenCount/(double)totalCount) * 100;
			System.out.println("Numbers: " + totalCount);
			System.out.println("Even Numbers: " + evenCount + "(" + pers +"%)");
			System.out.println("Sum: " + sum);
		} else {
			System.out.println("File Not Found");
		}
	}
	
	public static boolean isEven(int n){
		if(n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@SuppressWarnings("resource")
	public static void exercise2() throws FileNotFoundException {
		String file = "Ex3_2_Input.txt";
		File f = new File(file);
		Scanner s = new Scanner(f);
		while(s.hasNext()) {
			System.out.println(stripComments(s.nextLine()));
		}
	}
	
	@SuppressWarnings("resource")
	public static String stripComments(String s) {
		Scanner parseFile = new Scanner(s);
		while(parseFile.hasNextLine()) {
			String token = parseFile.next();
			String line = null;
			if(parseFile.hasNextLine()) {
				line = parseFile.nextLine();	
			}
			
			if(!(token.contains("/") || token.contains("*"))) {
				if(line != null) {
					return token + " " + line;
				} else {
					return token;
				}
			} else {
				return " ";
			}
		}
		return "";
	}
	
	@SuppressWarnings("resource")
	public static void exercise3() throws IOException {
		String inputFilePath = "Ex3_2_Input.txt";
		String outputFilePath = "Stripped_Output.txt";
		File inputFile = new File(inputFilePath);
		File outputFile = new File(outputFilePath);
		Scanner s = new Scanner(inputFile);
		if(!outputFile.exists()){
			outputFile.createNewFile();
		} else {
			outputFile.delete();
			outputFile.createNewFile();
		}
		PrintStream p = new PrintStream(outputFile);
		while(s.hasNext()) {
			p.println(stripComments(s.nextLine()));
		}
	}
	
	public static void arrayPopulation() {
		Scanner input = new Scanner(System.in);
		int values[] = new int[10];
		int workingIndex = 0;
		while(input.hasNext() && workingIndex<values.hashCode()) {
			values[workingIndex] = input.nextInt();
			workingIndex++;
		}
		System.out.println("Array Full");
	}
	
	public static void arrayTable() {
		System.out.println("Index" + "\t" + "Value");
		int values[] = {1,5,76,34,89,34,52,78,100,56};
		for(int counter = 0; counter < values.length; counter++) {
			System.out.println(counter + "/t" + values[counter]);
		}
	}
	
	
	
}




