import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Unit8 {

	public static void main(String[] args) throws FileNotFoundException {
		exercise8();
//		test();
	}
	
	public static void exercise1(){
		System.out.println(gcd(150,200));
	}
	
	public static int gcd(int a, int b) {
		if(a==b) {
			return a;
		} else if(a<b){
			return gcd(a, b-a);
		} else if(a>b) {
			return gcd(a-b, b);
		} else {
			return 1;
		}
	}
	
	public static void exercise2() {
		System.out.println(fib(25));
	}
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		} else if(n==1) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static void exercise3() {
		System.out.println(reverseString("String"));
	}
	
	public static String reverseString(String s) {
		if(s.length() == 1) {
			return s;
		} else {
			return s.substring(s.length()-1) + reverseString(s.substring(0, s.length()-1));
		}
	}
	
	public static void exercise4() {
		System.out.println(isPalendrome("abba"));
		System.out.println(isPalendrome("abcdcba"));
		System.out.println(isPalendrome("abcdba"));
	}
	
	public static boolean isPalendrome(String s) {
		if(s.length() <= 1) {
			return true;
		} else if((s.charAt(0) ==  s.charAt(s.length()-1))) {
			return isPalendrome(s.substring(1, s.length()-1));
		} else {
			return false;
		}
	}
	
	public static void exercise5() throws FileNotFoundException {
		File stringFile = new File("namesearch.txt");
		Scanner stringScanner = new Scanner(stringFile);
		ArrayList<String> stringList = new ArrayList<String>();
		while(stringScanner.hasNext()) {
			stringList.add(stringScanner.next());
		}
		System.out.println(stringList);
		System.out.println("Dennis is stored in index: " + search(stringList, "Dennis"));
		System.out.println("Cora is stored in index: " + search(stringList, "Cora"));
		System.out.println("Steve is stored in index: " + search(stringList, "Steve"));
	}
	
	public static int search(List<String> list, String key) throws FileNotFoundException {
		int min = 0;
		int max = list.size()-1;
		int mid;
		if(min<=max) {
			mid = (min+max)/2;
			if(list.get(mid).compareTo(key) == 0) {
				return mid;
			} if(list.get(mid).compareTo(key) < 0) {
				min = mid + 1;
				return search(list.subList(min, max), key);
			} else {
				max = mid - 1;
				return search(list.subList(min, max), key);
			}
		} 
		return -1;
	}
	
	public static void exercise6() {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		
		System.out.println(merge(list2, list1));
	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean searching = true;
		int index1 = 0;
		int index2 = 0;
		
		while((index1 < list1.size() || index2 < list2.size())) {
			if(index1 > list1.size()-1) {
				list.add(list2.get(index2));
				index2++;
			} else if(index2 > list2.size()-1) {
				list.add(list1.get(index1));
				index1++;
			} else {			
				if(list1.get(index1) < list2.get(index2)) {
					list.add(list1.get(index1));
					index1++;
				} else {
					list.add(list2.get(index2));
					index2++;
				}
			}
		}
		return list;
	}
	
	public static void exercise7() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(89);
		list.add(62);
		list.add(23);
		list.add(43);
		list.add(12);
		list.add(2);
		list.add(1);
		list.add(6);
		list.add(3);
		list.add(78);
		list.add(5);
		System.out.println(mergeSort(list));
	}
	
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> list){
		if(list.size() > 1) {
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			for(int i = 0; i<list.size()/2; i++) {
				list1.add(list.get(i));
			}
			for(int i = list.size()/2; i<list.size(); i++) {
				list2.add(list.get(i));
			}
			return merge(mergeSort(list1), mergeSort(list2));
		}
		return list;
	}
	
	public static void exercise8() {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<1000; i++) {
			list.add(r.nextInt(1000));
		}
		long startTime = System.currentTimeMillis();
		mergeSort(list);
		long endTime = System.currentTimeMillis();
		System.out.println("Merge Sort 1000: " + (endTime - startTime));
		
		list.clear();
		for(int i = 0; i<10000; i++) {
			list.add(r.nextInt(10000));
		}
		startTime = System.currentTimeMillis();
		mergeSort(list);
		endTime = System.currentTimeMillis();
		System.out.println("Merge Sort 10000: " + (endTime - startTime));
		
		list.clear();
		for(int i = 0; i<100000; i++) {
			list.add(r.nextInt(100000));
		}
		startTime = System.currentTimeMillis();
		mergeSort(list);
		endTime = System.currentTimeMillis();
		System.out.println("Merge Sort 100000: " + (endTime - startTime));
		
		int[] arr = new int[1000];
		for(int i = 0; i<1000; i++) {
			arr[i] = r.nextInt(1000);
		}
		startTime = System.currentTimeMillis();
		selectionSortForward(arr);
		endTime = System.currentTimeMillis();
		System.out.println("Selection Sort 1000: " + (endTime - startTime));
		
		int[] arr1 = new int[10000];
		for(int i = 0; i<10000; i++) {
			arr1[i] = r.nextInt(10000);
		}
		startTime = System.currentTimeMillis();
		selectionSortForward(arr1);
		endTime = System.currentTimeMillis();
		System.out.println("Selection Sort 10000: " + (endTime - startTime));
		
		int[] arr2 = new int[100000];
		for(int i = 0; i<100000; i++) {
			arr2[i] = r.nextInt(100000);
		}
		startTime = System.currentTimeMillis();
		selectionSortForward(arr2);
		endTime = System.currentTimeMillis();
		System.out.println("Selection Sort 100000: " + (endTime - startTime));
		
		for(int i = 0; i<1000; i++) {
			arr[i] = r.nextInt(1000);
		}
		startTime = System.currentTimeMillis();
		insertionSort(arr);
		endTime = System.currentTimeMillis();
		System.out.println("Insertion Sort 1000: " + (endTime - startTime));
		
		for(int i = 0; i<10000; i++) {
			arr1[i] = r.nextInt(10000);
		}
		startTime = System.currentTimeMillis();
		insertionSort(arr1);
		endTime = System.currentTimeMillis();
		System.out.println("Insertion Sort 10000: " + (endTime - startTime));
		
		for(int i = 0; i<100000; i++) {
			arr2[i] = r.nextInt(100000);
		}
		startTime = System.currentTimeMillis();
		insertionSort(arr2);
		endTime = System.currentTimeMillis();
		System.out.println("Insertion Sort 100000: " + (endTime - startTime));
		
	}
	
	public static int[] selectionSortForward(int[] list){
		boolean searching = true;
		for(int i = 0; i<list.length-1; i++) {
			int min = i;
			searching = true;
			for(int j = i + 1; j<list.length && searching; j++) {
				if(list[j] < list[min]) {
					min = j;
				}
			}
			int temp = list[i];
			list[i] = list[min];
			list[min] = temp;
		}
		return list;
	}
	
	public static void test() {
		int[] n = {2,4,7,2,4,87,223,54,23};
		System.out.println(Arrays.toString(insertionSort(n)));
	}
	
	public static int[] insertionSort(int[] arr) {
		 int n = arr.length; 
	        for (int i = 1; i < n; ++i) { 
	            int key = arr[i]; 
	            int j = i - 1; 
	            while (j >= 0 && arr[j] > key) { 
	                arr[j + 1] = arr[j]; 
	                j = j - 1; 
	            } 
	            arr[j + 1] = key; 
	        } 
		return arr;
	}
}
