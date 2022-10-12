package wrapperClass;

public class Boxing{
	
	/* Boxing : The process of converting primitive type to non-primitive type(object) */
	// valueOf() is a static method of String class, hence it should be invoked as className.methodName();

	public static void main(String[] args) {
		
		// intToInteger 
		int a = 10;
		Integer a1 = Integer.valueOf(a);
		Integer a2 = a;						// auto-boxing
		System.out.println(a1);
		System.out.println(a2);
		
		// charToCharacter
		char b = 'm';
		Character b1 = Character.valueOf(b);
		Character b2 = b;					// auto-boxing
		System.out.println(b1);
		System.out.println(b2);
		
		// byteToByte
		byte c = 10;
		Byte c1 = Byte.valueOf(c);
		Byte c2 = c;						// auto-boxing
		System.out.println(c1);
		System.out.println(c2);
		
		// booleanToBoolean
		boolean d = true;
		Boolean d1 = Boolean.valueOf(d);
		Boolean d2 = d;						// auto-boxing
		System.out.println(d1);
		System.out.println(d2);
		
		// charToString
		char[] ch = {'h','e','l','l','o'};
		String s = String.valueOf(ch);
		System.out.println(s);
		//String s2 = ch;						// auto-boxing is not allowed
		
		// intToString
		int in = 253;
		String string = String.valueOf(in);
		System.out.println(string);
		System.out.println(string.getClass());
		
		Integer resultInt = Integer.parseInt(string);
		System.out.println(resultInt);
		System.out.println(resultInt.getClass());
		
		
	}

}
