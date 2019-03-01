import java.util.ArrayList;
import java.util.Arrays;

public class Unit6 {

	public static void main(String[] args) {
		exercise2();
	}
	
	public static void exercise1() {
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		for(int i : arr) {
			if(arr[i] % 2 != 0) {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 4) {
				arr[i] = 14;
			}
		}
		System.out.println(Arrays.toString(arr));
		boolean containsThree = false;
		for(int i = 0; i<arr.length && !containsThree; i++) {
			if(arr[i] == 3) {
				containsThree = true;
			} else {
				containsThree = false;
			}
		}
		System.out.println(containsThree);
		
		System.out.println();
		System.out.println();
		
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		for(int i = 0; i < 11; i++) {
			arrl.add(i, i);
		}
		System.out.println(arrl);
		for(int i = 0; i < arrl.size(); i++) {
			if(arrl.get(i) % 2 != 0) {
				arrl.set(i, 0);
			}
		}
		System.out.println(arrl);
		for(int i = 0; i<arrl.size()/2; i++) {
			int temp = arrl.get(i);
			arrl.set(i, arrl.get(arrl.size()-i-1));
			arrl.set(arrl.size()-i-1, temp);
		}
		System.out.println(arrl);
		while(arrl.contains(4)) {
			arrl.set(arrl.indexOf(4), 14);
		}
		System.out.println(arrl);
		System.out.println(arrl.contains(3));
	}
	
	public static void exercise2() {
		ArrayList<Double> list= new ArrayList<Double>();
		for(double i = 0.5; i<10; i++) {
			list.add(i);
		}
		doubleList(list);
	}
	
	public static void doubleList(ArrayList<Double> list) {
		System.out.println(list);
		for(int i = 0; i<list.size(); i+=2) {
			list.add(i+1, list.get(i));
		}
		System.out.println(list);
	}

}
