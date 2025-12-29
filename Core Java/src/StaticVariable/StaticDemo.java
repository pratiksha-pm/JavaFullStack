package StaticVariable;
class StaticDemo1{
	static int a;
	static int b;
	static {
		a=100;
		b=200;
	}
	static void disp() {
		System.out.println(a);
		System.out.println(b);
		
	}
	int x;
	int y;
	{
		a=300;
		b=400;
		x=500;
		y=600;
	}
	void disp2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo1.disp();
		StaticDemo1 sd=new StaticDemo1();
		sd.disp2();

	}

}
