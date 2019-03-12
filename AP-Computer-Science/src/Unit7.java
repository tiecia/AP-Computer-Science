import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Unit7 {

	public static void main(String[] args) throws FileNotFoundException {
		exercise2();
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
		System.out.println("7: " + count7);
		System.out.println("9: " + count9);
		System.out.println("45: " + count45);
	}
	
	public static void exercise2() throws FileNotFoundException {
		File f = new File("numsearch.txt");
		Scanner s = new Scanner(f);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		while(s.hasNextInt()) {
			intList.add(s.nextInt());
		}
		System.out.println(intList);
		System.out.println("5 is stored in Index: " + search(intList, 5));
		System.out.println("9 is stored in Index: " + search(intList, 9));
		System.out.println("43 is stored in Index: " + search(intList, 43));
		System.out.println("79 is stored in Index: " + search(intList, 79));
		System.out.println("101 is stored in Index: " + search(intList, 101));
		
		System.out.println();
		
		File stringFile = new File("namesearch.txt");
		Scanner stringScanner = new Scanner(stringFile);
		ArrayList<String> stringList = new ArrayList<String>();
		while(stringScanner.hasNext()) {
			stringList.add(stringScanner.next());
		}
		System.out.println(stringList);
		System.out.println("Dennis is stored in index: " + search(stringList, "Dennis"));
		System.out.println("Billy-Bob is stored in index: " + search(stringList, "Billy-Bob"));
		System.out.println("Steve is stored in index: " + search(stringList, "Steve"));
	}
	
	public static int search(ArrayList<Integer> list, int key) throws FileNotFoundException {
		int min = 0;
		int max = list.size()-1;
		int mid;
		
		boolean searching = true;
		while(min<=max) {
			mid = (min+max)/2;
			if(list.get(mid).equals(key)) {
				return mid;
			} if(list.get(mid) < key) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		} 
		return -1;
	}
	
	public static int search(ArrayList<String> list, String key) throws FileNotFoundException {
		int min = 0;
		int max = list.size()-1;
		int mid;
		
		boolean searching = true;
		while(min<=max) {
			mid = (min+max)/2;
//			System.out.println("Mid: " + list.get(mid));
//			System.out.println("Key: " + key);
			if(list.get(mid).compareTo(key) == 0) {
				return mid;
			} if(list.get(mid).compareTo(key) < 0) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		} 
		return -1;
	}
	
	public static void exercise3() {
		ArrayList<Integer> list = new ArrayList<Integer>();
	}
	
	public static ArrayList<Integer> selectionSortForward(ArrayList<Integer> list){
		
	}
}