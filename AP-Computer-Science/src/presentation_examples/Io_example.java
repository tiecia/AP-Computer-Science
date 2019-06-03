package presentation_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Io_example {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("ioExample.txt");
		PrintStream print = new PrintStream(f);
		print.println("output1");
		print.println("output2");
		print.println("output2");
		Scanner s = new Scanner(f);
		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println(s.next());
	}
}


