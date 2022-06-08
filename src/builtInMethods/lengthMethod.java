package builtInMethods;

public class lengthMethod {
	
	// length() returns the length of the string
	// return type => integer
	
	public static void main(String[] args) {
		String s1 = "Amrita";
		String s2 = new String("Deb");
		System.out.println("Length of Amrita: " + s1.length());
		System.out.println("Length of Deb: " + s2.length());
		System.out.println("Length of QA-Engineer: " + "QA-Engineer".length());
		int a = s1.length();
		System.out.println(a);
	}

}
