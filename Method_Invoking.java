
class Boxx{
		int length;
		int breadth;
		int height;
		
		int volume() {
			return length*height*breadth;
		}
	}

public class Method_Invoking {
	
public static void main(String[] args) {

		Boxx blackBox = new Boxx();
		blackBox.breadth = 2;
		blackBox.height = 2;
		blackBox.length = 2;
		
		Boxx woodBox = new Boxx();
		woodBox.height = 4;
		woodBox.breadth = 4;
		woodBox.length = 4; //while using objects to invoke methods we must put all the m.defn datas..
		
	System.out.println(blackBox.volume()); //invoke method
	
	System.out.println(woodBox.volume());

	}

}
