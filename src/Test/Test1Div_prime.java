package Test;

public class Test1Div_prime {
	void div(int a) {
		
		for(int i=2;i<a;i++) {
		if(a%i==0) {
			prime(i) ;
		}
		
		}
	
	}
	void prime(int a) {
		int b=0;
		for(int i=2;i<a;i++) {
			
			if(a%i==0) {
				b++;
			}
			
		}
		if(b==0) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1Div_prime o=new Test1Div_prime();
		o.div(100);
	}

}
