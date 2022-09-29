package Class_and_object_2;

public class String_Student {
	int roll;
	String name;
	int mark;
	void display() {
		System.out.println(roll);
		System.out.println(name);
		System.out.println(mark);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Student o1=new String_Student();
		o1.roll=1;
		o1.name="Arun";
		o1.mark=100;
		o1.display();
		System.out.println(o1);

	}

}
