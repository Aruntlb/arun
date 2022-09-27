package Class_and_object_2;
class square{
	int a;
	int area(int x) {
		a=x;
		return a*a;
	}
}

public class Square_area {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square o=new square();
		square o1=new square();
		
		System.out.println(o.area(5));
		//System.out.println(o1.area());
		

	}

}
