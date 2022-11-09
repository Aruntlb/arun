package Test;

public class SingleiterationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="polymorphism";
		int a=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(a)==s.charAt(i+1)) {
				System.out.println(s.charAt(a));
				break;
			}
			if(i==s.length()-2) {
				i=a;
				a++;
			}
		}

	}

}
