package Class_and_object_2;

public class Re_Fact_Loc {
	
		int fact(int x) {
			if(x==0)
				return 1;
			else
				return x*fact(x-1);
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Re_Fact_Loc o=new Re_Fact_Loc();
		System.out.println(o.fact(5));
	}

}
