package co.edu;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDetail {

	public static void main(String[] args) {
		//hashmap declaration
		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>(); 
		// addition
		lhmap.put(23, "sahu");
		lhmap.put(22, "sachin");
		lhmap.put(24, "sahit");
		lhmap.put(67, "sahhnu");
		lhmap.put(63, "sau");
		// generating a set of entries
		Set set = lhmap.entrySet();
		// displaying elements of Linkedhashmap
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println("Key is :"+ me.getKey()+"  "+"& Value is :" + me.getValue());
		}
	}
}
























