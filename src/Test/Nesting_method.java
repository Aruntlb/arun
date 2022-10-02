package Test;
class add{
	int m,n;
	add(int x,int y){
		m=x;
		n=y;
		
	}
	int fun(){
		return m+n;
	}
	void display() {
		int a=fun();
		System.out.println(a);
	}
}

public class Nesting_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add o=new add(5,6);
		o.display();

	}

}
