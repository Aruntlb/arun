package Assignment;

public class Assignment_37_spy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123,r,m=1,add=0;
		while(a>0) {
		r=a%10;
		m=m*r;
		add=add+r;
		a=a/10;
		}System.out.println(m);
		System.out.println(add);
		if(m==add) {
			System.out.println("Spy number");
		}else {
			System.out.println("Not a Spy number");
		}
		

	}

}
