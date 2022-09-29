package Class_and_object;
class Rec3{
	int len,wid;
	Rec3(){
		len=3;
		wid=2;
	}
	int area() {
		return len*wid;
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rec3 o=new Rec3();
		System.out.println(o.area());

	}

}
