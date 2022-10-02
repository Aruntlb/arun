package Class_and_object;
class book extends Thread{
	public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("update");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
class Book1{
	void print() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		}
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}
}	


public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		book o1=new book();
		Book1 o2=new Book1();
		
		
		o1.start();
		o2.print();
		o1.join();
		//o2.join();
		System.out.println("thank you");

	}

}
