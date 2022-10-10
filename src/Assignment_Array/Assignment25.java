package Assignment_Array;

public class Assignment25 {

	public static void main(String[] args) {
		// Removing all the duplicate elements in a given array
		int a[]= {2,3,4,5,4,3,6,8,9,9,6,6,6,0,0,0,0,-1,-1};
		int b[]=new int[a.length];
		int t=1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					t++;
					b[j]=-1;
				}
			}
			if(b[i]!=-1) {
				b[i]=t;
			}t=1;
		}
		for(int i=0;i<a.length;i++) {
			if(b[i]>=1)
			 {
				 
				System.out.println(a[i]);
			}
		}

	}

}
