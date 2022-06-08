package converting;

public class CharToStringWithoutBuiltinMethod {

	public static void main(String[] args) {
		char[] a = {'h','e','l','l','o'};
		System.out.println(a.length);
		System.out.println("Elements of array:");
		String s1 = "";
		for(int i=0; i<a.length; i++) {
			 s1 += a[i];   // s1 = s1 + a[i]			
		}
		System.out.println("Array to String:");
		System.out.println(s1);
		
		String s2 = "";
		for(int i=a.length-1; i>=0; i--) {
			s2 += a[i];
		}
		System.out.println("Array to String in reverse order:");
		System.out.println(s2);
	}
}
