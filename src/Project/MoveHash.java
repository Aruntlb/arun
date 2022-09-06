package Project;

public class MoveHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="#Move#Hash#";
		String b="";
		String c="";
		int f=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			
		if(a.charAt(i)=='#') {
			
			b=b+a.charAt(i);
			}
			else {
				c=c+a.charAt(i);
				}
		}
		System.out.println(b+c);
		}
		}
		

	


