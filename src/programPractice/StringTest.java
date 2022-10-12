package programPractice;

import java.util.ArrayList;

public class StringTest {

	public static void main(String[] args) {
		String s = "I am Indian";
		System.out.println(s.length());
		
		String[] str = s.split(" ");
		System.out.println(str.length);
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=str.length-1; i>=0; i--) {
			list.add(str[i]);
		}
		System.out.println(list);
		
		String result;
		result = String.join(" ", list);
		System.out.println(result);
	}
}
