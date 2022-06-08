package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorPrograms {
	
	public static void main(String[] args) {
		
		String empSet1 = "Amrita";
		String empSet2 = "Arpita";
		String empSet3 = "Ankita";
		
		Set<String> emp = new HashSet<String>();
		emp.add(empSet1);
		emp.add(empSet2);
		emp.add(empSet3);
		
		Iterator<String> iter = emp.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
