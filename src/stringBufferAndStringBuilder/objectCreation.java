package stringBufferAndStringBuilder;

public class objectCreation {
	
	// StringBuffer and StringBuilder classes are used to create String object which are mutable in nature
	// created String object of type StringBuffer / StringBuilder class, can be easily modify
	// The object of StringBuffer and StringBuilder classes are created in heap area and not in string pool
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = s1.concat("Amy");
		System.out.println(s1);			// Hello
		System.out.println(s2);			// HelloAmy
		System.out.println();
		
		StringBuffer buffer1 = new StringBuffer();
		StringBuffer buffer2 = new StringBuffer("Hello");
		buffer1.append("Amy");
		buffer2.append("Amy");
		System.out.println(buffer1);		// Amy
		System.out.println(buffer2);		// HelloAmy
		System.out.println();
		
		StringBuilder builder1 = new StringBuilder();
		StringBuilder builder2 = new StringBuilder("Hello");
		builder1.append("Amy");
		builder2.append("Amy");
		System.out.println(builder1);		// Amy
		System.out.println(builder2);	// HelloAmy
		System.out.println();
	}

}
