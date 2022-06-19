package loop.whileLoop;

public class PrintAscendingDescendingNo {

	public static void main(String[] args) {
		int counter1 = 0;
		int num1 = 1;
		System.out.println("Start num++");
		while (counter1<5) {
			System.out.println(num1++);
			counter1++;
		}
		
		int counter2 = 0;
		int num2 = 1;
		System.out.println("Start ++num");
		while (counter2<5) {
			System.out.println(++num2);
			counter2++;
		}
		
		int num3 = 10;
		System.out.println("Print number from 10 to 0");
		while(num3>=0) {
			System.out.println(num3);
			num3--;
		}
	}
}
