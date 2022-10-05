package Class_and_object;
class Stack{
	int a[]=new int[10];
	int b=-1;
	void push(int x) {
		if(a[9]==9) {
			System.out.println("Stack is full");
		}
		else {
		a[++b]=x;
		}
	}
	int pop() {
		if(b>0) {
		return a[b--];
		}
		else {
			System.out.println("empty stack");
			return -1;
		}
	}
	
}

public class Push_and_pop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack o=new Stack();
		o.push(5);
		o.push(2);
		o.push(6);
		o.push(8);
		System.out.println(o.pop());
		
		

	}

}
