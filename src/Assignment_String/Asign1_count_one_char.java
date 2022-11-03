package Assignment_String;

import java.util.Scanner;

public class Asign1_count_one_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=" abcdabcd";
		int b=0;
		char c='c';
		//a=s.nextLine();
		//System.out.println(a.length());
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==c) {
				b++;
			}
		}System.out.println(b);

	}

}
