package Class_and_object;
class Rec1{
	private int length,width;
	void setlen(int l){
		length=l;
	}
	void setwidth(int w) {
		width=w;
	}
	int getlenth() {
		return length;
	}int getwidth() {
		return width;
	}
	void area() {
		System.out.println(length*width);
	}
}

public class Getter_and_setter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rec1 o=new Rec1();
		o.setwidth(5);
		o.setlen(5);
		o.area();
		

	}

}
