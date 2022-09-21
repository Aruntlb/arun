package Test;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d1,d2,d3,s,n=153,r,t=n;
		d1=n%10;
		r=n/10;
		
		d2=r%10;
		r=r/10;
		
		d3=r%10;
		s=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
		if(s==t) {
		System.out.println("Amstrong Number");
		
		}
		
		

	}

}
