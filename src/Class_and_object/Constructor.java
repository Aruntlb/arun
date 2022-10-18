package Class_and_object;
class Rec3{
	int len,wid,l,w;
	
	Rec3(){
		len=3;
		wid=2;
	}
	Rec3(int a,int b){
		l=a;
		w=b;
		System.out.println(l*w);
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
		Rec3 o1=new Rec3(7,7);

	}

}
