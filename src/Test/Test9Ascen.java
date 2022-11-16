package Test;

public class Test9Ascen {
	void split(int a) {
		int b=a;
		int v=0;
		 int d[]=new int[5];
		while(a!=0) {
			int rem=a%10;
			d[v]=rem;
			v++;
			a=a/10;
		}
		//System.out.println(d[0]);
		test(b,v,d[0]);
	}
	void test(int a,int c,int r) {
		
		int v=4;
		int b=v+1;
		while(a!=0) {
			int rem=a%10;
			b--;
			if(rem<=r) {
				v=rem;
			}
			else if(rem>r) {
				System.out.println("false");
				break;
			}
			 if(b==1) {
				System.out.println("true");
			}
			a=a/10;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9Ascen o=new Test9Ascen();
		o.split(1234);
	}

}
