package Project;
import java.util.Scanner;
class Electronic{
	
	
	void display(int x) {
		Scanner s=new Scanner(System.in);
		 int b[]=new int[x];
		 double c;
		 int d=1;
		 String na,sh;
		 int ph;
			double e[]=new double[x];
			
			
			for(int i=0;i<b.length;i++) {
				 System.out.println("laptop no "+d);
				b[i]=s.nextInt();
				d++;
			}
			 for(int i=0;i<b.length;i++) {
		    	  if(b[i]<=25000) {
		    		  System.out.println("MRP              :  "+b[i]);
		    		  c=(5.0/100.0)*b[i];
		    		  System.out.println("Discount         :    5%");
		    		  System.out.println("Discount Amount  :  "+c);
		    		  e[i]=b[i]-c;
		    		  System.out.println("Discount Price   :  "+e[i]);
		    		  System.out.println("----------------------------------------");
		    	  }
		    	  else if(b[i]>=25001&&b[i]<=50000) {
		    		  System.out.println("MRP              :  "+b[i]);
		    		  c=(7.50/100.0)*b[i];
		    		  System.out.println("Discount         :    7.5%");
		    		  System.out.println("Discount Amount  :  "+c);
		    		  e[i]=b[i]-c;
		    		  System.out.println("Discount Price   :  "+e[i]);
		    		  System.out.println("----------------------------------------");
		    	  }
		    	  else if(b[i]>=50001&&b[i]<=100000) {
		    		  System.out.println("MRP              :  "+b[i]);
		    		  c=(10.0/100.0)*b[i];
		    		  System.out.println("Discount         :    10%");
		    		  System.out.println("Discount Amount  :  "+c);
		    		  e[i]=b[i]-c;
		    		  System.out.println("Discount Price   :  "+e[i]);
		    		  System.out.println("----------------------------------------");
		    	  }
		    	  else if(b[i]>=100000) {
		    		  System.out.println("MRP              :  "+b[i]);
		    		  c=(15.0/100.0)*b[i];
		    		  System.out.println("Discount         :    15%");
		    		  System.out.println("Discount Amount  :  "+c);
		    		  e[i]=b[i]-c;
		    		  System.out.println("Discount Price   :  "+e[i]);
		    		  System.out.println("----------------------------------------");
		    	  }
		      }
		
		
		
	}
}

public class Oops_Electronic_shop {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String na,sh;
		 int ph;
		System.out.println("Enter your name");
		na=s.nextLine();
		System.out.println("Enter your Phone number");
		ph=s.nextInt();
		
		 System.out.println("Enter how many laptop do you want");
		 Electronic o=new  Electronic();
		 int a=s.nextInt();
		
		 //double c[]=new double[a];
		 
		 o.display(a);
		 System.out.println("CUSTOMER BIO");
		 System.out.println("NAME             :   "+na);
		 System.out.println("PHONE NUMBER     :   "+ph);
		 System.out.println("Shop name        :    CHENNAI EXPRESS");
		 System.out.println("Thank you"); 
		
		  System.out.println("----------------------------------------");
		

	}

}
