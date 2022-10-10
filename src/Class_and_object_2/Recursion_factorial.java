package Class_and_object_2;

public class Recursion_factorial {
int a=1;
int b=1;
void m1() {
	b=b*a;
	System.out.println(b);
	a++;
	if(a<=5) {
		m1();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion_factorial o=new Recursion_factorial();
		o.m1();
	}

}
