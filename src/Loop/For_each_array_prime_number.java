package Loop;

public class For_each_array_prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6};
		int f=0;
		
		for(int k:a) {
			for(int i=1;i<=k;i++) {
			if(k%i==0) {
				f++;
				
			}
			
			
		}
			if(f==2) {
				System.out.println("Prime number"+k);
			}
			f=0;
		
		
		}
		
			
		}

	}


