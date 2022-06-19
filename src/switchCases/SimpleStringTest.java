package switchCases;

public class SimpleStringTest {

	public static void main(String[] args) {
		String mobile = simpleString();
		
		switch (mobile) {
		case "samsung":
			System.out.println("Buy a " + mobile);
			break;
		case "iPhone":
			System.out.println("Buy a " + mobile);
			break;
		case "nokia":
			System.out.println("Buy a " + mobile);
			break;
		default:
			System.out.println("Buy a " + mobile);
			break;
		}
	}
	
	public static String simpleString() {
		return "iPhone";
	}
}


