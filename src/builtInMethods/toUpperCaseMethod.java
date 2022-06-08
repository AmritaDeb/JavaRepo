package builtInMethods;

public class toUpperCaseMethod {
	
	// toUpperCase() is used to convert a string to its upper case
	// return type => String
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1.toUpperCase();
		System.out.println(s1); 				// hello
		System.out.println(s2); 				// HELLO
		System.out.println(s1.toUpperCase()); 	// HELLO
	}

}
