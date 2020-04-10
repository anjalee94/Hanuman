package co.edu;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDetail {

	public static void main(String[] args) {
		Enumeration  names;
		String key;
		
		//creating a hashtable
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		
		// adding key and value pair of hash table
		hashtable.put("k1", "anja");
		hashtable.put("k2", "anji");
		hashtable.put("k3", "anjika");
		hashtable.put("k4", "angelina");
		hashtable.put("k6", "jolly");
		hashtable.put("k7", "annamika");
		
		names =hashtable.keys();
		while(names.hasMoreElements()) {
			key= (String) names.nextElement();
			System.out.println("Key :" + key +"  "+ "& Value: " + hashtable.get(key));
		}

	}

}




























