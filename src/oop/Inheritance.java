package oop;

/* The process of acquiring the attribute and behavior from superclass to subclass is known inheritance.
 * We can achieve inheritance using 'extends' keyword
 * 
 * The class from where all the properties are acquired is known as superclass
 * The class which is acquiring the property of super class is known as subclass
 * 
 * subclass can have all the properties of superclass
 * superclass can not have properties of subclass
 * 
 * By creating subclass object, we can access static and non-static members of superclass and subclass both
 * By creating superclass object, we can access static and non-static members of superclass only
 * 
 * final class can not be inherited
 * final data members can be inherited but can not be reinitialized
 * final methods can not be overridden
 * */

public class Inheritance {
	
	static int i;
	
	public static void main(String[] args) {
		System.out.println("Begining from main");
		System.out.println(i);
		A a = new A();
		System.out.println(a.i);
		a.test();
		System.out.println("Ending in main");
		B b = new B();
		System.out.println(b.i);
		b.test();
	}
	
}

class A {
	int i; 
	static int j;
	void test() {
		System.out.println("From A.test()");
	}
	A(){
		System.out.println("From A()");
	}
	static {
		System.out.println("From A SIB");
	}
	{
		System.out.println("From A IIB");
	}
}

class B extends A {
	int i;
	static int m;
	void test() {
		System.out.println("From B.test()");
	}
	B(){
		System.out.println("From B()");
	}
	static {
		System.out.println("From B SIB");
	}
	{
		System.out.println("From B IIB");
	}
	
}

class C{
	
}
