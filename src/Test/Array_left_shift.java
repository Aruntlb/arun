package Test;

import java.util.Arrays;

public class Array_left_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,6,2,1,5};
		int b=a[0];
		for(int i=0;i<4;i++) {
			a[i]=a[1+i];
		}
		a[4]=b;
		System.out.println(Arrays.toString(a));

	}

}
