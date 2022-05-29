package com.OOP;

class BoxB{
	int length;
	int height;
	int breadth;
	static int boxCount; //execution starts when class is loaded...
	
	BoxB(int l,int h,int b){
		this.breadth = b;
		this.height = h;
		this.length = l;
		boxCount++;
	}
	
	static {
		System.out.println("from static block");
		boxCount = 0;
	}
	
	    boolean isEqual(BoxB b){ //passing object as a reference & call by reference
		b.length++; //commemt for b1 == b2 true
		if(length == b.length && breadth == b.breadth && height == b.height)
		return true;
		
		return false;
		}

	 	 BoxB doubleBox() {  //returning objects
		 BoxB temp = new BoxB(2*length,2*breadth,2*height);
		 return temp;
}
	
	 	static void displayBoxCount() {
	 		 System.out.println("boxCount is: " + boxCount);
	 	 }
}

public class PassingReference {
	
	static int increment(int a) { //call by value
		return a++;
	}
	
public static void main(String[] args) {
	
	
	    System.out.println("main starts here");
		
//		int a = increment(10);
//		System.out.println(a);
		
		BoxB.displayBoxCount();

		System.out.println("before creating the object");
		
		BoxB b1 = new BoxB(2,2,2); //2,3,4 --> false
		BoxB b2 = new BoxB(2,2,2);
		
		System.out.println("after creating the object");

		
		BoxB b3 = b1.doubleBox();
		System.out.println(b3.length);
		
		System.out.println(b1.isEqual(b2));
		System.out.println(b2.length);

	}

}
