package Assignment;

public class Assignment_21_Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-1,b=1,c;
		for(int i=0;i<=5;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}

	}

}
