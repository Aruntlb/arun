package Loop;

public class Terrinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=11;i++) {
			for(int j=6;j<=11;j++) {
				
				int s=i<=j?11-i:j;
				if(j<=s)
					System.out.print(" ");
				else
				System.out.print(" *");
				}
			System.out.println("");
			//1<=1    10;1     10      1<=10 i=1 s=10 j differ
			//2<=1    9;1       s=1             i=2  s=9  j differ
			//3<=1    8;1    s=1
			

			//2<=1    9;1   s=1,  1<=1   1
			//2<=2    9;2   s=9    2<=2  2
			//2<=3    9;3   s=9    3<=9  3
			//2<=4    9;4   s=9     4<=9 4
			//2<=5    9;5   s=9     5<=9 5
			//2<=6    9;6   s=9     6<=9 6
			//2<=7    9;7   s=9     7<=9 7
			//2<=8    9;8   s=9     8<=9 8
			//2<=9    9;9   s=9     9<=9 9
			//2<=10   9;10  s=9     10<=9 f
			
			//7<=1    4;1   s=1,  1<=1   1
			//7<=2    4;2   s=2    2<=2  2
			//7<=3    4;3   s=3    3<=3  3
			//7<=4    4;4   s=4     4<=4 4
			//7<=5    4;5   s=5     5<=5 5
			//7<=6    4;6   s=6     6<=6 6
			//7<=7    4;7   s=4     7<=4 f
			//7<=8    4;8   s=4
			//7<=9    4;9   s=4
			//output 
			//8<=1    3;1   s=1,  1<=1   1
			//8<=2    3;2   s=2    2<=2  2
			//8<=3    3;3   s=3    3<=3  3
			//8<=4    3;4   s=4     4<=4 4
			//8<=5    3;5   s=5     5<=5 5
			//8<=6    3;6   s=6     6<=6 6
			//8<=7    3;7   s=7     7<=7 7
			//8<=8    3;8   s=4     8<=3 f
			//8<=9    3;9   s=4
			//output
		}
	

	}

}
