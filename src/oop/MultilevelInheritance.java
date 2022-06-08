package oop;

public class MultilevelInheritance {
	
	/*
	 * Where we can have different base class and derived class in every level
	 * Where 1 derived class can inherit 1 base class, 
	 * then by making this derived class as base class in 2nd level, another derived class can inherit that 2nd level base class and so on
	 * */

	public static void main(String[] args) {
		Maruti800 m = new Maruti800();
		m.vehicleType();
		m.brandName();
		m.modelName();
	}
}

class Car {
	public void vehicleType() {
		System.out.println("Vehicle type is : Car");
	}
}

class Maruti extends Car {
	public void brandName() {
		System.out.println("Brand name is : Maruti");
	}
}

class Maruti800 extends Maruti {
	public void modelName() {
		System.out.println("Model name is : Maruti800");
	}
}
