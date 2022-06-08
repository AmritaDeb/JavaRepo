package string;

public class EmptyStringAndNull {

	public static void main(String[] args) {
		
		/* Case 1: String object is created with empty string in it, i.e., the length of the string is 0.
		The reference of the string object will be stored in the reference variable */
		String s1 = "";
		
		/* Case 2: String object is not created, null keyword is stored inside reference variable */
		String s2 = null;
		
		
		System.out.println(s1); 			// output will be empty
		System.out.println(s1.length());	// 0
		System.out.println(s2);				// output will be null
		System.out.println(s2.length());	// NullPointerException
	}
}
