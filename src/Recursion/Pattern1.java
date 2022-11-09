package Recursion;

public class Pattern1 {
	int a=1;
	int b=5;
	int c=1;
      void m1() {
    	  m2();
    	  System.out.println();
    	  b=5;
    	  a++;
    	if(a<=5) {
    		m1();
    	}  
      }
      void m2() {
    	  System.out.print(" ");
    	  
    	  b--;
    	  if(a<=b) {
    		  m2();
    	  }
    	  else {
    		  System.out.print(" ");
    	  }m3();
      }
      void m3() {
    	  System.out.print(b);
    	  c++;
    	  
    	  if(c<=b) {
    		  m3();
    	  }
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 o=new Pattern1();
		o.m1();
		

	}

}
