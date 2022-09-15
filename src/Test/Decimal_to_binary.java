package Test;

public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12,i=0;
		int b[]=new int[10];
		while(n>0)
		{
			b[i]=n%2;
			
			n=n/2;
			i++;//4
			
		}
		for(int j=i-1;j>=0;j--) {
			System.out.println(b[j]);
		}

	}

}
