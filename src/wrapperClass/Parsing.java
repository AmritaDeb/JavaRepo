package wrapperClass;

public class Parsing {

	/* Parsing : The process of converting a String type to other non-premitive type */

	public static void main(String[] args) {

		// StringToInteger
		String a = "1001";
		Integer a1 = Integer.parseInt(a);
		System.out.println("-----StringToInteger-----");
		System.out.println(a1);
		System.out.println(a1.getClass());

		// StringToFloat
		String b = "10.0f";
		Float b1 = Float.parseFloat(b);
		System.out.println("-----StringToFloat-----");
		System.out.println(b1);

		String c = "10";

		// StringToShort
		Short c1 = Short.parseShort(c);
		System.out.println("-----StringToShort-----");
		System.out.println(c1);

		// StringToByte
		Byte c2 = Byte.parseByte(c);
		System.out.println("-----StringToByte-----");
		System.out.println(c2);

		// StringToLong
		Long c3 = Long.parseLong(c);
		System.out.println("-----StringToLong-----");
		System.out.println(c3);

		// StringToDouble
		String d = "10.25";
		Double d1 = Double.parseDouble(d);
		System.out.println("-----StringToDouble-----");
		System.out.println(d1);

		// StringToBoolean
		Boolean boo = Boolean.parseBoolean("True");
		System.out.println("-----StringToBoolean-----");
		System.out.println(boo);
		
		// StringTochar
		String str = "amrita";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(str.length()-1);
		System.out.println("-----StringToChar-----");
		System.out.println(ch1);
		System.out.println(ch2);

		String s[] = { "10", "20" };
		int[] s1 = new int[s.length];
		System.out.println("-----StringArrayToInteger-----");
		for (int i = 0; i < s1.length; i++) {
			try {
				s1[i] = Integer.parseInt(s[i]);
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
			System.out.println(s1[i]);
		}

	}

}
