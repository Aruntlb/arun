package Class_and_object_2;
//class c{
//	void display() {
//		System.out.println("hello universe");
//	}
//}
//class d extends c{
//	void display() {
//		System.out.println("hello world");
//	}
//}

public class Method_override {
	public String toString() {
	return "java";
	}
	public int hashCode() {
		return 123;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//d o=new d();
		//o.display();
		Method_override d=new Method_override();
		
System.out.println(d);
System.out.println(d.hashCode());


	}

}
