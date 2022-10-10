package Test;
import java.util.Scanner;

public class Company_lift_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int floor;
	int l1=1;
	int l2=2;
	int l3=3;
	int l4=3;
	int l5=9;
	int l6=2;
	char move;
	System.out.println("Move up or down");
	move=s.next().charAt(0);
	if(move=='u'||move=='U') {
		int t1=l1;
		int t2=l2;
		int t3=l3;
		int t4=0;
		int t5=0;
		int t6=0;
		System.out.println("li "+t1);
		System.out.println("li "+t2);
		System.out.println("li "+t3);
			
		
		System.out.println("Enter your floor number");
		floor=s.nextInt();
		if(floor>=t6&&move=='u'&&t6!=0) {
			System.out.println(l6);
		}
		else if(floor>=t5&&t5!=0) {
			System.out.println(l5);
		}
		else if(floor>=t4&&t4!=0) {
			System.out.println(l4);
		}
		
		else if(floor>=t3&&t3!=0) {
			System.out.println(l3);
		}
		else if(floor>=t2&&t2!=0) {
			System.out.println(l2);
		}
		else if(floor>=t1&&t1!=0) {
			System.out.println(l1);
		}
		
	}
	if(move=='d'||move=='D') {
		int t1=0;
		int t2=0;
		int t3=0;
		int t4=0;
		int t5=l5;
		int t6=0;
		
		System.out.println("li "+t4);
		System.out.println("li "+t5);
		System.out.println("li "+t6);
			
		System.out.println("Enter your floor number");
		floor=s.nextInt();
		if(floor<=t1&&t1!=0) {
			System.out.println(t1);
		}
		else if(floor<=t2&&t2!=0) {
			System.out.println(t2);
		}
		else if(floor<=t3&&t3!=0) {
			System.out.println(t3);
		}
		/////////////////////////////
		
		
		else  if(floor<=t6&&t6!=0&&t6<=t4&&t6<=t5) {
			System.out.println(t6);
		}
		else if(floor<=t5&&t5!=0&&t5<=t4) {
			System.out.println(t5);
		}
		else if(floor<=t4) {//////////////////////////////&&t4!=0&&t4<=t5&&t4<=t6
			System.out.println(t4);
			}
		
		/////////////////////////////////////////
		
		else if(floor<=t4&&t4!=0&&t4>=t5&&t4>=t6) {
			System.out.println(t4);
		}
		
		
		else if(floor<=t5&&t5!=0&&t5<=t6) {
			System.out.println(t5);
			}
		else if(floor<=t6&&t6!=0) {
			System.out.println(t6);
		}
		
		
		
		
			///////////////////////////
		
		else if(floor>=t1&&t1!=0) {
			System.out.println(t1);
		}
		else if(floor>=t2&&t2!=0) {
			System.out.println(t2);
		}
		else if(floor>=t3&&t3!=0) {
			System.out.println(t3);
		}
		///////////////////////////////
		
		else if(floor<=t6&&t6>=t4&&t6>=t5) {
			System.out.println(t6);
		}
		else if(floor<=t5&&t5>=t4) {///////////&&t5>=t6
			System.out.println(t5);
		}
		else if(floor<=t4) {///////////////////////////////&&t4>=t6
			System.out.println(t4);
		}
		
		
		
		
		/////////////////////////////////
	
		else if(floor>=t4&&t4!=0&&t4<=t5&&t4<=t6) {
			System.out.println(t4);
		}
		else if(floor>=t5&&t5!=0&&t5<=t6) {
			System.out.println(t5);
		}
		else if(floor>=t6&&t6!=0) {
			System.out.println(t6);
		}
	}
	
	

	
	
	
		
			
		
		
		

	}

}
