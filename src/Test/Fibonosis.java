package Test;

public class Fibonosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=-1,c=1,d=0,e=0;
		for(int i=0;i<5;i++)
		{
			a=b+c;
			System.out.println(a);
			b=c;
			c=a;
			e=a+e;
		
}
		
	System.out.println(e);
	}}
