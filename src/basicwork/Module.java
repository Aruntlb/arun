package basicwork;
import java.util.Scanner;
public class Module {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a,b,c;
		Scanner in = new Scanner(System.in);
				a=in.nextInt();
				
		for(num=1;num<=a;num++)
		{
			a=num/100;
		    num=num%100;
			b=num/10;
			c=num%10;
			System.out.println(a);
			}
		


	
	
	
	}

}
