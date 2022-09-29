package Class_and_object;
class rec4{
	int len,wid;
	rec4(int x,int y){
		len =x;
		wid=y;
	}
	int area() {
		return len*wid;
	}
}

public class Parameterized_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec4 o= new rec4(2,5);
		System.out.println(o.area());

	}

}
