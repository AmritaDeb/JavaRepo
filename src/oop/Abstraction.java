package oop;

/* Hiding the implementation details is known as abstraction 
 * A method without implementation is known as abstract method
 * A method with implementation is known as concrete method 
 * 
 * A class prefix with abstract known as abstract class
 * we can not create object of abstract class
 * abstract class can have -
 * 1. only abstract method
 * 2. only concrete methods
 * 3. both abstract and concrete methods 
 * 
 * An Abstract class is a partial abstraction
 * An Interface is a full abstraction*/

public class Abstraction {

	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		Cat cat = new Cat();
		
		dog.makeNoise();
		cat.makeNoise();
	}
}

abstract class Animal1{
	abstract public void makeNoise();
	public void breath() {
		System.out.println("Imhale o2 and exhale co2");
	}
}

class Dog1 extends Animal1{
	public void makeNoise() {
		System.out.println("Bow.. Bow..");
	}
}

class Cat extends Animal1{
	public void makeNoise() {
		System.out.println("Mew.. Mew..");
	}
}
