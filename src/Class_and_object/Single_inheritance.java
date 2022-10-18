package Class_and_object;
class father{
	void house() {
	System.out.println("I had a house");
	}
}
class son extends father{
	void car() {
		System.out.println("I had a car");
	}
	
}


public class Single_inheritance {

	public static void main(String[] args) {
		// Static key word can not be used in inheritance
		//son o =new son();
		son o=new son();
		o.house();
		o.car();
		
	}

}
