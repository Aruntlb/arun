package Assignment;

public class Assignment_35_Strong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=145,originalnum=num,fact,rem,i,sum=0;
		while(num>0)
		{
			rem=num%10;
			fact=1;
			for(i=1;i<=rem;i++) {
				fact*=i;
			}
			sum+=fact;
			num=num/10;
		}
		
if(sum==originalnum) {
	System.out.println(originalnum+" is strong number");
}
	else {
		System.out.println(originalnum+"is not a strong number");
	}
}
	}


