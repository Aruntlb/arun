package Loop;

public class Spattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=5;i>=0;i--) {
			System.out.print(a);
			if(i==1) {
				i=a;
				a--;
				System.out.println();
			}
			
			if(a==0) {
				break;
			}
		}
     }
}
