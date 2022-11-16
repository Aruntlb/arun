package Test;

public class Test5Cube {
	void cube(int a){
		for(int i=1;i<=a;i+=2) {
			cubemul(i);
		}
	}
void cubemul(int a) {
	int sum=1;
	for(int i=1;i<=3;i++) {
		sum=sum*a;
	}
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5Cube o=new Test5Cube();
		o.cube(5);
	}

}
