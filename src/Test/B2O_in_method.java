package Test;

public class B2O_in_method {
	void find(int a) {
		
	int rem,store=0,i=1,c=0;
	int b[]=new int[1];
	while(a!=0) {
		rem=a%10;

		store+=rem*i;//1  
		i=i*2;
		if(i==8) {
			b[c]=store;
			
			c++;
			i=1;
			store=0;
		}
		a=a/10;
	}
	for(int o=b.length-1;o>=0;o--) {
		System.out.print("OCTAL NUMBER   "+b[o]);
	}
	}
	

	public static void main(String[] args) {
	
		int a=011011;
		B2O_in_method o=new B2O_in_method();
		o.find(011011);
		
		
		
	}

			}

		
