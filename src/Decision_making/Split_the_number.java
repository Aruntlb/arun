package Decision_making;

public class Split_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7589;
		if(num>0) {
		int r=num%10;//Scope of variable
		System.out.print(r);
			num=num/10;}
			
		if(num>0) {
			int r=num%10;//Scope of variable
			System.out.print(r);
			num=num/10;}

			if(num>0) {
				int r=num%10;//Scope of variable
			System.out.print(r);
			num=num/10;}
			
			if(num>0) {
				int r=num%10;//Scope of variable
			System.out.print(r);
			num=num/10;}
	}

}
