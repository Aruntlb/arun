package Class_and_object_2;

public class Basic {
void count() {
	for(int i=1;i<=5;i++) {
		System.out.println(i);
	}
}
	void pattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic o=new Basic();
		o.count();
		o.pattern();
		Speed o1=new Speed();
		o1.speed();

	}

}
