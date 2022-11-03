package Test;
import java.util.Scanner;
public class Find_the_biggest_pair_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int s=sc.nextInt();
		System.out.println("enter the array element");
		int a[]=new int[s];
		for(int i=0;i<s;i++) {
			 a[i]=sc.nextInt();
		}
		int temp=0;
		int c=0,d=0;

int b[]=new int[a.length];
for(int i=0;i<a.length-1;i++) {
	b[i]=a[i]+a[i+1];
	//System.out.println(b[i]);
	if(b[i]>temp) {
		temp=b[i];
		c=a[i];
		d=a[i+1];
	}
	

	}
System.out.println("largest sum value "+temp);
System.out.println("pairs "+c+" and "+d);
}

	}


