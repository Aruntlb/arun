package Test;
import java.util.Scanner;

public class B2D_in_method {
	int find(int a) {
		int rem,store=0,i=0;
		while(a!=0) {
			rem=a%10;
			store+=rem*findp(2,i);
			i++;
			a=a/10;
		}
		return store;
	}
 int findp(int x,int y) {
	 int rem=1;
	 for(int i=1;i<=y;i++) {
		 rem=rem*x;
	 }
	 if(y==0) {
		 rem=1; 
	 }
		 
	 return rem;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2D_in_method o=new B2D_in_method();
		
		System.out.println(o.find(1101));
		
	
	
		
	}

}
