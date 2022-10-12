package Project;

import java.util.Arrays;

public class Count_No_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aabbbcc";
		String b="";
		int c[]=new int[a.length()];
		int t=0;
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j))
					t++;
				System.out.println(t);

			}t=1;
				
			}	
			
				

					
					
				
				
				
	}	
		
		
	}

	