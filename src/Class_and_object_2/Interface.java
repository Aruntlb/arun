package Class_and_object_2;
interface a{
	void display();
	void dis();
//	void data() {
//		
//	}
}
class bd implements a{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
		
	}

	@Override
	public void dis() {
	System.out.println("dis");
		
	}
	void d() {
		System.out.println("d");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// interface 100% abstract
		//key words implements

		bd o=new bd();
		
		o.d();
	
	}

}
