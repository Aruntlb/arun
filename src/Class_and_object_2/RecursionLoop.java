package Class_and_object_2;

public class RecursionLoop {
	
	void m1(int y) {
		System.out.println(y);
		y++;
		//b=b*n;
		//System.out.println(b);
		if(y<=5) 
			
			
		m1(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionLoop o=new RecursionLoop();
		o.m1(1);
	}

}
