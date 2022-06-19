package loop.forLoop;

/**
 * Print number divisible by 5 as well as 10 from 100 to 200
 * */

public class PrintDivisibleBy5And10 {

	public static void main(String[] args) {
		for(int num=100; num<=200; num++) {
			if(num%5==0 && num%10==0) {
				System.out.println(num);
			}
		}
	}
}
