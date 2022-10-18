package Class_and_object;
abstract class sh{
	abstract void draw();
	void message() {
		System.out.println("Arun");
	}
}
	class rect extends sh{

		@Override
		void draw() {
			// TODO Auto-generated method stub
			System.out.println("message from override");
		}
		
	}

public class Abtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
rect o=new rect();
o.draw();
o.message();
	}

}
