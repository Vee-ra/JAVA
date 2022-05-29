import java.util.Scanner;

public class SwitchStatement {
	
	/*
	 * switch and if else = selection statements
	 */

	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1st num");
		a = scanner.nextInt();
		System.out.println("enter 2nd num");
		b = scanner.nextInt();
		char operator;
		System.out.println("enter char : + , - , * , / , % ");
		operator = scanner.next().charAt(0);
		
		switch(operator) {
		case '+' : {
			System.out.println(a + "+" + b + "=" + (a+b));
			break;
		}
		case '-' : {
			System.out.println(a + "-" + b + "=" + (a-b));
			break;
		}
		case '*' : {
			System.out.println(a + "*" + b + "=" + (a*b));
			break;
		}
		case '/' : {
			System.out.println(a + "/" + b + "=" + (a/b));
			break;
		}
		case '%' : {
			System.out.println(a + "%" + b + "=" + (a%b));
			break;
		}
			default:
				System.out.println("choose valid operator");
		}

	}

}
