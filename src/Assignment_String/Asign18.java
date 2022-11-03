package Assignment_String;

public class Asign18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="im a arun o oiu";
		char[] ch=s.toCharArray();
		int t=0,c=0;
		int b[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				t=0;
			b[i]=t;
			}
			else {
				t++;
			b[i]=t;
			}
			//System.out.println(b[i]);
		}
		for(int i=0;i<s.length();i++) {
			if(b[i]==1) {
				c++;
				ch[i]=Character.toUpperCase(ch[i]);
				
			}
			System.out.print(ch[i]);
		}
		//System.out.println("word "+c);

	}

}
