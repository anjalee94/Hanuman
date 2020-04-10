package co.edu;

import java.util.ArrayList;

class Student{
	int roll;
	String name;
}
public class ListDemo {
	public static void main(String[] args) {
		// so list1 can only store String Object
		ArrayList<String> list1 = new ArrayList<String>(); //Type specific
		// list2 can store anytype of Object
		ArrayList list2 = new ArrayList();// anytype of data
		
		Student s1 = new Student();
		s1.roll=101;
		s1.name="Mike";
		
		// Add data in list
		list1.add("Jan");    //0 index
		list1.add("Jonny");  //1 index
		list1.add("Janardan");  //2 index
		list1.add("Jan");  //3 index
		list1.add("John");  //4 index
		list1.add("Jara");  //5 index
		list1.add("Jyoti");  //6 index
		
		//list1.add(10);  Error
		//list1.add(2.2); Error
		
		list2.add("Jyoti");
		list2.add(10);
		list2.add(2.2);
		list2.add(2.2);
		list2.add(s1);
	
		// print reference to list, --> shall print element in the list the way we added in the sequence 
		
		System.out.println("Print list1 :" + list1);
		System.out.println("Print list2 :" + list2);
		
		// get the element from the list 
		String name = list1.get(2);
		System.out.println("name is " + name);
		
		Object o = list2.get(2);
		System.out.println("o is : " + o);
		
		// Update Elemement in list
		list1.set(2, "Fionna");
		System.out.println("list1  now is : " + list1);
		
		// Remove Element from list
		list1.remove(2);
		System.out.println("list1 after remove is :"+list1);
		
		// list1.clear(); --> Remove all
		

	}
}





















