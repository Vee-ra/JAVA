package com.OOP;

public class WrapperCls_A_Boxing {

	public static void main(String[] args) {
		
		int i = 1;
		float f = (float) 9.0; // premitive datatypes
		
		Integer d = Integer.valueOf(3); //Boxing/Wrapping
		int e = d.intValue();//Unboxing
		System.out.println(e);
		
		Integer g = 4; //Integer.valueof(4) - auto boxing
		int h = g; //auto unboxing
		System.out.println(h);
		
		

	}

}
