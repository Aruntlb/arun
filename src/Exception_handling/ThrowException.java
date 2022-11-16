package Exception_handling;
class PasswardException extends Exception{
	void verifyPassord(String pwd) throws PasswardException {
		if(pwd.length()<8) {
			PasswardException pe =new PasswardException();
			throw pe;
		}
		System.out.println("Strong passward");
	}
}

public class ThrowException   {

	public static void main(String[] args) {
		// password exception
		PasswardException pe =new PasswardException();
		try {
			pe.verifyPassord("arun12345");
		} catch (PasswardException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Too short passward");
		}

		
	}

}
