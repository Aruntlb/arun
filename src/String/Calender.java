package String;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="31/12/1999";
		int a[]=new int[3];
		int b[]=new int[s.length()];
		//System.out.println(a.length);
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='/') {
				if(s.charAt(i)!='-')
				{
					System.out.println("invalid");
					break;
				}
				
			 b[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
			 //System.out.println(i+"  "+b[i]);
			 }
			}
		a[0]=b[0]*10+b[1];
		a[1]=b[3]*10+b[4];
		a[2]=b[6]*10+b[7];
		a[2]=a[2]*10+b[8];
		a[2]=a[2]*10+b[9];
		//System.out.println(a[2]);
		for(int c=0;c<3;c++) {
			
			//System.out.println(a[c]);
			if(a[c]<=31) {
				}
			else {
				System.out.println("invalid");
				break;
			}
			if(a[c]<=12) {
			}
		else {
			System.out.println("invalid");
			break;
		}
			if(a[c]<=3000) {
			}
		else {
			System.out.println("invalid");
			break;
		}
		}
		//a[0]=b[0]*10+b[1];

	}

}
