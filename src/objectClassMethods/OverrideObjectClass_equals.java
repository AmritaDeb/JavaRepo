package objectClassMethods;

public class OverrideObjectClass_equals {

	public static void main(String[] args) {
		DemoOverrideClass ob = new DemoOverrideClass();
		DemoOverrideClass ob1 = new DemoOverrideClass();
		
		System.out.println(ob.equals(ob1));
	}
}
