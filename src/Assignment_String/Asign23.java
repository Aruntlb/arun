package Assignment_String;

public class Asign23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="lexicographical";
		String b="";
		char ch='a';
		for(int i=0;i<26;i++)
		{
			
			for(int j=0;j<s.length();j++) {
				
				
				if(s.charAt(j)==ch) {
				b=b+s.charAt(j);
				
				
			}
			}
ch++;

		}System.out.println(b);

	}

}
