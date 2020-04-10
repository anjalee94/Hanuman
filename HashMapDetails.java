package co.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDetails {

	public static void main(String[] args) {
		
HashMap<Integer, String> hmap = new HashMap<Integer, String>();// declare 

hmap.put(1 , "anji");//add element
hmap.put(2 , "anees");
hmap.put(3 , "anaj");
hmap.put(4 , "anjana");
hmap.put(5 , "adhish");

// to display content using Iterator

Set set = hmap.entrySet();
Iterator itr = set.iterator();
while(itr.hasNext()) {
	Map.Entry mentry = (Map.Entry) itr.next();
	System.out.println("Key is : " + mentry.getKey() +"   "+ "Value is : " + mentry.getValue());
}

//get value based on key

String var = hmap.get(2);
System.out.println("Value of index 2 is :" + var);

//remove values based on key
hmap.remove(3);
System.out.println("Map key and value after removal: ");
Set set2 = hmap.entrySet();
Iterator itr2 = set2.iterator();
while(itr2.hasNext()) {
	Map.Entry mentry2 = (Map.Entry) itr2.next();
	System.out.println("Key is:" + mentry2.getKey() + "  " + "& Value is :" + mentry2.getValue());
}
   }
}




