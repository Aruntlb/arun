package Assignment;

public class Assignment_33_no_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1000,r,b=0;
		while(a>0)
		{
			r=a%10;
			a=a/10;
			b++;
		}System.out.println(b);

	}

}
