package string;

public class StringObjectMemoryInsidePool {
	
	public static void main(String[] args) {
		 
		// String class objects are immutable in nature
		// Once an object is created, can not be modified, so it's known as immutable object
		// The immutable object of String class gets their memory inside String pool [String Constant Pool]
		
		// Case 1 : 
		System.out.println("if values are different, 2 different ref address will be created inside string pool, mapped with the variable");
		String s1a = "Hello";
		System.out.println(s1a.hashCode());
		s1a = "hello";
		System.out.println(s1a.hashCode());
		
		// Case 2 : 
		System.out.println("if values are same, 1 ref address will be created inside string pool, mapped with the variable");
		String s2a = "Hello";
		System.out.println(s2a.hashCode());
		s2a = "Hello";
		System.out.println(s2a.hashCode());
		
		// Case 3 : 
		System.out.println("if values are same, 1 ref address will be created inside string pool, mapped with both variables");
		String s3a = "hello";
		String s3b = "hello";     		// s3b = s3a
		System.out.println(s3a.hashCode());
		System.out.println(s3b.hashCode());
		
		// Case 4 : 
		System.out.println("");
		String s4a = "hello";
		String s4b = "hello";
		System.out.println(s4a.hashCode());
		s4a = "bye";
		System.out.println(s4a.hashCode());
		System.out.println(s4b.hashCode());
		
	}

}
