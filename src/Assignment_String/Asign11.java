package Assignment_String;

public class Asign11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="palap";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
			System.out.println(b);
		}System.out.println(b);
		if(a.equals(b)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
