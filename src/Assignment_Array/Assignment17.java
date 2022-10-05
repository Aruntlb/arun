package Assignment_Array;

public class Assignment17 {

	public static void main(String[] args) {
		//Moving all elements towards right in a given array
		int a[]= {3,4,5,6,7,8};
		int b=a[a.length-1];
	for(int i=a.length-2;i>=0;i--) {
		a[i+1]=a[i];
			
			
				
			}
	a[0]=b;
	for(int i=0;i<a.length;i++) {
	
		System.out.println(a[i]);
			
				
			}

	}

}
