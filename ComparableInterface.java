package co.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {

	public static void main(String[] args) {
	// Integer class implements Comparable Interface so we can use the sort methods
		int[] arr = {1, 3, 4, 5, 3, 5, 76, 59};
		Arrays.sort(arr);
		System.out.println("Sorted Int Array:"+Arrays.toString(arr));
	// String class implements Comparable Interface so we can use the sort methods
	   String[] names = {"Ajeet","pankaj", "kirti", "pinki"};	
	   Arrays.sort(names);
	   System.out.println("Sorted String Array :" + Arrays.toString(names));
	// String class implements Comparable Interface so we can use the sort methods
	   System.out.print("Sorted List : ");
	   List<String> fruits = new ArrayList();
	   fruits.add("Orange");
	   fruits.add("Papaya");
	   fruits.add("Apple");
	   fruits.add("banana");
	   fruits.add("grapes");
	   Collections.sort(fruits);
	   for(String s: fruits)
		   System.out.print(s +", ");
	}
}































