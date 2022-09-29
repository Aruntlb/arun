package Class_and_object;
class complex{
	int real,img;
	complex(){
		real=5;
		img=10;
		}
	complex(int r,int i){
		real=r;
		img=i;
	}
	complex(complex o2){
		real=o2.real;
		img=o2.img;
	}
	public String toString() {
		return "("+real+"+"+img+"i"+")";
	}
}

public class Copy_constructor {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex o1=new complex();
		System.out.println("object 1 "+o1);
		complex o2=new complex(2,3);
		System.out.println("object 2 "+o2);
		complex o3=new complex(o2);
		System.out.println("object 3"+o3);
	}

}
