package Assignment_String;

public class Asign10 {

	public static void main(String[] args) {
		// Reverse the String
		String a="Arun";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
			System.out.println(b);
		}System.out.println(b);

	}

}
