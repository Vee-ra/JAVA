package com.OOP;

class Cycle{
	void display() {
		System.out.println("i'm from cycle");
	}
}
 //this method uesd for only one time so we can go for "AnonymousClass"
//
//class TriCycle{
//	void display() {
//		System.out.println("i'm from Tricycle");
//	}
//}
public class AnonymousClass {

	public static void main(String[] args) {
		
		Cycle c = new Cycle()
				{
			void display() {
				System.out.println("i'm from Tricycle"); //Anonymous class
				}
				};
				
				c.display(); //Anonymous class redirect to interface

				Cycle c2 = new Cycle();
				c2.display();
						
//		TriCycle t = new TriCycle();
//		t.display();

	}

}
