package builtInMethods;

public class indexOfMethod {
	
	// indexOf() is used to check whether a char or a substring present in a string
	// if the char or substring is present, indexOf() returns it's position, i.e., either 0 or >0
	// if the given char or substring is not present, indexOf() returns -1
	// indexOf() is having 2 method signature 
	// i) 1 argument (char/string) 
	// ii) 2 arguments (char/string, int)
	
	public static void main(String[] args) {
		
		String s1 = "apple";
		System.out.println(s1.indexOf("p"));		// -> indexOf(char) => 
		System.out.println(s1.indexOf("pp"));		// -> indexOf(string) 
		System.out.println(s1.indexOf("p",2));		// -> indexOf(char,int)
		System.out.println(s1.indexOf("p",2));		// -> indexOf(string,int) 
		
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.indexOf("pe"));
	}

}
