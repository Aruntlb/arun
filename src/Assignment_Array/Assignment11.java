package Assignment_Array;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,5,6,9,8,7};
		int max=a[0];
		int max2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		System.out.println("First Maximum number :"+max);
		for(int i=0;i<a.length;i++) {
			if(a[i]>max2&&a[i]!=max) {
				max2=a[i];
				
			}
		}System.out.println("Second Maximum number :"+max2);

	}

}
