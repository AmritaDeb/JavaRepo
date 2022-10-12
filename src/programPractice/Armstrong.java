package programPractice;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int inputNum = num;
		int result = 0;
		int remainder = 0 ;
		
		String input = String.valueOf(num);
		int len = input.length();
		System.out.println(len);
		
		while(inputNum != 0) {
			remainder = inputNum%10;
			result += Math.pow(remainder, len);
			inputNum/=10;
		}
		System.out.println(result);
	}
}
