package Exception_handling;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 o=new Ex2();
		//o.display();
		
		o.cal();
		
		

	}

	private void cal() throws ArithmeticException, NegativeArraySizeException {
		// TODO Auto-generated method stub
		int a=5,b=0;
		System.out.println(a/b);
		
		
	}

	private void display() {
		// TODO Auto-generated method stub
		int a=5,b=0,c=-2;
		try {
		int d[]=new int[c];
		
		System.out.println(a/b);
		}
		catch(ArithmeticException | NegativeArraySizeException e){
			System.out.println(e.getMessage());
			System.out.println("enter correct number");
		}
		 
	}

}
