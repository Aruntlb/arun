package Loop;

public class Bing_bang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			if(i%3==0&&i%5==0)
			{
				System.out.println("Bing Bang"+i);
			}
			else if(i%3==0)
			{
				System.out.println("Bing "+i);
			}
			else if(i%5==0)
			{
				System.out.println("Bang"+i);
			}
			else
			{
				System.out.println(i);
			}
		}
		}

	}


