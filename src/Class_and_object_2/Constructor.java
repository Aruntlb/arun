package Class_and_object_2;
class con{
	con(int a,int b){
		System.out.println(a+b);
	}
	con(){
		System.out.println("hello");
	}
	void mul(int x,int y) {
		System.out.println(x*y);
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		con d=new con();
con c=new con(3,4);

	}

}
