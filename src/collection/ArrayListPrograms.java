package collection;

import java.util.ArrayList;
import java.util.Iterator;

/* ArrayList is a concrete class of List interface, where we can store multiple objects. 
 * Rules:
 * 1. Allows duplicate values
 * 2. Allows null values (multiple null values)
 * 3. It has index (starting from 0 and ends at length of arraylist-1)
 * 4. Remembers the order of insertion
 * */

public class ArrayListPrograms {

	public static void main(String[] args) {

		ArrayList<Object> a_list1 = new ArrayList<>();
		ArrayList<Object> a_list2 = new ArrayList<>();
		ArrayList<Object> a_list3 = new ArrayList<>();
		ArrayList<Integer> a_list4 = new ArrayList<>();

		// add(object)
		System.out.println("add(object)~~~");
		a_list1.add(Integer.valueOf(10));
		a_list1.add(10); // Boxing, to convert int to Integer
		a_list1.add(20);
		System.out.println("Arraylist with duplicate objects:");
		System.out.println(a_list1 + " >Size: " + a_list1.size());
		a_list1.add(30.25);
		a_list1.add('a');
		a_list1.add("amy");
		a_list1.add(true);
		System.out.println("Arraylist with heterogenious collection of objects:");
		System.out.println(a_list1 + " >Size: " + a_list1.size());
		System.out.println();

		// add ArrayList object into another ArrayList (Nested List)
		a_list2.add(a_list1); // Nested List
		a_list2.add('a');
		a_list2.add('b');
		System.out.println("Adding ArrayList object into another ArrayList(Nested List):");
		System.out.println(a_list2 + " >Size: " + a_list2.size());
		System.out.println();
		
		// add ArrayList object into another ArrayList 
		ArrayList<Object> a_list = new ArrayList<>(a_list1);
		a_list.add('a');
		a_list.add('b');
		System.out.println("Adding ArrayList object into another ArrayList:");
		System.out.println(a_list + " >Size: " + a_list.size());
		System.out.println();
		
		// addAll(object)
		System.out.println("addAll(object)~~~");
		a_list3.addAll(a_list1);
		a_list3.add('a');
		a_list3.add('b');
		System.out.println("Adding ArrayList object into another ArrayList:");
		System.out.println(a_list3 + " >Size: " + a_list3.size());
		System.out.println(a_list3.containsAll(a_list1));
		System.out.println();

		// add(index, object)
		System.out.println("add(index, object)~~~");
//		a_list1.add(8, "boo");				// 	IndexOutOfBoundsException
		a_list1.add(7, 55);
		a_list1.add(3, 40.45);
		a_list1.add(4, 'b');
		System.out.println("Adding object at the desire index:");
		System.out.println(a_list1 + " >Size: " + a_list1.size());
		System.out.println();
		
		// get(index)
		System.out.println("get(index)~~~");
		System.out.println(a_list1.get(2));
		System.out.println();
		
		// Generic ArrayList
		System.out.println("Generic ArrayList~~~");
		a_list4.add(10);
		a_list4.add((int) 'a');
		System.out.println(a_list4);
		System.out.println();
		
		// remove(index)/remove(object)
		System.out.println("remove(index)/remove(object)~~~");
		System.out.println("Before removing object:");
		System.out.println(a_list1 + " >Size: " + a_list1.size());
		a_list1.remove(0);
		a_list1.remove("amy");
		System.out.println("After removing object at the desire index:");
		System.out.println(a_list1 + " >Size: " + a_list1.size());
		System.out.println();
		
		// contains(object)
		System.out.println("contains(object)~~~");
		System.out.println(a_list4.contains(10));		
		System.out.println();
		
		Iterator<Integer> i2 = a_list4.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

}
