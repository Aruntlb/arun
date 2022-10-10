package Array;

import java.util.Arrays;

public class Arrayaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[10];
int b[]= {5,6,4,1,3,10};
int temp;

for(int i=0;i<b.length;i++) {
	for(int j=i+1;j<b.length;j++) {
		if(b[i]<b[j])
		{
			temp=b[i];
					b[i]=b[j];
					b[j]=temp;
		}
	}
}System.out.println(Arrays.toString(b));
//System.out.println(Arrays.toString(a))



	}

}
