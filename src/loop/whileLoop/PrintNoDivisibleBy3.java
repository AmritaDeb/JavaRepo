package loop.whileLoop;

/**
 * Print all no divisible by 3 till 100
 * */

public class PrintNoDivisibleBy3 {

	public static void main(String[] args) {
		int num = 1;
		while (num<=100) {
			if(num%3==0) {
				System.out.println(num);
			}
			num++;
		}
	}
}
