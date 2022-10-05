package Class_and_object_2;
class Student{
	int rollnum,mark;
	String name;
	char grade;
	void setgrade() {
		if(mark>=91&&mark<=100) {
			grade='A';
			
		}
		if(mark>=81&&mark<=90) {
			grade='B';
			
		}
		if(mark>=71&&mark<=80) {
			grade='C';
			
		}
		if(mark>=61&&mark<=70) {
			grade='D';
			
		}
		if(mark>=51&&mark<=60) {
			grade='E';
			
		}
	}
}

public class Class_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student o=new Student();
o.rollnum=100;
o.name="raja";
o.mark=99;
o.setgrade();
System.out.println(o.grade);
Student o2=new Student();
o2.rollnum=200;
o2.name="rani";
o2.mark=80;
o2.setgrade();
System.out.println(o2.grade);

	}

}
