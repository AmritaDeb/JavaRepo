package builtInMethods;

public class toLowerCaseMethod {
	
	// toLowerCase() is used to convert a string to its lower case
	// return type => String
		public static void main(String[] args) {
			String s1 = "HELLO";
			String s2 = s1.toLowerCase();
			System.out.println(s1); 				// HELLO
			System.out.println(s2); 				// hello
			System.out.println(s1.toLowerCase()); 	// hello
		}

}
