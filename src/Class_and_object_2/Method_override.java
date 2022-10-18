package Class_and_object_2;
class c{
	void display() {
		System.out.println("hello universe");
	}
}
class d extends c{
	void display() {
		System.out.println("hello world");
	}
}

public class Method_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d o=new d();
		o.display();

	}

}
