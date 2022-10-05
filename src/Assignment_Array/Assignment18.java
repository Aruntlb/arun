package Assignment_Array;

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,5,6,7,8};
		int b=a[a.length-1];
		int c=a[a.length-2];
	for(int i=a.length-3;i>=0;i--) {
		a[i+2]=a[i];
			
			
				
			}
	a[0]=b;
	a[1]=c;
	
	for(int i=0;i<a.length;i++) {
	
		System.out.println(a[i]);
			
				
			}

	}

}
