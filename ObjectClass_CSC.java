package com.OOP;

public class ObjectClass_CSC {

	/*
	 * object class  - cosmic super class
	 * every class in a java internally extends already written Object class in it..
	 * Object object
	 */
	
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println(s1 == s2); // constantly created
		System.out.println(s1 == s4); //created using obj ref
		System.out.println(s2.equals(s4));

		
		//goto refer in detail on Inheritance 
}

}
