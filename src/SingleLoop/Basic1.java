package SingleLoop;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
for(int j=1;j<=10;j++) {
	if(i==1||j==1||j==10||i==5||i-j==4)
	{
	System.out.print("*");
	}
	else {
		System.out.print(" ");
	}
	if(j==10) {
		System.out.println();
		j=0;
		i++;
	}
	if(i==11) {
		break;
	}
}
	}

}
