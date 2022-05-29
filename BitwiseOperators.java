
public class BitwiseOperators {
	/*
	 * mostly used in end to end encryption
	 * parity checking
	 * 
	 * & | ^ ~
	 * 
	 */

	public static void main(String[] args) {
		
		int a =3,b = 6;
		
		int c = a & b;
		System.out.println(c);
		
		c = a | b;
		System.out.println(c);
		
		c = a ^ b;
		System.out.println(c);
		
	    c = ~a;
		System.out.println(c);
		
		}

}
