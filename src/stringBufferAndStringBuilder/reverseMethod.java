package stringBufferAndStringBuilder;

public class reverseMethod {
	
	// reverse() is used to reverse the string in StringBuffer/StringBuider
	
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Kolkata");
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
	}

}
