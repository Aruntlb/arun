package Assignment_Array;

public class Assignment22 {

	public static void main(String[] args) {
		// Copying only the negative numbers in given array - to another array
		int a[]= {5,-5,6,-7,-1,-9,7,2};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				b[i]=a[i];
				System.out.println(b[i]);
			}
		}

	}

}
