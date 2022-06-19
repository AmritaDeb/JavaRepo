package loop.forLoop;

/**
 * Print even no up to 10
 * */

public class PrintEvenOddNo {

	public static void main(String[] args) {
		
		System.out.println("Even Number Output :");
		for(int evenNum = 0; evenNum<=10; evenNum+=2) {
			System.out.println(evenNum);
		}
		
		System.out.println("Odd Number Output :");
		for(int oddNum = 1; oddNum<=10; oddNum+=2) {
			System.out.println(oddNum);
		}
		
		System.out.println("Odd Number in descending order from 100 to 50 Output :");
		
		for(int oddNum2 = 100; oddNum2>=50; oddNum2--) {
			System.out.println(oddNum2);
		}
		
		System.out.println("Print Even no from 1 till 100 if the no is not divisible by 3:");
		for(int evenNum1=1; evenNum1<=100; evenNum1++) {
			if(evenNum1%3!=0) {
				System.out.println(evenNum1);
			}
		}
	}
}
