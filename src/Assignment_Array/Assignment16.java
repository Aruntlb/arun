package Assignment_Array;

public class Assignment16 {

	public static void main(String[] args) {
		//Moving all elements towards left twice in a given array
		int a[]= {3,4,5,6,7,8};
		int b=a[0];
		int c=a[1];
	for(int i=0;i<a.length-2;i++) {
		a[i]=a[i+2];
			//System.out.println(a[i]);
			
				
			}
	a[a.length-1]=b;
	a[a.length-2]=c;
	for(int i=0;i<a.length;i++) {
	
		System.out.println(a[i]);
			
				
			}

	}

	
}
