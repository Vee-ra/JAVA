package com.OOP;

/*
 * variable length arguments - used in web applications
 * gets value using only for each loop
 * can use int,char,string in varargs
 */
public class VarArgs {
	
	static int minValue(int... vals) { //SE 5.0 onwards varargs
		
		int min = Integer.MAX_VALUE;//vals[0] is ok to check array but its not good;
		for (int k : vals) {
			if(k < min)
				min = k;
		}
		return min;
		}
	
    static double minValue(double... valss) {
		
		double min = Integer.MAX_VALUE;//vals[0];
		for (double k : valss) {
			if(k < min)
				min = k;
		}
		return min;
		}

	public static void main(String[] args) {
		
		int a = minValue();
		
		int n = minValue(3,3,4,5);
		System.out.println(n);
		
		int m = minValue(3,3,4,5,-4,-2,1);
		System.out.println(m);
		
		
        double i = minValue();
		System.out.println(i); // to know it using google

		double j = minValue(3.0,2.3,4,5);
		System.out.println(j);
		
		double l = minValue(3.2,4,0.5,-4,-2,1);
		System.out.println(l);

	}

}
