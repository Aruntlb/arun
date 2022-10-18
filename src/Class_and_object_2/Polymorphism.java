package Class_and_object_2;
class greater{
	
	static void great(int a,int b) {
		int d;
		d=a>b?a:b;
		System.out.println(d);
	}
	static void great(int a,int b,int c) {
		int d;
		int e;
		d=a>b?a:b;
		e=d>c?d:c;
		System.out.println(e);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greater.great(5, 6);
		greater.great(5, 6,7);


	}

}
