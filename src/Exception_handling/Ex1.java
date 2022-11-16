package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	try {
int no1=sc.nextInt();

int no2=sc.nextInt();
System.out.println("enter the array");
int a[]=new int[5];
try {
	for(int i=0;i<5;i++) {
		a[i]=sc.nextInt();
	}
}
catch(NegativeArraySizeException ne){
	System.out.println("only positive number");
}
	
int result=no1/no2;
System.out.println(result);
	}
catch(ArithmeticException ae)
{
System.out.println("Check the no2 value");	
}
	catch(InputMismatchException ime) {
		System.out.println("enter only number");
	}
	catch(Exception e) {
		System.out.println("unknown exception");
	}
	finally {
		System.out.println("finalyy block is running");
	}
	
	}

}
