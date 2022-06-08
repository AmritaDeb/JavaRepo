package basic;

class Pen {
	
	void execute() {
		System.out.println("Pen");
	}

}

class Paper {
	
	void execute(Pen pen) {
		System.out.println("Paper");
		pen.execute();
	}

}

public class MainClass {
	
	public static void main(String[] args) {
		
		Paper paperOb = new Paper();
		paperOb.execute(new Pen());
	}

}
