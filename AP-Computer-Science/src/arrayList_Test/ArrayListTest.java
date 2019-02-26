package arrayList_Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i<20; i++) {
			list.add("Str" + i);
		}
		
		System.out.println("Size: " + list.size());
		System.out.println("ToString: " + list.toString());
		System.out.println("ToArray: " + list.toArray());
		System.out.println("ToArray ToString: " + Arrays.toString(list.toArray()));
		System.out.println();
		System.out.println(list);
	}
}
