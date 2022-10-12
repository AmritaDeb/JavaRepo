package programs;

public class OccuranceOfString {

	public static void main(String[] args) {
		String input = "Competitionthnhtthnjkttt";
		char[] inputChar = input.toCharArray();
		int count = 0;
		
		for(int i=input.length()-1; i>=0; i--) {
			if(inputChar[i] == 't') {
				count++;
			}
		}
		System.out.println(count);
	}
}
