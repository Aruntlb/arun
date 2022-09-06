package sample1;
import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a,f=0;
		System.out.println("Enter the number ");
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				System.out.println("j "+j);
				System.out.println("i "+i);
				
				if(i%j==0) {
				f++;
			}}
			
		if(f==2) {
			System.out.println("prime ;"+ i);
			
		}
		f=0;
	
		}
	
			
		

	}

}
