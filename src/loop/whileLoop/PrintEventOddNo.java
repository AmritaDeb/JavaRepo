package loop.whileLoop;

/**
 * Print even no up to 10
 * */

public class PrintEventOddNo {
	
	public static void main(String[] args) {
		int evenNum = 0;
		int oddNum = 1;
		
		System.out.println("Even Number Output :");
		while (evenNum<=10) {
			System.out.println(evenNum);
			evenNum += 2;
		}
		
		System.out.println("Odd Number Output :");
		while (oddNum<=10) {
			System.out.println(oddNum);
			oddNum += 2;
		}
		
		System.out.println("Odd Number in descending order from 100 to 50 Output :");
		int oddNum2 = 100;
		while(oddNum2>=50) {
			System.out.println(oddNum2);
			oddNum2--;
		}
		
		System.out.println("Print Even no from 1 till 100 if the no is not divisible by 3:");
		int evenNum1 = 1;
		while(evenNum1<=100) {
			if(evenNum1%3!=0) {
				System.out.println(evenNum1);
			}
			evenNum1++;
		}
	}

}
