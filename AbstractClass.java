package com.OOP;

/*
 * abstract class -idea or concepts that are doesn't exist physically in real world
 * concrete - refers to physical object in a real world
 */

abstract class Member{
	abstract void welcomeMsg(); //abstract method
	
	void getName() {
		//just an example we can write concrete method in abstract class
	}
}

class Teacher extends Member{
    
	@Override
	void welcomeMsg() {
    System.out.println("welcome from Teacher");		
	}
	
}
class Student extends Member{

	@Override
	void welcomeMsg() {
    System.out.println("Welcome student");		
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		Student s1 = new Student(); //not possible to call
	
		
		Member[] member = new Member[4]; //can't create object for abstract class only use by ARRAY.
		member[0] = new Teacher();
		member[1] = new Teacher();
		member[2] = new Student();
		member[3] = new Student();

		
		for(Member m1 : member) {
			m1.welcomeMsg();
		}

	}

}
