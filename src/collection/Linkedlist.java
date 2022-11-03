package collection;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li=new LinkedList();
li.add(5);
li.add("arun");
li.add("sam");
System.out.println(li);
li.addFirst("nithiya");
System.out.println(li);
System.out.println(li.poll());
System.out.println(li);
	}

}
