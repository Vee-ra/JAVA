
public class Operators {

	public static void main(String[] args) {
		
//		Arithmetic --> +-*%
//		Compound assignment -> += , -= , *= 
		int a =2,b=3;
		a += a+b;//compound assignment
		System.out.println(a);
	
		//increment decrement opertaors	
		int h =3,j=4,c;
		
		c = h + j + h++ + j++ + ++h + ++j; 
		System.out.println(c);
		
			}

}
