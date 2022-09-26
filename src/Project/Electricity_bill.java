package Project;

public class Electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit=501,c,t,d;
		if(unit<=100)
		{
			System.out.println("Free Electricity");
		}
		else if(unit>=101&&unit<=200)
		{
			 t=unit-100;
			System.out.println(t*1.5);
		}
		else if(unit>=201&&unit<=500)
		{
			c=(unit-200)*3;
			System.out.println(200+c);
		}
		else if(unit>500)
		{
			 d=(unit-500);
			System.out.println(350+1380+(d*6.6));
		}
		

	}

}
