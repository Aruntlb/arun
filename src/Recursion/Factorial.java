package Recursion;

public class Factorial {
             int find_fact(int no) {
            	 if(no==1) {
            		 return no;
            	 }
            	 
            	 return no*find_fact(no-1);
            	 
             }
	public static void main(String[] args) {
		// tower of hanoi
		//8 qween problem
		Factorial o=new Factorial();
		System.out.println(o.find_fact(5));


	}

}
