package Assignment;

public class Assignment_31_Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,n=5;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}if(sum==n) {
			System.out.println("Perfect number");
			
		}else {
			System.out.println("Not a perfect number");
		}

	}

}
