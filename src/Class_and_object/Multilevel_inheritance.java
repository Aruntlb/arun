package Class_and_object;

class fahter {
	void house() {
		System.out.println("I had a house");
	}
}
class son1 extends father{
	void car() {
		System.out.println("I had a audi car");
	}

}
class grandson extends son1{
	void ec() {
		System.out.println("I had a electric car");
	}
	
}

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		grandson o1=new grandson();
		o1.car();
		o1.house();
		o1.ec();
		
		

	}

}
