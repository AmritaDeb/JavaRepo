package stringBufferAndStringBuilder;

public class insertMethod {
	
	// insert() is used to insert a string in a StringBuffer/StringBuider object
	// it can accept 2 arguments
	// arg1 : it's an integer which specify the index where string to be inserted
	// arg2 : it's a string
	
	public static void main(String[] args) {
		
		// StringBuffer
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println();
		
		buffer.insert(0, "hello");
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println();
		
		buffer.insert(2, "amy");
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println();
		
		// StringBuilder
		StringBuilder builder = new StringBuilder();
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println();
		
		builder.insert(0, "hello");
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println();
		
		builder.insert(2, "amy");
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println();
	}

}
