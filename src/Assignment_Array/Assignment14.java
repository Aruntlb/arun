package Assignment_Array;

public class Assignment14 {

	public static void main(String[] args) {
		// Finding addition of odd index numbers in a given array
		int a[]= {3,4,5,6,7,8,9};
		int b=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				b=b+a[i];
				System.out.println(a[i]);
			}
		}System.out.println(b);

	}

}
