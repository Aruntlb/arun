package basicwork;

public class Swap_Three_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=3,z=7;
		x=x+y+z;
		z=x-(y+z);
		y=x-(y+z);
		x=x-(y+z);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		

	}

}
