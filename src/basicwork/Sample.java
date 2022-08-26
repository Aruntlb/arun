package basicwork;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String email="aruntlb12@gamil.com";
String password="arun";
Scanner o1 = new Scanner(System.in);
System.out.println("Enter your email id");
String id=o1.nextLine();
if(email.equals(id))
{
	System.out.println("Enter your password");
	String pa=o1.nextLine();
	if(password.equals(pa))
	{
		System.out.println("welcome to email id");
	}
	else {
		System.out.println("password is incorrect");
	}
	}
else {
	System.out.println("Enter your correct email id");
}
}
}
