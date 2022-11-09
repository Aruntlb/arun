package TwoDimensionalArray;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 123   arr[0][0]=1 arr[0][1]=2 arr[0][2]=3 
		//456    arr[1][0]=4 arr[1][1]=5 arr[1][2]=6 
		//789    arr[2][0]=7 arr[2][1]=8 arr[2][2]=9 
		
int a[][]= {{5,2,3},
		     {4,5,6},
		     {7,8,7},
		     
	};
int t=0;
int row=a.length;
System.out.println(row);
System.out.println(a[0].length);
for(int i=0;i<3;i++) {
	t=0;
	for(int j=0;j<3;j++) {
		System.out.print(a[i][j]+" ");
		
			t=t+a[j][i];
			
		
		//t=t+a[i][j];
		//System.out.print(t);
	}System.out.println(t);
}
//System.out.println("");
	
	}
}


