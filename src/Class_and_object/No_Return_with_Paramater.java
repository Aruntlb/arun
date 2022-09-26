package Class_and_object;
class Method1{
	public void sub(int x,int y) {
		System.out.println("sub "+(x-y));
	}
}

public class No_Return_with_Paramater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1 o=new Method1();
		o.sub(123, 10);

	}

}
