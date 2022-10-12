package Project;
import java.util.Arrays;
import java.util.Scanner;

public class Lift_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=  new int[6];;
		int b[]= new int[a.length];
		int c[]=new int[6];
		int e[]= new int[a.length];
		int g[]=new int[a.length];
		int fl;
		Scanner s=new Scanner(System.in);
		char ch,ch1;
		int k=1,t=1,floor,n=1,r=1;
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter your flour and up or down Lift  "+r);
			fl=s.nextInt();
			 ch=s.next().charAt(0);
			
			 a[i]=fl;
			if(ch=='u') {
				b[i]=1;
				}
			else if(ch=='d') {
				b[i]=0;
			}
			r++;
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("enter your floor and up or down");
		floor=s.nextInt();
		if(floor<=10) {
		ch1=s.next().charAt(0);
		if(ch1=='u'||ch1=='U') {
			
		for(int i=0;i<a.length;i++) {
			if(b[i]==1) {
				c[i]=a[i];
				g[i]=k;
				System.out.println(g[i]+" upward ="+a[i]);
			}
			k++;
		}
		int d=3,f=0,max=0,max1=0;
		for(int i=0;i<a.length;i++) {
			if(floor==c[i]&&c[i]!=0) {
				   f=a[i];
				   break;
			        }
			else if(floor>c[i]&&c[i]!=0) {
				if(c[i]>max) {
					max=c[i];
				}
				f=max;
            }
			
			}if(f==0) {
				for(int i=0;i<a.length;i++) {
					if(a[i]>max1) {
						max1=a[i];//c
					}
				}
				f=max1;
				}
		System.out.println("lift : "+f);
		for(int i=0;i<a.length;i++) {
			if(f==c[i]) {
				System.out.println("your lift number : "+g[i]);
			}
			  else if(f==0) {
				  System.out.println("Please wait");
			  }
		}
		
	}
		else if(ch1=='d'||ch1=='D') {
			
			for(int i=0;i<a.length;i++) {
				if(b[i]==0) {
					c[i]=a[i];///
					g[i]=n;
					System.out.println(g[i]+" downwards ="+a[i]);
					}
				n++;
			}
			
			
			int f=9,l=0,min=0,min2=c[0],m=0;
			for(int i=0;i<c.length;i++) {
				 if(floor==c[i]&&c[i]!=0) {
					   l=c[i];
					   break;
			        }
				 else if(floor<c[i]&&c[i]!=0) {
					 e[m]=c[i];
					 min=e[0];
					 if(min>=c[i]) {
						 min=c[i];
					 }
					 l=min;
					 m++;
			}
				 else if(c[i]>0) {
					 min2=c[i];
				 }
			}if(l==0) {
				for(int i=0;i<c.length;i++) {
					if(c[i]<min2&&c[i]!=0) {
						min2=c[i];
					}
				}
				l=min2;
			}
			
			System.out.println("lift "+l);
		
			
			
			for(int i=0;i<a.length;i++) {
				 
				  if(l==c[i]) {
						System.out.println("your lift number  is : "+g[i]);
					}
				
				 }
		}
		}
		else {
			System.out.println("Enter your valid floor number");
		}
		
		}
}


