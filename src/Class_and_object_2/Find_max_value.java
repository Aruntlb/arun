package Class_and_object_2;
class max{
	int a,b,c;
	 int great(int x,int y,int z) {
		a=x>y?x:y;
		c=a>z?a:z;
		return c;
	}
}

public class Find_max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
max o=new max();
System.out.println("Maximum value : "+o.great(10, 5, 3));

	}

}
