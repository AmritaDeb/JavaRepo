package converting;

public class StringToChar {
	
	// toCharArray() is used to convert String to char[]

	public static void main(String[] args) {
		
		String s1 = "lovely";
		char[] a = s1.toCharArray();
		System.out.println("String to Char:");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("String to Char in reverse order:");
		for(int i=a.length-1; i>0; i--) {
			System.out.println(a[i]);
		}
	}
}

