package Recursion;

public class Pattern1 {
	int a=1;
	int b=1;
      void m1() {
    	  m2();
    	  System.out.println();
    	  b=1;
    	  a++;
    	if(a<=5) {
    		m1();
    	}  
      }
      void m2() {
    	  System.out.print(a);
    	  b++;
    	  if(b<=5) {
    		  m2();
    	  }
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 o=new Pattern1();
		o.m1();

	}

}
