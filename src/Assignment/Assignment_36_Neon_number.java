package Assignment;

public class Assignment_36_Neon_number {

	public static void main(String[] args) {
		// 9
		//9*9=81
		//8+1=9
		int a=9,r,s=0;
		int c=a*a;
		while(c>0)
		{
			r=c%10;
			s=s+r;
			c=c/10;
			
		}if(s==a) {
			System.out.println("neon number");
		}
			else {
				System.out.println("not a neon number");
			}
		}

	}


