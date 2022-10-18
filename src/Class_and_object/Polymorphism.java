package Class_and_object;
class A{
	 static void mul(int a,int b) {
		System.out.println(a*b); 
	} 
	 static void mul(double c,int d) {
		System.out.println(c*d);
	}
	 static void mul(double e,double f) {
		System.out.println(e*f);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		//one in many forms
		A.mul(2,3);
		A.mul(3,3);
		A.mul(9,3);
 
	}

	

}
