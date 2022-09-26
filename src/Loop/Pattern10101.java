package Loop;

public class Pattern10101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			int num=i%2==0?0:1;
			System.out.print(num);
			
			for(int j=1;j<=i;j++) {
				num=num==1?0:1;
				System.out.print(num);
			}System.out.println("");
		}

	}

}
