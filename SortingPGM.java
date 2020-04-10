package co.edu;

import java.util.ArrayList;
import java.util.Collections;

public class SortingPGM {

	public static void main(String[] args) {
		ArrayList<AuthorComparator> arr1 = new ArrayList<AuthorComparator>();
		arr1.add(new AuthorComparator("Henry","Math",54));
		arr1.add(new AuthorComparator("Henna","History",34));
		arr1.add(new AuthorComparator("Pengi","Science",39));
		arr1.add(new AuthorComparator("Hyper","English",65));
		arr1.add(new AuthorComparator("Prem","Social",74));
		arr1.add(new AuthorComparator("anji","Hindi",35));
		
		System.out.println("Sorting by Author First Name:");
		System.out.println();
		Collections.sort(arr1);
		for(AuthorComparator asort:arr1) { 
		System.out.println(asort.getFirstName() +", "+asort.getBookName()+", "+asort.getAuthAge());
		}
		System.out.println();
		
		System.out.println("Sorting by Author Age:");
		System.out.println();
		Collections.sort(arr1, new AuthorAgeComparator());
		for(AuthorComparator asort:arr1){
			System.out.println(asort.getFirstName() +", "+asort.getBookName()+", "+asort.getAuthAge());
			
		}
		System.out.println();
		System.out.println("Sorting by Author Book Name:");
		System.out.println();
		Collections.sort(arr1, new BookNameComparator());
		for(AuthorComparator asort:arr1) { 
		System.out.println(asort.getFirstName() +", "+asort.getBookName()+", "+asort.getAuthAge());
		}
		

	}

}
