package programs;

import java.util.ArrayList;

/**
 * Print fibonacii series upto 100
 * */

public class FibonaciiSeries {
	
	/**
	 * 0 1  1   2   3   5   8  13 ..
	 * 0 1 0+1 1+1 1+2 2+3 3+5 5+8 ..
	 * */

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		int limit = 20;
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(n1);
		list.add(n2);
		
		for(int i = 2; i<limit; i++) {
			n3 = n1 + n2;
			if(n3>100) {
				break;
			}
			System.out.println(n3);
			list.add(n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println(list);
	}
}
