package stringBufferAndStringBuilder;

public class appendMethod {
	
	// append() is used to concatinate a string to StringBuffer/StringBuider object string
	
	public static void main(String[] args) {
		
		// StringBuffer
		StringBuffer buffer = new StringBuffer("Kolkata");
		System.out.println(buffer);
		buffer.append(" - ");
		buffer.append("City of joy");
		System.out.println(buffer);
		
		// String 
		String s1 = new String("Amrita");
		System.out.println(s1);
		s1.concat("Deb");
		System.out.println(s1);
	}

}
