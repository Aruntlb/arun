package Assignment_Array;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,2,3,4,5,6,2,7,8,9};
		int c=2;
		int b=0;
		for(int i=0;i<a.length;i++) {
			
			if(c==a[i]) {
				b++;
				
			}
			
		}System.out.println(b);

	}

}
