package Assignment_Array;

public class Assignment19 {

	public static void main(String[] args) {
		//  Copying the given array to another array in reverse order
		
		int a[]= {3,4,5,6,7,8};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			
				b[i]=a[i];
				
					
				}
		for(int i=a.length-1;i>=0;i--) {
			
		System.out.println(b[i]);
			
				
			}


	}

}
