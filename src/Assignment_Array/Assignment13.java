package Assignment_Array;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,6,6,5,4,3,2,6};
		int b[]=new int[a.length];
		int t=1;
		for(int i=0;i<a.length;i++) {
		
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) 
				{
					t++;
				b[j]=-1;
				}
			}
			if(b[i]!=-1) {
				b[i]=t;
			}t=1;
			
		}for(int i=0;i<a.length;i++) {
			if(b[i]>1) {
			System.out.println(a[i]+"="+b[i]);
			
			}
		}

	}

}
