package Test;

public class Test8singleloop {
	void loop(int a) {
		int b=5;
		for(int i=b;i<=a;i+=b) {
			System.out.println(i);
			if(i==a) {
			i=0;
			b--;
            }
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8singleloop o=new Test8singleloop();
		o.loop(25);
	}

}
