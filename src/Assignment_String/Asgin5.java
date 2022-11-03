package Assignment_String;

public class Asgin5 {

	public static void main(String[] args) {
		// find duplicate String
		String a="aaabbbccd";
		int b[]=new int[a.length()];
		for(int i=0;i<a.length();i++) {
			int t=1;
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
			//System.out.println(b[i]);
			if(b[i]>1) {
				System.out.println(a.charAt(i));
			}
		}

	}

}
