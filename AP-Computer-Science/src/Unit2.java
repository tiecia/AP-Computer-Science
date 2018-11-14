import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class Unit2 {

	public static void main(String[] args) {
		//printLineOfStars(3);
		//myName("This is a String");
		exercise16();
		//bonus();
	}
	
	public static void printLineOfStars(int number){
		for(int n = 1; n <= number; n++) {
			for(int i  = 1; i <= number; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		int stars = 1;
		for(int n = 1; n <= number; n++) {
			for(int i = 1; i <= stars; i++) {
				System.out.print("*");
			}
			stars++;
			System.out.println();
		}
	}
	
	public static void exercise2() {
		double numToCalc = 11;
		for(double i = 0; i <= numToCalc; i += 0.5) {
			squareCalc(i);
		}
	}
	public static void squareCalc(double numCalc) {
		double calculation = numCalc*numCalc*numCalc;
		int shorten = (int)calculation;
		if(calculation-shorten == 0) {
			System.out.println((int)numCalc + "	Cubed is " + shorten);
		} else {
			System.out.println(numCalc + "	Cubed is " + calculation);
		}
		
	}
	
	public static void exercise3() {
		//library();
		//transcript();
		letter();
	}
	
	public static void library() {
		System.out.println("Student: " + name());
		System.out.println("Student ID: " + id());
	}
	public static void transcript() {
		System.out.println("Student: " + name());
		System.out.println("Student ID: " + id());
		System.out.println("Student address: " + address());
		
	}
	public static void letter() {
		System.out.println("Student: " + name());
		System.out.println("Student address: " + address());
	}
	
	public static String address() { 
		return "905 250th Ave NE, Sammamish, WA";
	}

	public static String name() {
		return "Tyler Ciapala Hazlerig";
	}
	
	public static int id() {
		return 107838;
	}
	
	public static void exercise4() {
		whatIsThis("hello");
		whatIsThis("5");
		whatIsThis(3+3);
		//whatIsThis(1.2+3.5); This won't work because the arguments are doubles and there is no version of whatIsThis() that accepts a double.
		whatIsThis(1 + 'a');
		whatIsThis("hello" + "world");
	}
	
	public static void whatIsThis(int s) {
		System.out.println("int " + s);
	}
	
	public static void whatIsThis(String s) {
		System.out.println("String " + s);
	}
	
	public static void exercise5() {
		String name = processName("Tyler", "Ciapala Hazlerig");
		System.out.println(name);
	}
	public static String processName(String first, String last) {
		return(last + " " + first);
	}
	
	public static void exercise6() {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) {
			System.out.println(s.next());
		}
	}
	
	
	
	public static int numOfGrades;
	
	public static void exercise7() {
		Scanner inputScanner = new Scanner(System.in);
		String inputString = inputScanner.nextLine();
		Scanner parseScanner = new Scanner(inputString);
		String name = parseScanner.next();
		int oldNumber = 0;
		int newNumber = 0;
		while(parseScanner.hasNext()) {
			newNumber = Integer.parseInt(parseScanner.next());
			oldNumber = newNumber + oldNumber;
			numOfGrades++;
		}
		parseScanner.close();
		inputScanner.close();
		oldNumber = oldNumber/numOfGrades;
		System.out.println(name + " " + oldNumber);
	}
	
	
	public static void myName(String print) {
		System.out.println(print);
	}
	
	public static void exercise8() {
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()) {
			int input = s.nextInt();
			if(input % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("odd");
			}
		}
	}
	
	public static void exercise9() {
		Scanner input = new Scanner(System.in);
		System.out.println("Type a String:");
		String inputString = input.nextLine();
		input.reset();
		System.out.println("Type a whole number:");
		int inputInt = input.nextInt();
		input.close();
		if(inputString.length() > inputInt) {
			System.out.println("\"" + inputString + "\"" + " has more than " + inputInt + " indexes.");
		} else {
			System.out.println("\"" + inputString + "\"" + " has less than " + inputInt + " indexes.");
		}
	}
	
	public static void bonus() {
		boolean inPlay = true;
		Random rand = new Random();
		int randNum = rand.nextInt(100) + 1;
		while(inPlay) {
			System.out.println("Guess a number(1-100):");
			Scanner input = new Scanner(System.in);
			int in = input.nextInt();
			if(in < randNum) {
				System.out.println("Too Low");
			} else if(in > randNum) {
				System.out.println("Too High");
			} else {
				System.out.println("You guessed the number.");
				inPlay = false;
			}
			System.out.println();
		}
	}
	
	public static void exercise10() {
		factorial(15); //Works Up to 25.
	}
	
	public static void factorial(long number) {
		long calc = number;
		for(long i = number; i>1; i--) {
			calc = calc * (i-1);
		}
		System.out.println(calc);
	}
	
	@SuppressWarnings("resource")
	public static void exercise11() {
		System.out.println("Enter Value a: ");
		Scanner num1 = new Scanner(System.in);
		int a = num1.nextInt();
		System.out.println("Enter Value a: ");
		Scanner num2 = new Scanner(System.in);
		int b  = num2.nextInt();
		if(isEven(a) && isEven(b)) {
			System.out.println("Both are Even");
		} else {
			System.out.println("At least 1 is Odd");
		}
	}
	
	public static boolean isEven(int n){
		if(n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void exercise12() {
		System.out.println("Average" + avgNum());
	}
	
	@SuppressWarnings("resource")
	public static int avgNum() {
		Scanner parseNum = new Scanner(System.in);
		int num = 0;
		int numCount = 0;
		boolean active = true;
		while(active) {
			int input = parseNum.nextInt();
			if(input >= 0) {
				num = num + input;
				numCount++;
			} else {
				active = false;
			}
		}
		return num/numCount;
	}
	
	public static void exercise13() {
		System.out.println(addNum());
	}
	
	
	@SuppressWarnings("resource")
	public static int addNum() {
		Scanner scanNum = new Scanner(System.in);
		String input = scanNum.nextLine();
		Scanner parseNum = new Scanner(input).useDelimiter(":");
		int num = 0;
		while(parseNum.hasNext()) {
			num += parseNum.nextInt();
		}
		return num;
	}
	
	public static void exercise14() {
		int i;
		double d;
		char c;
		float f;
		long l;
		short s;
		
		i = 10;
		d = i;
		i = (int) d;
		c = '5';
		i = c;
		c = (char) i;
		s = (short) i;
		l = s;
		f = i;
		i = (int) f;
		d = i;
		i = (int) d;
		
		/*
		 * You need to cast down whenever you are converting a larger data type to a smaller one
		 * 
		 * IF you convert an int to a char you will get the ASCII value of that char
		 */
	}
	
	public static void exercise15() {
		if(alphaIndex(":") == -1 && alphaIndex("f") == 5 && alphaIndex("C") == 2) {
			System.out.println("Correct");
		}
	}
	
	public static int alphaIndex(String s) {
		if(s.equals("A") || s.equals("a")) {
			return 0;
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
	
	public static void exercise16() {
		System.out.println(moneyFormat(34.557768));
	}
	
	public static double moneyFormat(double input) {
		double ret = input % .01;
		if(ret >= .005) {
			input += ret;
		} else {
			input -= ret;
		}
		DecimalFormat f = new DecimalFormat(input);
		return input;
	}
}





