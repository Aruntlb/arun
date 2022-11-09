package Loop;

public class Spattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		for(int i=1;i<=5;i++) {
			//System.out.print(i);
			if(a==i) {
			System.out.println();
			a++;
			i=1;
			}
			if(a==6) {
				break;
			}
			else if(a<=6) {
				System.out.print(i);
			}
		}

	}

}
