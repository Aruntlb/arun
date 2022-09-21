package Test;

public class Sum_of_digit_single_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345,i=0,d=0,a=0;
		int b[]=new int[10];
		int f[]=new int[10];
		while(n>0)
		{
			b[i]=n%10;
			
			d=d+b[i];
			
			n=n/10;
		
			i++;//4
			
		}
		
		while(d>0)
		{
			f[i]=d%10;
			
			a=a+f[i];
			
			d=d/10;
		
			i++;
			
		}System.out.println(a);
		

	}

}

	
