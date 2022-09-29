package Class_and_object_2;
class fact{
	int a,f;

void factorial(){
	
	f=1;
		
		
		for(int j=1;j<=a;j++) {
		f=f*j;
	}
		System.out.println(f);
		
		
		
		
}
}

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact o=new fact();
		for(int i=1;i<=5;i++) {
			o.a=i;
		o.factorial();
		}

	}

}
