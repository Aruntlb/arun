package Class_and_object;
class shape{
	int len,wid,rad;
}
class rec extends shape{
	rec(int x,int y){
		len=x;
		wid=y;
		
	}
	int area() {
		return len*wid;
	}
}
class circle extends shape{
	circle(int r){
		rad=r;
	}
	double area() {
		return 3.14*rad*rad;
	}
}
class square extends shape{
	square(int a){
		len=a;
	}
	int area() {
		return len*len;
	}
	
}

public class Hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec o1=new rec(5,6);
		System.out.println("Rectangle "+o1.area());
		circle o2=new circle(5);
		System.out.println("circle "+o2.area());
		square o3=new square(6);
		System.out.println("square "+o3.area());

	}

}
