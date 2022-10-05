package Assignment_Array;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,5,2,6,9,8,7};
		int min=a[0];
		int min2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println("First Minimum number :"+min);
		for(int i=0;i<a.length;i++) {
			if(a[i]<min2&&a[i]!=min) {
				min2=a[i];
				
			}
		}System.out.println("Second minimum number :"+min2);
	}

	}


