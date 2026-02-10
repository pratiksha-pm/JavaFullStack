package HAS_A;

public class finalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 c=new child1();
		c.disp1();
	}

}
class parent1{
	int x=10;
	final void disp1() {
		System.out.println("this is parent ");
	}
}
class child1 extends parent1{
	//void disp1() {..we can't override it because it is final
	//	System.out.println("this is parent ");
	//}
		
	}