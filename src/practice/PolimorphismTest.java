package practice;

public class PolimorphismTest {

	public static void main(String[] args) {
		OverridingSub sub = new OverridingSub();
		sub.test();
	}
}

class Overloading {
	void waitMethod() {

	}

	void waitMethod(int time) {

	}
	
	void waitMethod(int time, int pol) {

	}
}

class OverridingSuper{
	void test() {
		System.out.println("super");
	}
}

class OverridingSub extends OverridingSuper {
	void test() {
		System.out.println("sub");
	}
}


