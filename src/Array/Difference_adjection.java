package Array;

public class Difference_adjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int  b;
		for(int i=0;i<a.length-1;i++) {
			
			b=a[i+1]-a[i];
			System.out.println(b);
			
		}

	}

}
