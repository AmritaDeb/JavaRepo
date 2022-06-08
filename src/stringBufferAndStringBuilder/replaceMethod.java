package stringBufferAndStringBuilder;

public class replaceMethod {
	
	// replace() can accept 3 arguments
	// arg 1 : starting index (including)
	// arg 2 : ending index (excluding)
	// arg 3 : new string
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Amrita");
		System.out.println(buffer);
		buffer.replace(1, 3, "rp");
		System.out.println(buffer);
	}

}
