package Assignment;

public class Assignment_20_Square_root_of_a_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=25,sum;
		for(int i=1;i<=num/2;i++) {
			sum=i*i;
			if(sum==num) {
				System.out.println(i);
			}
		}

	}

}
