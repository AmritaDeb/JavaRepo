package oop;

/* Interface is a type of class where the methods are by default abstract and 
 * data members are by default static and final
 * 
 * we can achieve interface by using 'implements' keyword
 * */

public class Interface {

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.makeNoise();
	}
}

interface Dogs {
	static final int legs = 4;
	void makeNoise();
}

class Puppy implements Dogs {
	public void makeNoise() {
		System.out.println("Bow.. Bow..");
	}
}


