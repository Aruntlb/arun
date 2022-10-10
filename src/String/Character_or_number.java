package String;

public class Character_or_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abABcd 20002";
		int t=0;
		for(int i=0;i<a.length();i++) {
//			if(a.charAt(i)>='0')
//				if(a.charAt(i)<='9')
//					System.out.println(a.charAt(i));
//			if(a.charAt(i)>='a') {
//				if(a.charAt(i)<='z') {
//					System.out.println(a.charAt(i));
//				}
//			}
//			if(a.charAt(i)>='A') {
//				if(a.charAt(i)<='Z') {
//					System.out.println(a.charAt(i));
//				}
//			}
			//only number
			if(a.charAt(i)>='0')
				if(a.charAt(i)<='9')
				t++;
		}
System.out.println(t);
if(t==a.length()) {
	System.out.println("all are number");
}
else {
	System.out.println("All are not a number");
}
	}

}
