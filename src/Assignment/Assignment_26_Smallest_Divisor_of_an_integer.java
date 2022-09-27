package Assignment;

public class Assignment_26_Smallest_Divisor_of_an_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=10;
		for(int i=2;i<=sum;i++) {
			if(sum%i==0) {
				System.out.println(i);
				break;
			}
			
		}

	}

}
