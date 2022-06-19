package loop.whileLoop;

/**
 * Print number divisible by 5 as well as 10 from 100 to 200
 * */

public class PrintDivisibleBy5And10 {

	public static void main(String[] args) {
		int num = 100;
		while(num<=200) {
			if(num%5==0 && num%10==0) {
				System.out.println(num);
			}
			num++;
		}
	}
}
