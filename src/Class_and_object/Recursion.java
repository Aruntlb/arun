package Class_and_object;

public class Recursion {
	int fact(int x) {
		if(x==0)
			return 1;
		return x*fact(x-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion o=new Recursion();
		System.out.println(o.fact(5));

	}

}
