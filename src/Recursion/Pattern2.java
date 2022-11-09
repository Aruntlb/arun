package Recursion;

public class Pattern2 {
	int a=1;
	int b=5;
	int c=5;
	int d=5;
	void m1() {
	    b=c;
		d=5;
		m2();
		m3();
		System.out.println();
		a++;
		c--;
		if(a<=5) {
			m1();
		}
	}
	void m2() {
		System.out.print(" ");
		b--;
		if(b>=1) {
			m2();
		}
	}
	void m3() {
		if(a%2==0) {
		System.out.print("#");
		}
		else {
			System.out.print(a);
		}
		d--;
		if(c<=d) {
			m3();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2 o=new Pattern2();
		o.m1();
	}

}
