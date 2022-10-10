package Class_and_object_2;

public class Nested_method {
	int n=0;
	void m1() {
		System.out.println(n);
		n+=2;
		if(n<=10)
		     m1();
	}
	void m2() {
		System.out.println(n);
		n++;
		m3();
	}
	void m3() {
		System.out.println(n);
		n++;
		m4();
	}
	void m4() {
		System.out.println(n);
		n++;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested_method o=new Nested_method();
         o.m1();
         
	}

}
