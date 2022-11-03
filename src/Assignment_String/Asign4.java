package Assignment_String;

public class Asign4 {

	public static void main(String[] args) {
		// count a each character in a string
		
		String a="aaabbbc";
		int b[]=new int[a.length()];
		int t=1;
		for(int i=0;i<a.length();i++ ) {
			t=1;
			for(int j=i+1;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j)) {
					t++;
					b[j]=-1;
				}
				}
			if(b[i]!=-1) {
				b[i]=t;
		}

	}
		for(int i=0;i<a.length();i++) {
			if(b[i]>=1)
			 {
				 
				System.out.println(a.charAt(i)+"="+b[i]);
			}
		}

	}}
