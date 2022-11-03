package Assignment_String;

public class Asign16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Schahin";
		String s2="Schahin";
		String s3=new String("Schahin");
		String s4="Ratan";
		//equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		//==
		System.out.println("----------------");
		System.out.println(s1==s2);
		System.out.println(s1==s3);//because of s3 refers to instance created in nonpool
		System.out.println("----------------");
		System.out.println(s1.compareTo(s3));
		System.out.println(s4.compareTo(s1));
		

	}

}
