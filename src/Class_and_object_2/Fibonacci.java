package Class_and_object_2;

public class Fibonacci {
	int a,b=-1,c=1;
	void fib(){
	for(int i=1;i<=8;i++) {
		a=b+c;
		System.out.println(a);
		b=c;
		c=a;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci o=new Fibonacci();
		o.fib();
		

	}

}
