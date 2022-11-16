package Exception_handling;

public class ThrowsException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ThrowsException o=new ThrowsException();
		o.cal();

	}

	private void cal()throws Exception {
		// TODO Auto-generated method stub
		int a=5,b=0;
		System.out.println(a/b);
		
	}

}
