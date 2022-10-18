package Class_and_object_2;
 class employee{
	int empid=100;
	public String name="arun";
	protected String mobile="12345667";
	private String password="123456";
}
class manager extends employee{
	
}
public class Encapsulation {
	public String name="paul";
	String phon="789654";
	private String password="12345";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee o=new employee();
		System.out.println(o.empid);
		System.out.println(o.name);
		System.out.println(o.mobile);
		//System.out.println(o.password);
		Encapsulation o1=new Encapsulation();
		System.out.println(o1.password);
//		manager o2=new manager();           we cant extends the private variable
//		System.out.println(o.password);

	}

}
