package builtInMethods;

public class valueOfMethod {
	
	// valueOf() is used to convert primitive type to non-primitive type(object)
	// valueOf() is a static method of String class, hence it should be invoked as className.methodName();
	// Retrun type => String
	// usage => String.valueOf();

	public static void main(String[] args) {
		int a = 100;
		String s1 = String.valueOf(a);			// Boxing
		System.out.println(s1); 				// 100
		System.out.println(s1.getClass()); 		// class java.lang.String
	}
}
