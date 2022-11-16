package Test;

public class Test3Pow {
void pow(int a,int b) {
	int d=b;
	int c=1;
	for(int i=1;i<=b;i++) {
		c=a*c;
	}
	System.out.println(c);
	b--;
	if(b!=0) {
		pow(a,b);
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3Pow o=new Test3Pow();
		o.pow(2,5);
	}

}
