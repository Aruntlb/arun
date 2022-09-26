package Loop;

public class Pattern12344321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,b=4;
		for(int i=1;i<=4;i++) {
			for(int j=i;j<4;j++) {
				System.out.print(j);
			}for(int j=4;j>b-i;j--) {
				
				System.out.print(j);
			
			}
			System.out.println("");
		}
	}

}
