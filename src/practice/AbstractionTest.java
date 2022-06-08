package practice;

public class AbstractionTest {

	public static void main(String[] args) {
		SeleniumT s = new SeleniumT();
		s.domain();
		s.test();
	}
}

abstract class AutomationT{
	abstract void domain();
	void test() {
		System.out.println("concrete");
	}	
}

class SeleniumT extends AutomationT{

	@Override
	void domain() {
		System.out.println("Abstruct");
		
	}
	
}