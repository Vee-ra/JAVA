import java.util.Scanner;

public class Inputdemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name  = scanner.nextLine();
		System.out.println(name);
		
		System.out.println("enter num");
		int num = scanner.nextInt();
		System.out.println(num);
		scanner.nextLine();
		
		System.out.println("enter mail");
		String mail = scanner.nextLine();
		System.out.println(mail);
		
		System.out.println("enter char");
		char ch = scanner.next().charAt(0);
		System.out.println(ch);
		
		
		

	}

}
