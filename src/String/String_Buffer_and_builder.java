package String;

public class String_Buffer_and_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Buffer_and_builder o=new String_Buffer_and_builder();
String name[]= {"arun","ram","vinay"};
o.display(name);
	}

	private void display(String[] name) {
		// TODO Auto-generated method stub
		String sen="";
		StringBuffer sb = new StringBuffer("");
		for(String names:name) {
			sen=sen+names;//to make one sentance
			//String is immutable in the name string we have 3 word
			//here sen is emty and then first objecct arun will come
			//and store new string object is created for that
			//like that 3 object is created for that
			//so that memeory is waste
			sb.append(names);
			System.out.println("String literal"+sen.hashCode());
			System.out.println("String buffer"+sb.hashCode());
		}
		System.out.println(sb);
		
	}

}
