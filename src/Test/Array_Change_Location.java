package Test;

import java.util.Arrays;

public class Array_Change_Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,7,6};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				//if(a[i]>a[j])
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}System.out.println(Arrays.toString(a));
		for(int i=1;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}System.out.println(Arrays.toString(a));
	
	}

}
