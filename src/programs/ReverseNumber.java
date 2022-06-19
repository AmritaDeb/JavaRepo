package programs;

public class ReverseNumber {
	public static void main(String[] args) {
		
		//Way 1 : 
		
		int num1 = 5432;
		int tempNum = num1;
		int len = 0;
		while(num1>0) {
			len++;
			num1 /= 10;
		}
		System.out.println(len);

		int result = 0;
		
		for(int i = 0; i<len; i++) {
			result = result*10 + tempNum%10;
			tempNum/=10;
		}
		System.out.println(result);
		
		//Way 2 :
		
		
	}
}
