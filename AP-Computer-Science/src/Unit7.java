import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Unit7 {

	public static void main(String[] args) {
		

	}
	
	public static void exercise1() throws FileNotFoundException {
		int count7 = 0;
		int count9 = 0;
		int count45 = 0;
		File f = new File("SeqSrch.txt");
		Scanner s = new Scanner(f);
		while(s.hasNext()) {
			int key = s.nextInt();
			if(key == 7) {
				count7++;
			} else if(key == 9) {
				count9++;
			} else if(key == 45) {
				count45++;
			}
		}
	}

}
