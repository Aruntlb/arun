package Assignment;

public class Assignment_15_Finding_first_20_prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5,f=0;
		for(int i=1;i<=20;i++) 
		{
			for(int j=1;j<=20;j++) {
			if(i%j==0) {
				f++;
			}
			
			}if(f==2) {
				System.out.print("Prime Number"+i);
			}System.out.println(" ");
			f=0;
		}
		
		}

	}


