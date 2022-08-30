import java.util.Scanner;
public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,o=0,e=0;
		System.out.println("Enter the limit");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number a["+i+"]");
			a[i]=in.nextInt();
			
		}
		for(int element:a) {
			System.out.println(element);
			if(element%2==0) {
				o++;
				
				
			}
			else {
				e++;
				
				
			}
		}
		
		System.out.println("even number "+o);
		System.out.println("odd number"+e);
	}

}
