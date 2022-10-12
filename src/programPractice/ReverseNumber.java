package programPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 54321;
		int len = 0;
		while(num>0) {
			len++;
			num/=10;
		}
		System.out.println(len);
		
		int result = 0;
		
		for(int i=0; i<len; i++) {
			result = result*10 + num%10;	
			num/=10;
		}
	}
}
