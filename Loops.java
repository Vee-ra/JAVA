
public class Loops {

	public static void main(String[] args) {
		int i;
		for(i = 1; i <=5; i++) {
			System.out.print(i);
		}
		System.out.println("\n");

		int a = 1;
		while(a <= 5) { //entry controlled loop
			System.out.print(a);
			a++;
		}
		System.out.println("\n");
		
		int c = 1;
		do {  //exit controlled loop
			System.out.print(c);
			c++;
		} while(c <=5);
		System.out.println("\n");

		int k =1;
		while(k <= 5) {
			System.out.print("* ");
			k++;
		}

	}

}
