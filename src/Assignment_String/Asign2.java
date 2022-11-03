package Assignment_String;

public class Asign2 {

	public static void main(String[] args) {
		// count the vowels
		String a="poaeiouqw";
		int b=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				b++;
			}
			
		}System.out.println(b);

	}

}
