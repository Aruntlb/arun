package Class_and_object_2;
interface family{
	void takecare();
	void attenfunction();
}
interface company{
	void attendence();
	void dresscode();
}
class person implements family,company{

	@Override
	public void attendence() {
		// TODO Auto-generated method stub
		System.out.println("attendence");
		
	}

	@Override
	public void dresscode() {
		System.out.println("dresscode");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takecare() {
		// TODO Auto-generated method stub
		System.out.println("takecare");
	}

	@Override
	public void attenfunction() {
		// TODO Auto-generated method stub
		System.out.println("atten function");
	}
	
}

public class Interface_Static_Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person raj=new person();
		raj.attendence();
		raj.dresscode();

		raj.takecare();
		raj.attenfunction();
		//dynamic function
		System.out.println("------------");
		System.out.println("dynamic function family");
		System.out.println("----------------");
		family son=new person();
		son.takecare();
		son.attenfunction();
		System.out.println("------------");
		System.out.println("dynamic function company");
		System.out.println("----------------");
		company emp=new person();
		emp.attendence();
		emp.dresscode();
	


	}

}
