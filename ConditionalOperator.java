
public class ConditionalOperator {
	
	static boolean reachNext(int experience,int threshold,int reward) {
		return(experience+reward>= threshold);
		}
	
	static int extraNum(int a,int b,int c) {
		return (a == b)? c :(a == c)? b : a;
		
	}

	public static void main(String[] args) {
		reachNext(25,35,65);
		extraNum(5, 5, 10);
        
		int a = 15,b = 10,max;
//		if(a > b) {
//			max = a;
//		System.out.println(max); 
//		}
//		else {
//		max = b;
//		System.out.println(max);
//		}
		
		max = (a>b)?a:b;
		System.out.println(max);
		
		int num = 11;
		String str;
		str = (num % 2 == 0)? "even":"odd";
		System.out.println(str);
	

}

}
