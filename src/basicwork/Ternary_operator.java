package basicwork;

public class Ternary_operator {

	public static void main(String[] args) {
	    int a=10,b=5,c;
		if(a==b)
		{
			System.out.println("equal");
		}
		else {
		c=a>b?a:b;
		System.out.println("largest Number is :"+c);
		}
	}

}
