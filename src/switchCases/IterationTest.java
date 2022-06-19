package switchCases;

public class IterationTest {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			switch(i) {
			case 0 :
				System.out.println("Value is " + i);
				break;
			case 4 :
				System.out.println("Value is " + i);
				break;
			default :
				System.out.println("Value is greater than 0 and less than 4");
				break;
			}
		}
	}

}
