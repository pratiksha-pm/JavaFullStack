package HAS_A;

public class SuperKeyword {

	public static void main(String[] args) {
		//parent c=new child();  .....polymorphism 
		child c=new child();
c.disp();
	}

}
class parent{
	int x=10;
	void disp() {
		System.out.println("this is parent ");
	}
}
class child extends parent{
	int x=20;
	void disp() {
		//System.out.println(super.x);
		super.disp();
		System.out.println("this");
		
	}
}