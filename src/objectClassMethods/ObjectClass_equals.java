package objectClassMethods;

public class ObjectClass_equals {
	
	// equals() is used to compare the ref of object
	// equals() returns the boolean result
	
	public static void main(String[] args) {
		
		// if both the ref variables have same ref address, it returns true
		
		DemoClass ob1 = new DemoClass();
		DemoClass ob2 = ob1;
		System.out.println(ob1.equals(ob2));
		
		// if both the ref variables have different ref address, it returns false
		
		DemoClass ob3 = new DemoClass();
		DemoClass ob4 = new DemoClass();
		System.out.println(ob3.equals(ob4));
	}

}
