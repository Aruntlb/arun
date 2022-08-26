import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Factorial number : ");
		int fact=in.nextInt();
		int sum=1,i=1;
		while(fact>=i) {
			sum=sum*i;
			i++;
				}
		System.out.println("Factorial value "+sum);
		
		
		// TODO Auto-generated method stub

	}

}
