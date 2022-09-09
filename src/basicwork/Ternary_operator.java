package basicwork;

public class Ternary_operator {

	public static void main(String[] args) {
	    int a=10,b=5,c,d=20;
		if(d>b&&a<d)
		{
		System.out.println("largest number is d;"+d);
		}
		
		else {
		//c=a>b?a:b;
		System.out.println(a>b?"a is largest":"b is largest");
		}
	}

}
