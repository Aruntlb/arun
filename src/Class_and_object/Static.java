package Class_and_object;
class math{
	public static void power(int base,int power) {
		int result=1;
		for(int i=1;i<=power;i++) {
			result=result*base;
		}System.out.println(result);
	}
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
math.power(2, 3);

	}

}
