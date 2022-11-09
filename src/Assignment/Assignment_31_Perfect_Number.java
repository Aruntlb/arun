package Assignment;

public class Assignment_31_Perfect_Number {

	public static void main(String[] args) {
		// factor of given number 1,2,3,6
		int sum=0,n=6;
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
