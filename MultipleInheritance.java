package com.OOP;

class A{
	void display() {
		System.out.println("from Class A");
	}
}
class B extends A{
	void display() {
		System.out.println("from Class B");
    }
}
class C extends B{
	//execute the nearast class
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		C c = new C();
		c.display();

	}

}
