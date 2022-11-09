package Assignment;

public class Assignment_23_Printing_the_number_in_reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345,num,rev=0;
		while(a>0) {
			num=a%10;
			System.out.println(num);
			rev=(rev*10)+num;
			
			
			a=a/10;
		}System.out.print(rev);

	}

}
