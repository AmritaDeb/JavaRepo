package builtInMethods;

public class containsMethod {

	// contains() is used to check whether a char-sequence/sub-string is present in a string or not
	// if present, it returns true else false
	// return type => boolean
	public static void main(String[] args) {
		String s1 = "Amrita";
		System.out.println(s1.contains("r"));		// true
		System.out.println(s1.contains("b"));		// false
		System.out.println(s1.contains("ta")); 		// true
	}
}
