import java.util.Scanner;

public class Loop_Ctrl_Stmnt {
	/*
	 * jump statements -> break,continue;
	 */

	public static void main(String[] args) {
		
		for(int i = 1;i <= 10; i++) {
			if(i == 7)
				continue;
			System.out.println(i);
		}
		
		int n;
		System.out.println("enter num ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		while(n >= 0) {
			if(n % 10 == 0) {
				System.out.println(n);
				break;
			}
			n--;
		}
		
		//find sum of all given num
		    double m,sum = 0;
		    System.out.println("enter numbers and enter -ve num to stop the loop: \n");
		    Scanner scanner1 = new Scanner(System.in);
		    while(true) {
			m = scanner1.nextDouble();
			if(m < 0.0) {
			break;
			}
			sum += m;
			}
			System.out.println(sum + "\n");
			
			outerLoop: //labels
			for(int i =1; i <=5; i++) {
				innerLoop:
				for(int j =1; j <= 5; j++) {
					if(i ==3 && j ==3)
						break innerLoop; //labelled loop -->alernate for goto in the other languages
					System.out.print(j);
				} 
				System.out.println("\n");
			}


	}

}
