package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* HashSet is a concrete class of Set interface,
 * Rules:
 * 1. It cannot have duplicate object
 * 2. It doesn't remember the order of insertion of object
 * */

public class HashSetPrograms {

	public static void main(String[] args) {

		HashSet<Integer> hset1 = new HashSet<>();

		hset1.add(10);
		hset1.add(20);
		hset1.add(30);
		System.out.println(hset1);
		boolean flag = hset1.add(10);
		System.out.println(flag);

		Iterator<Integer> i = hset1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		HashSet<Object> hset2 = new HashSet<>();

		hset2.add(10);
		hset2.add(20);
		hset2.add(30);
		hset2.add('a');
		System.out.println(hset2);
		boolean flag2 = hset2.add(10);
		System.out.println(flag2);

		Iterator<Object> i2 = hset2.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println("~~~~~~~~");
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		
		Iterator<String> iter = set.iterator();
		List<String> list = new ArrayList<>();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
