package Test;

public class Test2Rev {
	

	int rev(int a) {
		int rem;
		int store=0;
		while(a!=0) {
			rem=a%100;
			store=store*100+rem;
			a=a/100;
		}
		return store; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2Rev o=new Test2Rev();
		System.out.println(o.rev(123456));
	}

}
