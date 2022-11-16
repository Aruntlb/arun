package Recursion;

public class Recuclass {
	void display(int a) {
		System.out.print(1);
		a--;
		if(a>=0) {
			display(a);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recuclass o=new Recuclass();
		o.display(5);
	}

}
