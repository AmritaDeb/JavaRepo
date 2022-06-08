package string;

public class StringComparisonUsingMethodEquals {
	
	// String class equals("") used to compare 2 strings and not their reference
	// Object class implementation of equals() is overridden with string class equals() implementation

	public static void main(String[] args) {
		
		// Case 1:
		String s1a = "Apple";
		String s1b = "Apple";
		System.out.println(s1a.equals(s1b)); 		// true
		
		// Case 2:
		String s2a = "Apple";
		String s2b = "apple";
		System.out.println(s2a.equals(s2b)); 				// false
		
		// In String class we have a non static method, known as equalIgnoreCase()
		// It is used to compare 2 strings and it will not consider the case
		System.out.println(s2a.equalsIgnoreCase(s2b)); 		// true
		
	}
}
