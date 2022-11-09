package Loop;

public class SpatternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b,c=1;
		for(int i=1;i<=11;i++) {
			b=(12-i)-a;
			c=a-i;
		if(b>0&&a<=6) {
			System.out.print(" ");
			}
		else if(a>6&&c>0) {
			System.out.print(" ");
		}
	else {
		System.out.print("* ");
	}
			if(i==11) {
				i=0;
				a++;
				System.out.println();
			}
			if(a==12) {
				break;
			}
		}

	}

}
