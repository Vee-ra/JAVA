
public class Literals {

	public static void main(String[] args) {
		// 1le line cmnt
		/*
		 * multiline cmnt
		 */
		/**
		 * multilevel cmnt
		 */

		// all the values entered in the pgm are literals.
		// ex.tp = 300; 300 - integer literals
	
		//variable name creation stds
		int v_N = 23;
		int v$N = 98;
		int v8N =978;
		
		int n = 0b0101001;//giving binary as i/p onwards jdk.7
		System.out.println(n);
		
		//casting
		byte b =5; //1bytes
		int m;//4bytes
		m = b; //Automatic conversion - implicit conversion
        System.out.println(m);
        
        byte c;
        int d =10;
        c = (byte)d; // explicit conversion - not works while giving long nums
		
		long num = 345_789_789;
		System.out.println(num);
		
	    System.out.println("\"hello\n world\""); //escape sequences
	    
	    
	}

}
