package Assignment_Array;

public class Assignment21 {

	public static void main(String[] args) {
		// Finding only negative numbers in given array
		int a[]= {5,-5,6,-7,-1,-9,7,2};
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.println(a[i]);
			}
		}

	}

}
