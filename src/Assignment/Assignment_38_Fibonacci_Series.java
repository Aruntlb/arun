package Assignment;

public class Assignment_38_Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=-1,s=1,t=0,k=0,n=10;
		for(int i=1;i<=8;i++) {
			t=f+s;
			//System.out.println(t);
			f=s;
			s=t;
		
		for(int j=1;j<=t;j++) {
			if(t%j==0) {
				k++;
			
			}
		}if(k==2) {
			System.out.println(t);
		}k=0;

	}}

}
