package Class_and_object_2;

public class Final_key {
final static int a=5;
int b=a;
void display() 
{
	System.out.println(a);
	System.out.println(b);
	b++;
	}
	public static void main(String[] args) {
		// Final variable cannaot be re asigned
Final_key o=new Final_key();

o.display();
o.display();
	}

}
