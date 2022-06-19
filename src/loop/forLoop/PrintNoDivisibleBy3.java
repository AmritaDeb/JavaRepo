package loop.forLoop;

/**
 * Print all no divisible by 3 till 100
 * */

public class PrintNoDivisibleBy3 {

	public static void main(String[] args) {
		for(int num = 1; num<100; num++) {
			if(num%3==0){
				System.out.println(num);
			}
		}
	}
}
