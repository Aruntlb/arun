package Class_and_object;

public class RBI {
void account() {
	System.out.println("Account created");
	
}
int interest() {
	return 5;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI o=new SBI();
		o.account();
		System.out.println(o.interest());

	}

}
