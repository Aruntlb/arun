package String;

public class String_method {
void equalsme(String name1,String name2) {
	System.out.println(name1.equals(name2));
	//return type of equals boolean
}
void compare(String name1,String name2) {
	System.out.println(name1.equals(name2));
	//return type of equals boolean
}
void compareto(String name1,String name2) {
	System.out.println(name1.compareTo(name2));
	//return integer
}
void concat(String name1,String name2) {
	System.out.println(name1+name2);
}
void join(String name1,String name2) {
	String s=String.join("",name1,name2);
	System.out.println(s);
}
void substring(String name1) {
	System.out.println("orinal value"+name1);
	System.out.println("substring from index 6 "+name1.substring(6));
	System.out.println("substring from index 0 to 6 "+name1.substring(0,6));
}
void spilt(String s) {
	String parts[]=s.split("-");
	for(int i=0;i<parts.length;i++) {
		System.out.println(parts[i]);
	}
}
void trim(String s) {
	System.out.println(s.trim());
}
void charat(String s) {
	System.out.println(s.charAt(0));
	System.out.println(s.charAt(1));
}
void valueof(int a) {
	String s=String.valueOf(a);
	System.out.println(s);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_method o=new String_method();
		//o.equalsme("arun","arun");
		//o.compare("Arun","arun");
		//o.compareto("arunab","aruna");
		//o.concat("hello ", "world");
		//o.join("hello ", "world");
		//o.substring("SachinTendulkar");
		//o.spilt("hello-world-this-is-java");
		//o.trim("  arun");
		//o.charat("judo");
		o.valueof(10);
		}
}
