package Recursion;

public class Test12345 {
	int a=1;
	int b=1;
	void m1() {
		b=1;
		m2();
		System.out.println();
		a++;
		if(a<=5) {
			m1();
		}
	}
	void m2() {
		System.out.print(b);
		b++;
		if(b<=5) {
			m2();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test12345 o=new Test12345();
		o.m1();

	}

}
