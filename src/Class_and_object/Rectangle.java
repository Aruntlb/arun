package Class_and_object;
class Rec{
	int length,breath;
	void get(int x,int y) {
		length=x;
		breath=y;
		System.out.println(length*breath);
	}
	int area(){
		return length*breath;
	}
}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rec o=new Rec();
		o.length=5;
		o.breath=10;
		System.out.println(o.area());
		
		

	}

}
