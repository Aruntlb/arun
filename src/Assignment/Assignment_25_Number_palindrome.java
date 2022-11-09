package Assignment;

public class Assignment_25_Number_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1331,num,rev=0,palin=a;
		while(a>0) {
			num=a%10;
			rev=(rev*10)+num;
			
			
			a=a/10;
		}System.out.println(rev);
		if(palin==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}

	}

}
