package Class_and_object_2;

public class Static1 {
	//static String ch ="Payilagam";
	  int a=5;
	 void display() {
		
		int b=5;
		a++;
		b++;
		
//		System.out.println(ch);
//		System.out.println(na);
//		System.out.println(age);
		System.out.println("static variable   "+a);
		System.out.println("local variable    "+b);
		
		
		
	}
	static {
		//System.out.println("hello im Static");
	}
	Static1(){
		
		//System.out.println("hello im from con");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("main");
		//Static1 o=new Static1();
		//b o1=new b();
		Static1 o1=new Static1();
		o1.display();
		o1.display();
//		o.display("Arun",23);
//		o1.display("paul",23);
		//System.out.println("last main");
	}

}
