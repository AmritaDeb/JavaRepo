package programs;

public class SwapTwoMembers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		// using temp variable
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("using temp variable");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		// without using temp variable
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("without using temp variable");
		System.out.println("a:" + a);
		System.out.println("b:" + b);

	}

}
