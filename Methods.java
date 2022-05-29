
/*
 * methods - carries a specific task
 * method i/p - parameters/args
 */

public class Methods {
	
	 static void printLine(){ 
	 System.out.println("--------------");
	 }
	 
	     static int volume(int l,int b,int h){ ////method definition
		 int vol;
		 vol = l*h*b;
		 return vol;		 
	 }

	public static void main(String[] args) {
		
		printLine(); //method call
		
		int result = volume(2,2,2);
		System.out.println(result);
		
		System.out.println(volume(3,3,3));

}

}
