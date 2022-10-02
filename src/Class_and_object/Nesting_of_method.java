package Class_and_object;

class method{
	private int m,n;
	method(int x,int y){
		m=x;
		n=y;
	}
		int largest() {
			if(m>n)
				return m;
			else
				return n;
		}
		void display() {
			int large=largest();
			System.out.println("longest "+large);
		}
	
}


public class Nesting_of_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method o=new method(2,3);
				o.display();

	}

}
