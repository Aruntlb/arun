package Assignment_Array;

import java.util.Arrays;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length+1];
for(int i=0;i<a.length;i++) {
	b[i]=a[i];
}
b[a.length]=6;
System.out.println(Arrays.toString(b));

	}

}
