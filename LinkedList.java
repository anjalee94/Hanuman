package co.edu;
import java.util.*;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<String> link = new java.util.LinkedList<String>();
		link.add("Pushpa");
		link.add("Pushika");
		link.add("Pushp");
		link.add("Pusy");
		
		//for loop
		System.out.println("___for loop ***");
		for(int num=0; num<link.size(); num++) {System.out.println(link.get(num));}
		//Advanced forloop
		System.out.println("___Advance for loop ***");
		for(String str:link) {System.out.println(str);}
		//Iterator
		System.out.println("___Iterator***");
		Iterator i= link.iterator();
		while(i.hasNext()) {System.out.println(i.next());}
		//while loop
		System.out.println("___while loop ***");
		int num = 0;
		while(link.size()>num) {System.out.println(link.get(num)); num++;}

	}
}
