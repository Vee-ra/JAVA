
public class ShiftOperators {
	/*
	 * <<
	 * >>
	 * >>> with zero fill
	 */

	public static void main(String[] args) {
		
		byte a = -4;
		System.out.println(a>>1);
		System.out.println(a>>>1);
		System.out.println((byte)(a>>>1));//int to byte typecasting
		System.out.println(a<<1);


	}

}
