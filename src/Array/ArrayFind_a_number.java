package Array;

public class ArrayFind_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,2,7,6,2};
		int n=2,f=0;
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]==2) {
				f++;
			}
		}System.out.println(f);

	}

}
