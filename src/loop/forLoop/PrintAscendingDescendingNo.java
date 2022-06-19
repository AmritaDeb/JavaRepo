package loop.forLoop;

public class PrintAscendingDescendingNo {

	public static void main(String[] args) {
		int counter1 = 0;
		System.out.println("Start num++");
		for(int num1 = 1; counter1<5; counter1++) {
			System.out.println(num1++);
		}
		
		int counter2 = 0;
		System.out.println("Start ++num");
		for(int num2 = 1; counter2<5; counter2++) {
			System.out.println(++num2);
		}
		
		System.out.println("Print number from 10 to 0");
		for(int num3 = 10; num3>=0; num3--) {
			System.out.println(num3);
		}
	}
}
