package practice;

import java.util.ArrayList;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "I am a test engineer";

		String [] s = s1.split(" ");
		String s2 = "";
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(s.length);
		System.out.println(s[0]);
		System.out.println(s[4]);
		System.out.println(s[s.length-1]);

		for (int i=s.length-1; i>=0; i--){
			System.out.println(s[i]);
			list.add(s[i]);
		}
		System.out.println(list);
		
		String space = " ";
		s2 = String.join(space, list);
		System.out.println(s2);
	}
}
