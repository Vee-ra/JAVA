package com.OOP;

/*
 * defines what to do but not how to do
 * Methods are abstract and public by default
 * concrete methods can be define from java 1.8V on interface with default keyword
 * variables are static final and public by default
 * interface can't be instantiated - no constructors
 * A class can implement interface/interfaces - multiple inheritance
 * Class implementing interface should define all abstract methods.
 * an interface can extend interface/interfaces.
 */

interface Ridable{  //Vehicle  - Raid[able] means interface
	
	//SAM interface - single abstract method
	//Functional interface - java 8 "()->" --->Lambda expression
	
	public static final int MaxSpeed = 0; //instance variables
	
	 void ride(); //inbuild public abstract method
	 
	 default void display() {
		 System.out.println("hello from interface"); //java 1.8 allows to define method into "interface'
	 }
}

class Car implements Ridable{
	public void ride() {
		System.out.println("Driving a car");
	}
	
//	public void display() { //Method overriding also possible in interface
//		 System.out.println("hello from Car class");
//	 }
	//un comment for implements check in Car object
}

class Bike implements Ridable{
	public void ride() {
		System.out.println("Driving a Bike");
	}
}
class Mechanic{
	//void check(Car c) {
		void check(Ridable r) {
        System.out.println("Checking");
		r.ride();
	}
}

public class Interface {

	public static void main(String[] args) {
		
		Ridable r = new Car(); //Interface not allowed to create  object for it
		 //object instaniation for Car class using interface
		r.display(); //Car implements Ridable

		System.out.println("-------------");
		
		Car c = new Car();
		Bike b = new Bike();
		
		Mechanic mechanic = new Mechanic();
		mechanic.check(c);
		mechanic.check(b);
		System.out.println("--------------");
		
		Ridable r2 = new Ridable() {
            @Override
			public void ride() {
				System.out.println("i'm from anonymous class");
			}
		};
		r2.ride();
		
		System.out.println("---------------");
		
		Ridable r3 = ()-> System.out.println("i'm from Lambda expression");
		r3.ride();
		
		//-->redirect to inheritance
				

	}

}
