package stringBufferAndStringBuilder;

public class deleteMethod {

	// delete() is used to delete the string for given range
	// it accepts 2 arguments
	// arg1 : starting index (including type)
	// arg2 : ending index (excluding type)
	
	public static void main(String[] args) {
		
		// StringBuffer
		StringBuffer buffer = new StringBuffer("Kolkata");
		System.out.println(buffer);						// Kolkata
		System.out.println(buffer.delete(0, 3));		// kata
		System.out.println(buffer.delete(0, 2));		// ta
	}
}
