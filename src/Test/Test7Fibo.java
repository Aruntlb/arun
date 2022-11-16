package Test;

public class Test7Fibo {
	void fib(int a) {
		int b=0,c=1,d;
		for(int i=1;i<=a;i++) {
			d=c+b;
			prime(b);
			b=c;
			c=d;
		}
	}
	void prime(int a) {
		int b=0;
		if(a>1) {
		for(int i=2;i<a;i++) {
			
			if(a%i==0) {
				b++;
			}
			
		}
		if(b==0) {
			System.out.println(a);
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7Fibo o=new Test7Fibo();
		o.fib(15);
	}

}
