package Loop;

public class Spattern1 {

	public static void main(String[] args) {
		
		int a=1;
		for(int i=1;i<=5;i++) {
			System.out.print(i);
			if(a==i) {
			System.out.println();
				i=0;
			    a++;
				}
		if(a==6) {
			break;
		}
		}
		}
}
