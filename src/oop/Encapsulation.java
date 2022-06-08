package oop;

/* The process of binding the attributes and behavior of an object together is known as Encapsulation
 * Wrapping up of data as well as methods is known as encapsulation
 * Encapsulation is achieved with the help of class
 */

public class Encapsulation {
	
	int empId;
	String empName;
	double empSalary;
	
	Encapsulation(){
		
	}
	
	Encapsulation(int id, String name, double salary){
		empId = id;
		empName = name;
		empSalary = salary;
	}
	
	void empWork() {
		System.out.println(this.empName + " should work on automation");
	}
	
	public static void main(String[] args) {
		Encapsulation empOb = new Encapsulation(1,"Amrita",20000);
		System.out.println(empOb.empId);
		System.out.println(empOb.empName);
		System.out.println(empOb.empSalary);
		empOb.empWork();
	}
	

}
