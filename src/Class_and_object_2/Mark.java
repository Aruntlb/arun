package Class_and_object_2;

public class Mark {
int m1,m2,m3,m4,m5,b;
int display() {
	b=m1+m2+m3+m4+m5;
	return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mark o1=new Mark();
		Mark o2=new Mark();
		o1.m1=50;
		o1.m2=60;
		o1.m3=70;
		o1.m4=80;
		o1.m5=90;
		System.out.println("student 1 "+o1.display());
		o2.m1=80;
		o2.m2=60;
		o2.m3=90;
		o2.m4=80;
		o2.m5=90;
		System.out.println("student 2 "+o2.display());;
		

	}

}
