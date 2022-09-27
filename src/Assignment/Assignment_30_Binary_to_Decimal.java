package Assignment;

public class Assignment_30_Binary_to_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal=0,power=0,binary=1100,remainder;
		while(binary!=0) {
			remainder=binary%10;
			decimal+=remainder*Math.pow(2, power);
			binary=binary/10;
			power++;
					
		}System.out.println(decimal);

	}

}
