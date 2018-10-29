import java.util.Random;
import java.util.Scanner;

public class Unit2 {

	public static void main(String[] args) {
		//printLineOfStars(3);
		//myName("This is a String");
		//exercise10();
		bonus();
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
}





