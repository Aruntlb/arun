package Test;

public class Test6pow {
	int a;
	void pow(int a,int b) {
		int sum=1;
		for(int i=1;i<=b;i++) {
			sum=sum*a;
		}
		System.out.println(sum);
		a--;
		b--;
		if(a>0) {
			pow(a,b);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6pow o=new Test6pow();
		o.pow(5, 4);
	}

}
