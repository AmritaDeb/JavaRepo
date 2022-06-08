package oop;

/*
 * Where we will get only 1 base class and 1 derived class
 * Where only 1 class can inherit the base class
 * */

public class SingleInheritance {
	
	public static void main(String[] args) {
		Dog.walk();
		Dog.bark();
		System.out.println("How many eyes : "+ Dog.eyes);
		System.out.println("What is the bread name : "+ Dog.bread);
		Dog dog = new Dog();
		dog.run();
		dog.wag();
		System.out.println("How many legs : "+ dog.legs);
		System.out.println("what is the color : "+ dog.color);
	}

}

class Animal {
	static int eyes = 2;
	int legs = 4;
	static void walk() {
		System.out.println("It can walk");
	}
	void run() {
		System.out.println("It can run");
	}
	
}

class Dog extends Animal {
	static String bread = "pug";
	String color = "white";
	static void bark() {
		System.out.println("It can bark");
	}
	void wag() {
		System.out.println("It can wagging");
	}
}
