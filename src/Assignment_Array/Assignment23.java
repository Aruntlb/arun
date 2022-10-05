package Assignment_Array;

public class Assignment23 {

	public static void main(String[] args) {
		// Copying only the odd indexed numbers in given array - to another array
		int a[]= {5,9,6,4,1,7,2};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				b[i]=a[i];
				System.out.println(b[i]);
			}
		}

	}

}
