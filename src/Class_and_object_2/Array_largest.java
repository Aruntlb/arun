package Class_and_object_2;
class array{
	
	int lar(int a[]) {
		int max=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}
				
			}
			return max;
		}
			
		
	}


public class Array_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          array a=new array();
          int k[]= {3,9,5,6,7};
          System.out.println("Maximum value "+a.lar(k));
	}

}
