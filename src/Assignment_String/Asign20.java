package Assignment_String;

public class Asign20 {

	public static void main(String[] args) {
		// Anagram
		String s="listen";
		String l="sileet";
	    int a[]=new int[s.length()];
		int b[]=new int[s.length()];
		if(s.length()==l.length()) {
		for(int i=0;i<s.length();i++) {
			
			for(int j=0;j<l.length();j++) {
				if(s.charAt(i)==l.charAt(j)) {
					
					a[i]=1;
				}
				if(l.charAt(i)==s.charAt(j)) {
				
					b[i]=1;
				}
				
			}//System.out.println(a[i]+"="+b[i]);
			if(a[i]==0) {
				
				System.out.println("not a anagaram");
				break;
				
			}
			else if(b[i]==0) {
				System.out.println("not a anangram");
				break;
			}
			else if(a[a.length-1]==1) {
				System.out.println("anagaram");
			}
			
		}
		}
		else {
			System.out.println("not a anagaram");
		}
		

	}

}
