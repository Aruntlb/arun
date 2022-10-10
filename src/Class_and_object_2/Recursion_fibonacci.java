package Class_and_object_2;

public class Recursion_fibonacci {
	int a=1;
	int b=-1;
	int c=1;
	
	int e;
	void m1() {
		e=a+b;
		System.out.println(e);
		b=a;
		a=e;
		c++;
		if(c<=5) {
			m1();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion_fibonacci o=new Recursion_fibonacci();
		o.m1();
	}

}
