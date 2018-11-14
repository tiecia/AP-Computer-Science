import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Unit3 {

	public static void main(String[] args) throws FileNotFoundException {
		exercise1();
	}
	
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
}
