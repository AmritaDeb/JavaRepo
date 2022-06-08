package converting;

public class CharToStringWithBuiltinMethod {
	
	// we can convert a char[] into a String using-
	// i) String class constructor
	// ii) valueOf() of String class
	
	public static void main(String[] args) {
		char[] a = {'h','e','l','l','o'};
		System.out.println(a.length);
		System.out.println("Elements of array:");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array to String- way 1:");
		String s1 = new String(a);
		System.out.println(s1);
		
		System.out.println("Array to String- way 2:");
		String s2 = String.valueOf(a);		// Boxing
		System.out.println(s2);
	}

}
