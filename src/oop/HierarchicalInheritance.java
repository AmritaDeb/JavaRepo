package oop;

/*
 * Where 1 super class is inherited by many sub classes
 * */

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Son son = new Son();
		Daughter daughter = new Daughter();
		
		son.sporting();
		daughter.singing();
	}
}

class Mom {
	void sporting() {
		System.out.println("Playing badminton..");
	}
	
	void singing() {
		System.out.println("Singing..");
	}
}

class Son extends Mom {
	
}

class Daughter extends Mom {
	
}
