/*
 * class - group of objects,like template,blueprint
 * objects - instance for class.
 */
class Box{
	int length;
	int breadth;
	int height;
}

public class Class_Objects {

public static void main(String[] args) {
		
		Box blackBox = new Box();
		blackBox.breadth = 12;
		blackBox.height = 12;
		blackBox.length = 12;
		
		Box woodBox = new Box();
		woodBox.height = 14;
		
	System.out.println(blackBox.breadth);
	
	
	System.out.println(woodBox.breadth);
	System.out.println(woodBox.height);

	}

}
