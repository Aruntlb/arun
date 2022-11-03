package collection;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put("dosa", 30);// put also an object
		hm.put("vada", 10);
		hm.put("poori", 50);
		hm.put("panniyaram", 20);
		System.out.println(hm);
		hm.put("vada", 15);
		System.out.println(hm);
		System.out.println(hm.get("dosa"));// get give the value
		//HashMap hm2=new HashMap(hm); or copy the object from another object
		HashMap hm2=new HashMap();
		hm2.putAll(hm);
System.out.println(hm2);
//true or false
System.out.println(hm2.containsKey("poori"));//to check the contain key
System.out.println(hm2.containsValue(30));//to check the contain value

System.out.println(hm2.remove("vada"));//to remove the key
System.out.println(hm2);

System.out.println(hm2.remove("poori", 50));// it give boolean expreesion interview question removekey and remove key and valur
System.out.println(hm2);
// collection dont have length only size
System.out.println(hm2.size());
//hm2.clear(); it will clear object
//hm2.isEmpty(); it will check the object empty or not give boolean value
//what is map
// menu list:
// key              value
//nellai express    19:30
//kumari express    20:00
//pandian express   21:30
//key+value===>entry
//key is unique sme name did't come
//value can value duplicate value
//key,value==>entry
//entry==>unique
//key is unique is known as set
//value have duplicate value so is known as list it will call as collection of values
//entry is unique so it is called as entryset
//entry have key and values
System.out.println(hm2.entrySet());
System.out.println(hm2.values());
System.out.println(hm2.keySet());
//how to itrate
Set s=hm.entrySet();
System.out.println(s);

	}

}
