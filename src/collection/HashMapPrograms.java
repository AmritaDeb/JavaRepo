package collection;

import java.util.HashMap;
import java.util.Map;

/* Rules:
 * 1. We can not have duplicate keys
 * 2. We can have duplicate value
 * 3. We can have a null value
 * 4. We can have a null key */

public class HashMapPrograms {

	public static void main(String[] args) {
		 Map<Integer,String> hmap = new HashMap<>();
		 System.out.println(hmap.isEmpty());
		 hmap.put(1, "a");
		 hmap.put(2, "b");
		 hmap.put(3, "c");
		 hmap.put(4, "d");
		 hmap.put(null, "e");
		 hmap.put(5, null);
		 System.out.println(hmap);
		 System.out.println(hmap.isEmpty());
		 System.out.println(hmap.keySet());
		 System.out.println(hmap.values());
		 if(hmap.get(2) != null) {
			 System.out.println(hmap.get(2));
		 }
		 if(hmap.containsKey(null)) {
			 hmap.remove(null);
		 }
		 System.out.println(hmap);
		 System.out.println(hmap.containsValue(null));
		 System.out.println(hmap.size());
		 
		 System.out.println(hmap.entrySet());
	}

}
