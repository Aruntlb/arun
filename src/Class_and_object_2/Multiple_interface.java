package Class_and_object_2;
interface india{
	int rate=5;
	void gst();
	void traffic();
}

interface tamilnadu{
	int rate=6;
	void sgst();
	void tnpsc();
	
}
class citizen implements india,tamilnadu{

	@Override
	public void sgst() {
		// TODO Auto-generated method stub
		System.out.println(tamilnadu.rate);
		
	}

	@Override
	public void tnpsc() {
		// TODO Auto-generated method stub
		System.out.println("goverment exam");
		
	}

	@Override
	public void gst() {
		// TODO Auto-generated method stub
		System.out.println(india.rate);
		
	}

	@Override
	public void traffic() {
		// TODO Auto-generated method stub
		System.out.println("obey signal");
		
	}
	
}
public class Multiple_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		citizen o=new citizen();//Static blinding
		o.sgst();
		o.tnpsc();
		o.gst();
		o.traffic();
	}

}
