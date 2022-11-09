package Test;

public class Trinary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=8;
		for(int c=0;c<=i;c++) {
			for(int j=0;j<=8;j++) {
				int b=c>j?9-c:j;
				if(b>j) {
					if(j%2==0) {
						System.out.print(c);	
					}else {
						System.out.print("#");
					}
					
				}
			}System.out.println("");
		}

	}

}
