package builtInMethods;

public class subStringMethod {
	
	// subString() is having 2 method signature
	// i) subString(int)   [ inclusive ]
	// ii) subString(int, int)   [ exclusive ]
	
	public static void main(String[] args) {
		String s1 = "Mango Milk Shake";
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,3));
		System.out.println(s1.substring(2,5));
	}

}
