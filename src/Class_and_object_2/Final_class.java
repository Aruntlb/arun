package Class_and_object_2;
final class ab{
	void display() {
		System.out.println("ab");
		
	}
}
class bc extends ab{
	void display() {
		System.out.println("ab");
		
	}
}

public class Final_class {

	public static void main(String[] args) {
		// if you put final key in class.it cannot be extends
		bc o=new bc();
		o.display();

	}

}
