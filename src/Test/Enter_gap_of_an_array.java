package Test;
import java.util.Scanner;
public class Enter_gap_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an array size");
		int s=sc.nextInt();
		System.out.println("enter the gap");
		int g=sc.nextInt();
		int a[] =new int[s];
		int b=0;
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for (int i=0;i<g;i++) {
			b=a[i];
			for(int j=g+i;j<a.length;j+=g) {
				b=b+a[j];
			}
			System.out.println("out put  "+b);
		}
		}
}
