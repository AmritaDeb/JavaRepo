package builtInMethods;

public class spiltMethod {
	
	// split() is used to break a string into a multiple string
	// return type => array of string / String[]
	// For split, we can pass a string (pattern), based on which original string should be splited
	
	public static void main(String[] args) {
		String s1 = "Mango Milk Shake";
		String[] s2 = s1.split("");
		System.out.println(s2.length);
		for(int i=0; i<s2.length; i++) {
			System.out.println(s2[i]);
		}
	}

}
