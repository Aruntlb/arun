package Assignment_Array;

import java.util.Arrays;

public class Assignment15 {

	public static void main(String[] args) {
		//  Moving all elements towards left in a given array
		int a[]= {3,4,5,6,7,8};
		int b=a[0];
	for(int i=0;i<a.length-1;i++) {
		a[i]=a[i+1];
			//System.out.println(a[i]);
			
				
			}
	a[a.length-1]=b;
	for(int i=0;i<a.length;i++) {
	
		System.out.println(a[i]);
			
				
			}
	
		

	}

}
