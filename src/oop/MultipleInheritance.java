package oop;

/*
 * Where 1 sub class is implemented by multiple base class(interface)
 * */

public class MultipleInheritance {

	public static void main(String[] args) {
		Child child = new Child();
		child.sporting();
		child.singing();
	}
}

interface Father {
	void sporting();
}

interface Mother {
	void singing();
}

class Child implements Father, Mother {
	public void sporting() {
		System.out.println("Playing badminton..");
	}
	public void singing() {
		System.out.println("Singing song..");
	}
}