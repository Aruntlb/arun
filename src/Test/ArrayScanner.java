package Test;
import java.util.Arrays;
import java.util.Scanner;

class arr{
	void display(int b[]) {
		int min=b[0];
		int temp=0,g=0,h=0;
		
		//for(int i=0;i<b.length;i++) {
			//if(b[i]<min)
				//min=b[i];
		//}
		//System.out.println("Minimum Value of an array : "+min);
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]<b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
					g=b[0];
					h=b[1];
							
				}
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println("First Smallest number : "+g);
		System.out.println("Second Smallest number : "+h);
	}
}

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stubc
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter 5 number");
		for(int i=0;i<5;i++) {
			
			 a[i]=s.nextInt();
			
			
			
		}
		arr o=new arr();
		o.display(a);
//System.out.println(Arrays.toString(a));
	}

}
