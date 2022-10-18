package Class_and_object_2;
class parent{
	final void display() {
		System.out.println("pararent");
	}
	
}
class child extends parent{
	// final method cannot be overide
//	void display() {
//		System.out.println("child");
	}


public class Final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
child o=new child();
o.display();
	}

}
