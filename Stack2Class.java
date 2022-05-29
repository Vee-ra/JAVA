package com.OOP;

public class Stack2Class { //access specifier - methods must be public
	
	private int a[] = new int[10]; //method data must be private
	private int tos;
	
	Stack2Class() {
		tos = -1;
	}
	
	 public void push(int item) {
		if (tos == a.length) // tos == 9;
		{
			System.out.println("Stack full");
		}
		else {
	        a[++tos] = item;
		}
	}
	
	public int pop() {
		if(tos >= 0) {
		return a[tos--];
	}
	else {
		System.out.println("satck is empty");
		return-1;
	}
		
	}

}
