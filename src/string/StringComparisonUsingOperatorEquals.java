package string;

public class StringComparisonUsingOperatorEquals {
	
	// The operator "==" used to compare 2 strings
	// It compares the values present inside the reference variables and not the string object
	// It used to compare the reference of the string object

	public static void main(String[] args) {
		
		//Case 1: 
		String s1a = "apple";
		String s1b = "apple";
		System.out.println(s1a==s1b);		// true
		
		//Case 2:
		String s2a = "Apple";
		String s2b = "apple";
		System.out.println(s2a==s2b);		// false
	}
}
