package co.edu;

import java.util.ArrayList;
import java.util.Collections;

public class SortAuthByNames {

	public static void main(String[] args) {
		ArrayList<Author> arr = new ArrayList<Author>();
		arr.add(new Author("Henry","Marto", "Law of cancer"));
		arr.add(new Author("Henna","Maria", "Purity"));
		arr.add(new Author("Pengi","Manhotra", "prayer"));
		arr.add(new Author("Hyper","Marino", "Cricket"));
		arr.add(new Author("Prem","Fogat", "Boxing"));
		arr.add(new Author("anji","gupta", "Vedas"));

		//Sorting the list using Collections.sort() method we can use this method becoz we have implemented the Comparable
		//interface in our user defined class Author
		
		Collections.sort(arr);
		for(Author str:arr) {
			System.out.println("Name is : "+str.firstName+ " "+ str.lastName+"   " +"& Book is :"+" "+str.bookName);
		}
	}

}
