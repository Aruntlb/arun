package Test;

public class Test4fact {
	void fact(int a) {
		int sum=1;
		for(int i=1;i<=a;i++) {
			sum=sum*i;
		}
		System.out.println(sum);
		a--;
		if(a!=0) {
			fact(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4fact o=new Test4fact();
		o.fact(5);
	}

}
