import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Unit3 {

	public static void main(String[] args) throws IOException {
		//exercise3();
		exercise7_7();
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
	
	@SuppressWarnings("resource")
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
	
	@SuppressWarnings("resource")
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
	
	@SuppressWarnings("resource")
	public static void exercise7_3(){
		Scanner input = new Scanner(System.in);
		String in = input.next();
		char [] letter = new char[26];
		for(int i = 0; i < letter.length; i++) {
			letter[i] = (char) (i+97);
		}
		int [] count = new int[27];
		Scanner parse = new Scanner(in).useDelimiter("");
		for(int i = 0; i < in.length(); i++) {
			int index = (parse.next().charAt(0)) - 97;
			if(!(index < 0 || index > 25)) {
				count[index]++;
			} else {
				count[26]++;
			}
		}
		System.out.println("Letter\tFrequency");
		for(int i = 0; i<26; i++) {
			System.out.println(letter[i] + "\t" + count[i]);
		}
		System.out.println("Other\t" + count[26]);
	}
	
	public static void exercise7_4() {
		int [] nums = {36,12,25,19,46,31,22};
		int large = 0;
		int small = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > large) {
				large = nums[i];
			}
		}
		small = large;
		for(int i = 0; i< nums.length; i++) {
			if(nums[i] < small) {
				small = nums[i];
			}
		}
		System.out.println(large);
		System.out.println(small);
		System.out.println((large-small)+1);
	}
	
	public static void exercise7_5() {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(array));
		shiftR(array);
		System.out.println(Arrays.toString(array));
		System.out.println();
		int newarr[] = shiftRNoModify(array);
		System.out.println(Arrays.toString(newarr));
	}
	
	public static void shiftR(int [] array) {
		int [] cachearr = new int [array.length];
		for(int i = 0; i < array.length - 1; i++) {
			cachearr[i+1] = array[i];
		}
		cachearr[0] = array[array.length - 1];
		for(int i = 0; i < cachearr.length; i++) {
			array[i] = cachearr[i];
		}
	}
	
	public static int[] shiftRNoModify(int [] arr) {
		int [] cachearr = new int [arr.length];
		for(int i = 0; i < arr.length - 1; i++) {
			cachearr[i+1] = arr[i];
		}
		cachearr[0] = arr[arr.length - 1];
		return cachearr;
	}
	
	@SuppressWarnings("resource")
	public static void exercise7_6() {
		System.out.println("Enter Quantity of Numbers:");
		Scanner qinput = new Scanner(System.in);
		int[] nums = new int[qinput.nextInt()];
		int[] adds = new int[nums.length-1];
		System.out.println("Input numbers with a , between each number:");
		Scanner cinput = new Scanner(System.in);
		Scanner ninput = new Scanner(cinput.next()).useDelimiter(",");
		int pinput = 0;
		int input = 0;
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = ninput.nextInt();
			count++;
		}
		for(int i = 0; i<adds.length; i++) {
			adds[i] = nums[i] + nums[i+1];
		}
		System.out.println(Arrays.toString(adds));
	}
	
	public static void exercise7_7() {
		int [] one = {1,2,3,4,5};
		int [] two = {6,7,8,9,10};
		System.out.println(Arrays.toString(append(one,two)));
	}
	
	public static int[] append(int [] a, int [] b) {
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int[] app = new int[a.length+b.length];
		for(int i = 0; i < a.length; i++) {
			app[i] = a[i];
		}
		for(int i = a.length; i < b.length+a.length; i++) {
			app[i] = b[i - a.length];
		}
		return app;
	}
}


