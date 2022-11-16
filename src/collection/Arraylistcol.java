package collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylistcol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
System.out.println(a.size());
//size() to check the size of an array

a.add(5);//input 5,10,15,25 are integer object
a.add(10);//it will print inertion order
a.add(15);
a.add(25);
a.add(35);
a.add("String");
a.add('c');
a.add(true);
System.out.println(a);
System.out.println(a.add(90));
System.out.println(a);
System.out.println(a.contains("String"));
System.out.println(a.get(0));
System.out.println(a.remove(0));
a.set(1, "abcd");// replace the index 
System.out.println(a);
System.out.println(a.indexOf("String") );// to find particular index
ArrayList a1=new ArrayList(a);
System.out.println(a1);
ArrayList a2=new ArrayList();
a2.add("chennai");
a2.add("mumbai");
a2.add("kolkatta");
a2.add("delhi");
System.out.println(a2);
a2.addAll(2, a);
System.out.println(a2);
a2.subList(0, 3);
List a3=a2.subList(0, 2);
System.out.println(a3);

	}

}
