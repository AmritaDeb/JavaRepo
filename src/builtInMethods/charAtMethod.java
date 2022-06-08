package builtInMethods;

public class charAtMethod {
	
	// charAt() is used to access a character in a string at the given position
	// charAt() returns a character
	// the index value of a string begins with 0 and ends at string length-1
	// if the index = length/>length of string, then charAt() will raise StringIndexOutOfBoundException
	
	public static void main(String[] args) {
		String s1 = "apple";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(s1.length()-1));
		System.out.println(s1.charAt(s1.length()));
	}

}
