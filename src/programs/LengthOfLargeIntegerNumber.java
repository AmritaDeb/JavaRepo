package programs;

public class LengthOfLargeIntegerNumber {

	public static void main(String[] args) {
		int num = 5432;
		int len = 0;
		while(num>0) {
			len++;
			num /= 10;
		}
		System.out.println(len);
		int len1=0;
		for(num = 54321; num>0; len1++) {
			num /= 10;
		}
		System.out.println(len1);
		
		
	}
}
