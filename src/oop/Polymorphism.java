package oop;

/* An object behaving in different forms in different places is known as polymorphism */

public class Polymorphism {

	public static void main(String[] args) {
		AnimalClass animal = new AnimalClass();
		animal.speak();
		System.out.println(animal.leg);
		
		DogClass dog = new DogClass();
		dog.speak();							// Method overriding
		dog.speak(2);							// Method overloading
		System.out.println(dog.tail);
		
		AnimalClass dogAnimal = new AnimalClass();			// upcasting
		dogAnimal.speak();
		
	}
}

class AnimalClass{
	int leg = 4;
	void speak() {
		System.out.println("Speaking..");
	}
}

class DogClass extends AnimalClass {
	int tail = 1;
	void speak() {
		System.out.println("Barking..");
	}
	
	int speak(int speakingCount) {
		System.out.println("Speaking: "+ speakingCount);
		return speakingCount;
	}
}
