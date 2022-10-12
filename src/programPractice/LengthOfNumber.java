package programPractice;

public class LengthOfNumber {

	public static void main(String[] args) {
		int num = 5432;
		int len = 0;
		while (num>0) {
			len++;
			num/=10;
		}
		System.out.println(len);
		
		int len1 = 0;
		for(int num1=5432; num1>0; len1++) {
			num1/=10;
		}
		System.out.println(len1);
	}
}
