package Class_and_object_2;
class b{
	static void para(byte ch) {
		System.out.println("byte    "+ch);
	}
	static void para(String ch) {
		System.out.println("String   "+ch);
	}
	static void para(int ch) {
		System.out.println("int   "+ch);
	}
	static void para(double ch) {
		System.out.println("double   "+ch);
	}
	static void para(float ch) {
		System.out.println("Float   "+ch);
	}
	
	static void para(short ch) {
		System.out.println("short   "+ch);
	}
	static void para(long ch) {
		System.out.println("long   "+ch);
	}
	static void para(char ch) {
		System.out.println("char   "+ch);
	}
	static void para(boolean ch) {
		System.out.println("boolean    "+ch);
	}
}

public class Poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte d=1;
		short a=2;
		long s=78;
		b.para(d);
b.para("Arun");
b.para(s);
b.para(2.23);
b.para(6.2f);

b.para(a);
b.para(989898989);
b.para('a');
b.para(6<5);
	}

}
