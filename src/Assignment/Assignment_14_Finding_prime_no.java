package Assignment;

public class Assignment_14_Finding_prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5,f=0;
		for(int i=1;i<=50;i++) {
			if(num%i==0) {
				f++;
			}
		}
		if(f==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime");
		}
			

	}

}
