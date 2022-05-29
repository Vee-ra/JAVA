package com.OOP;

class Outer{ //outerclass
	
	int x;
	void outerDisplay() {
		System.out.println("Outer display");
	}
	class Inner{ //innerclass
		int y;
		void innerDisplay() { 
			System.out.println("Inner display");
		}
	}
	static class Inner2{ //static inner class
		int z;
		void inner2Display() {
		System.out.println("inner2display");
	}

	}
	
}

public class InnerClass {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.outerDisplay();
		
		Outer.Inner inner = outer.new Inner(); //concrete inner class call
		inner.innerDisplay();
		
		Outer.Inner2  inner2 = new Outer.Inner2(); //static inner class call 
		inner2.inner2Display();
		
	}

	}

