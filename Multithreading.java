package com.OOP;

abstract class Book implements Runnable{ //Runnable - inbuild class for thread
	
//	public void run() { //run - to start thread change method name to "run" default
//		for(int i =1;i <= 5;i++) {
//			System.out.println("updating db");
//			try { Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
//	}
//	}
}
class Num extends Thread{
	public void run() {
		for(int i =1;i <= 5;i++) {
			System.out.println("Number");
			try { Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}


public class Multithreading {

	public static void main(String[] args) throws InterruptedException { //Thread
		//Book book = new Book(); //book - Thread
		
		Runnable book = ()-> {
			for(int i =1;i <= 5;i++) {
				System.out.println("updating db");
				try { Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
		}; //book - Thread

		
		Num num = new Num();
		
		Thread t1 = new Thread(book); 
		
//		book.updateDB(); //run
//		num.print();
		
		t1.start();
		num.start();
		
//		if(book.isAlive())
//			System.out.println("still executing");
		
		t1.join();
		num.join();
		
//		if(book.isAlive())
//			System.out.println("continues executing"); // no o/p bcoz thread completed
		
		System.out.println("main thread checking join class");
		
		

	}

}
