package programs;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	
	public static ArrayList<Integer> list = new ArrayList<>();
	
	public static boolean isPrime(int num) {
		for(int i = 2; i<=num/2; i++) {
			if(num%i != 0) {
				return true;
			} 
		}
		return false ;
	}
	
	public static List<Integer> printPrimeNum(int limit) {
		for(int i = 0; i<limit; i++) {
			if(isPrime(i) == true) {
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(5));
		if(isPrime(5) == true) {
			System.out.println("It's a prime number");
		} else {
			System.out.println("It's not a prime number");
		}
		System.out.println(printPrimeNum(20));
	}
}
