package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String a="arun";
	System.out.println(a);
	String b="";
	System.out.println(a.length());
	for(int i=a.length()-1;i>=0;i--)
	{
	b=b+a.charAt(i);
	System.out.println(b);
	}
	System.out.println(b);
if(a.equals(b)) {
		System.out.println("palandrome");
		
	}else {
		System.out.println("not a palindrome");
	}

}
}
