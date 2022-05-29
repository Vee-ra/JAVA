/*
 * special method
 * constructor name is same as class name
 * only for data initiation 
 * no return type
 * constructor called when object is created for the class
 */
	class BoxA{
		int length;
		int breadth;
		int height;
		
		BoxA(int l,int b,int h){
			this.length = l;
			this.breadth = b;
			this.height = h;
			
		}
		
		int volume() {
			return length*height*breadth;
		}
			
		void setDim(int a,int b,int c) {
				this.length = a;
				this.breadth = b;
				this.height = c;
				}
	}

public class Constructor {

	public static void main(String[] args) {
		
		BoxA blackBox = new BoxA(5,5,5);
		
		blackBox.setDim(2,2,2);  //--> to set new dim to existing dim using void method
		
		System.out.println(blackBox.volume());

		BoxA woodBox = new BoxA(6,6,6);
		
    	woodBox.setDim(7, 7, 7); //this pointer -> to know which class's object is called a same method
		
    	System.out.println(woodBox.volume());
    	
	}

}
