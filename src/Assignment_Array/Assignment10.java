package Assignment_Array;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,5,6,9,8,7};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
		}System.out.println(min);

	}

}
