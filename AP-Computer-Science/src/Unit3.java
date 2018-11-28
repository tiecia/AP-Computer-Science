import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Unit3 {

	public static void main(String[] args) throws IOException {
		exercise3();
		//exercise7_2();
		//arrayPopulation();
		//arrayTable();
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
	
	@SuppressWarnings("resource")
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
			System.out.println(counter + "\t" + values[counter]);
		}
	}
	
	public static void exercise7_1(){
		while(true) {
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			Random rand = new Random();
			int [] numOfRoles = new int[6];
			for(int i = 0; i < num; i++) {
				int randNum = rand.nextInt(6) + 1;
				numOfRoles[randNum - 1]++;
			}
			System.out.println("Number\tTimes Rolled");
			for(int i = 0; i < 6; i++) {
				System.out.println((i+1) + "\t" + numOfRoles[i]);
			}
		}
	}
	
	public static void exercise7_2() {
		while(true) {
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			Random rand = new Random();
			int [] numOfRoles1 = new int[6];
//			System.out.println("\tDie 1");
			for(int i = 0; i < num; i++) {
				int randNum = rand.nextInt(6) + 1;
				numOfRoles1[randNum - 1]++;
			}
//			System.out.println("Number\tTimes Rolled");
//			for(int i = 0; i < 6; i++) {
//				System.out.println((i+1) + "\t" + numOfRoles1[i]);
//			}
			System.out.println();
			System.out.println();
			System.out.println("\tDie 1 and 2");
			for(int i = 0; i < num; i++) {
				int randNum = rand.nextInt(6) + 1;
				numOfRoles1[randNum - 1]++;
			}
			System.out.println("Number\tTimes Rolled");
			for(int i = 0; i < 6; i++) {
				System.out.println((i+1) + "\t" + numOfRoles1[i]);
			}
		}
	}
	
	public static void exercise7_3(){
		Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(input).useDelimiter("");
		String scanned = scan.next();
		if(s.equals("A") || s.equals("a")) {
			return 
		} else if(s.equals("B") || s.equals("b")) {
			return 1;
		} else if(s.equals("C") || s.equals("c")) {
			return 2;
		} else if(s.equals("D") || s.equals("d")) {
			return 3;
		} else if(s.equals("E") || s.equals("e")) {
			return 4;
		} else if(s.equals("F") || s.equals("f")) {
			return 5;
		} else if(s.equals("G") || s.equals("g")) {
			return 6;
		} else if(s.equals("H") || s.equals("h")) {
			return 7;
		} else if(s.equals("I") || s.equals("i")) {
			return 8;
		} else if(s.equals("J") || s.equals("j")) {
			return 9;
		} else if(s.equals("K") || s.equals("k")) {
			return 10;
		} else if(s.equals("L") || s.equals("l")) {
			return 11;
		} else if(s.equals("M") || s.equals("m")) {
			return 12;
		} else if(s.equals("N") || s.equals("n")) {
			return 13;
		} else if(s.equals("O") || s.equals("o")) {
			return 14;
		} else if(s.equals("P") || s.equals("p")) {
			return 15;
		} else if(s.equals("Q") || s.equals("q")) {
			return 16;
		} else if(s.equals("R") || s.equals("r")) {
			return 17;
		} else if(s.equals("S") || s.equals("s")) {
			return 18;
		} else if(s.equals("T") || s.equals("t")) {
			return 19;
		} else if(s.equals("U") || s.equals("u")) {
			return 20;
		} else if(s.equals("V") || s.equals("v")) {
			return 21;
		} else if(s.equals("W") || s.equals("w")) {
			return 22;
		} else if(s.equals("X") || s.equals("x")) {
			return 23;
		} else if(s.equals("Y") || s.equals("y")) {
			return 24;
		} else if(s.equals("Z") || s.equals("z")) {
			return 25;
		} else {
			return -1;
		}
	}
}




