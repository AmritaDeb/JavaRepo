package wrapperClass;

public class Unboxing {

	/* Unboxing : The process of converting non-premitive(object) type to premitive type */

	public static void main(String[] args) {

		// IntegerToint
		Integer a = 10;
		int a1 = a.intValue();
		int a2 = a; 			// auto-boxing
		System.out.println(a1);
		System.out.println(a2);

		// charToCharacter
		Character b = 'm';
		char b1 = b.charValue();
		char b2 = b; 			// auto-boxing
		System.out.println(b1);
		System.out.println(b2);

		// byteToByte
		Byte c = 10;
		byte c1 = c.byteValue();
		byte c2 = c; 			// auto-boxing
		System.out.println(c1);
		System.out.println(c2);

		// booleanToBoolean
		Boolean d = true;
		boolean d1 = d.booleanValue();
		boolean d2 = d; 		// auto-boxing
		System.out.println(d1);
		System.out.println(d2);
	}

}
