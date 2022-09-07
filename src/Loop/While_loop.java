package Loop;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1331,r=0,t,reverse=0,check;
		check=num;
		while(num>0) {
			t=num%10;
			reverse=(reverse*10)+t;
			
			r=r+t;
		
			num=num/10;
		
			}
	
		System.out.println(r);
		System.out.println(reverse);
	
if(check==reverse)
	System.out.println("palandrome");
else
	System.out.println("not a palindrome");
	}

}
