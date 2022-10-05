package Assignment_Array;

public class Assignment20 {

	public static void main(String[] args) {
		//  Addition of two integer arrays
		int a[]= {4,6,7,8,9};
		int b[]= {2,6,5,8,8};
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			
			c[i]=b[i]+a[i];
			System.out.println(c[i]);
			
				
			}
	}

}
