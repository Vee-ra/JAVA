import java.util.Scanner;

public class Arrays {
	/*
	 * used to store group of similar data types.
	 */

	public static void main(String[] args) {
		
		int a[] =new int[2];
		a[0] = 1;
		a[1] = 2;
		System.out.println(a[1]);
		int b[] = {1,2,3,4};
		System.out.println(b[2]);
		
		int twoD[][] = new int[3][4]; //2d - array of Arrays
		twoD[0][1] = 3;
		twoD[1][2] = 4; 
		twoD[2][3] = 6; 
		System.out.println(twoD[1][2]);
		System.out.println(twoD[2][3]);
		System.out.println(twoD[1][0]);
		
		int twoDD[][] = {{1,2,3,4},{5,6,7,8,9,0}};
		System.out.println(twoDD[1][3]);
		
		// using scanner to get array input values
		
		int k[] = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 6 elements of array");
		
		for(int i = 0; i < k.length; i++)
			k[i] = scanner.nextInt();
		
		for(int i = 0; i < k.length; i++)
			System.out.println(k[i]);

		}

}
