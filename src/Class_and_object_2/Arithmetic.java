package Class_and_object_2;
class math{
	int a,b;
	void add() {
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
	}
	void mul() {
		System.out.println(a*b);
	}
	void div() {
		System.out.println(a/b);
	}
}

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		math o=new math();
		o.a=10;
		o.b=5;
		o.add();
		o.sub();
		o.mul();
		o.div();

	}

}
