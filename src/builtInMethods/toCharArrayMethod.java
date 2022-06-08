package builtInMethods;

public class toCharArrayMethod {

	// return type => char array
	// usage => String.toCharArray()
	
	public static void main(String[] args) {
		char[] a = "apple".toCharArray();
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
