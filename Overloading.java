package com.OOP;

/*
 * we can also overloading constructor too..
 */

public class Overloading {
	
	static int max(int a,int b) {
		return(a > b)? a :b;
	}
	
	static double max(double a,double b) {
		return(a > b)? a :b;
	}
	
	static int test(int a) {
		System.out.println("test frm 1st argument");
		return a;
		}
	static int test(int a,int b) {
		System.out.println("test frm 2nd argument");
		return a+b;
		}
	static int test(int a,int b,int c) {
		System.out.println("test frm 3rd argument");
		return a+b+c;
		}

	public static void main(String[] args) {
		
		System.out.println(max(2,5));
		System.out.println(max(2.5,0.5));

		System.out.println(test(3));
		System.out.println(test(3,2,6));
		System.out.println(test(3,2));

		
		

	}

}
