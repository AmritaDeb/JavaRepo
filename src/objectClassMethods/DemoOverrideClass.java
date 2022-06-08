package objectClassMethods;

public class DemoOverrideClass {
	
	int i = 10;
	public boolean equals(Object ob) {
		if (this.i == ((DemoOverrideClass)ob).i) {
			return true;
		}
		return false;
	}

}
