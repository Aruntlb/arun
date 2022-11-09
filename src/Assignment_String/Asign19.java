package Assignment_String;

public class Asign19 {

	public static void main(String[] args) {
		// change upper case to lower case
		String s="ArunIOU";
		char[] ch=s.toCharArray();
		//System.out.print(ch);
		int a;
		for(int i=0;i<s.length();i++) {
			// if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
//				a=ch[i];
//				a=a-32;
//				ch[i]=(char)a;
				//System.out.print(ch);
				 //or
				 ch[i]=Character.toLowerCase(ch[i]);
			//}
		}System.out.print(ch);
		

	}

}
