package Class_and_object_2;
import java.util.Scanner;
public class Atm {
	int a,b,n,t;
	void money() {
		b=a/500;
		System.out.println("500 = "+b);
		b=a%500;
		n=b/200;
		System.out.println("200 = "+n);
		n=b%200;
		t=n/100;
		System.out.println("100 = "+t);
		}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm o=new Atm();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your amount :");
		o.a=sc.nextInt();
		if(o.a%100==0) {
			o.money();
		}
		else {
			System.out.println("INVALID");
		}
	}

}
