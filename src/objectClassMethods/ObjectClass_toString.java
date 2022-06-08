package objectClassMethods;

public class ObjectClass_toString {
	
	// toString method returns the reference of object in string format
	
	public static void main(String[] args) {
		
		// Example 1:
		
		DemoClass ob = new DemoClass();
		System.out.println(ob);     // objectClassMethods.DemoClass@7852e922 [internally toString() will be called]
		System.out.println(ob.toString());  	// objectClassMethods.DemoClass@7852e922
		
		// Example 2:
		
		Integer value = 12;
		
		System.out.println(value);                			// 12
		System.out.println(value.getClass());     			// class java.lang.Integer
		System.out.println(value.toString());     			// 12
		System.out.println(value.toString().getClass());  	// class java.lang.String
	}

}
