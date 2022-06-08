package collection;

import java.util.Iterator;
import java.util.TreeSet;

/* TreeSet is a concrete class of Set interface,
 * Rules:
 * 1. It will not allow duplicates
 * 2. It doesn't remember the order of insertion of object
 * 3. Always it will be in Sorted order
 * 4. It won't allow heterogeneous object, it will throw ClassCastException (runtime exception)
 * */

public class TreeSetPrograms {

	public static void main(String[] args) {

		TreeSet<Integer> tset = new TreeSet<>();

		tset.add(40);
		tset.add(20);
		tset.add(30);
//		tset.add('a');			// heterogeneous object
		System.out.println(tset);
		System.out.println(tset.descendingSet());
		boolean flag = tset.add(10);
		System.out.println(flag);

		Iterator<Integer> i = tset.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		TreeSet<Object> tset2 = new TreeSet<>();

		tset2.add(40);
		tset2.add(20);
		tset2.add(30);
//		tset2.add('a'); 		// heterogeneous object   [ClassCastException]
		System.out.println(tset2);
		System.out.println(tset2.descendingSet());
		boolean flag2 = tset2.add(10);
		System.out.println(flag2);

		Iterator<Object> i2 = tset2.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

}
