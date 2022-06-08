package string;

public class StringClassObjectCreation {

	public static void main(String[] args) {
		// String is a non-primitive datatype, i.e, String is a class
		// String is also known as wrapper class
		// Whenever we need to store literal of type string, it is mandatory to create object of String class
		
		/* 2 ways to create object of String class */
		
		// Way 1 : Using new keyword and String class constructor
		String s1;
		s1 = new String("Hello");			// reference will be stored in heap area
		
		// Way 2 : Using assignment operator and String literals
		String s2;
		s2 = "Hello";						// reference will be stored in string pool area

		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		// If we create a object using 'new' keyword, the string object will be created inside heap area
		// If we create a object using '=' operator, the string object will be created inside string pool
		// So both the reference will be different even though values are same
		
		System.out.println(s1==s2); 			// false
		System.out.println(s1.equals(s2)); 		// true
		System.out.println(s1.compareTo(s2)); 	// 0
	}

}
