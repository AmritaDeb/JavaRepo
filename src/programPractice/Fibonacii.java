package programPractice;

import java.util.ArrayList;

public class Fibonacii {
	
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(n1);
		list.add(n2);
		
		int limit = 10;
		for(int i = 2; i<limit; i++) {
			n3 = n1 + n2;
			if(n3>30) {
				break;
			}
			n1 = n2;
			n2 = n3;
			list.add(n3);
		}
		System.out.println(list);
	}

}
