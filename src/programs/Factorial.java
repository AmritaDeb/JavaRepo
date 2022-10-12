package programs;

public class Factorial {
	
	public static int fact(int input) {
		int result = 1;
		for(int i=1; i<=input; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static int fact_rec(int input) {
		if(input == 1) {
			return 1;
		}
		return input * fact_rec(--input);
	}
	
	public static void main(String[] args) {
		System.out.println(fact(3));
		
		System.out.println(fact_rec(5));
	}

}
