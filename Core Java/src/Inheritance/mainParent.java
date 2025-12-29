package Inheritance;

public class mainParent {

	public static void main(String[] args) {
	child1 c=new child1(100,99);
	System.out.println(c.a+" "+c.b);

	}

}
class PARAENT{
	int a;
	int b;
	public PARAENT() {
		this(99,95);
		a=10;
		 b=20;
		 
	System.out.println("zero parametrize parent");
}
	public PARAENT(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("2 parametrize parent");
	}
	
}
class child1 extends PARAENT{
	
	public child1() {
		a=30;
		 b=40;
			System.out.println("zero parametrize parent");
	}
	public child1(int a, int b){//local variable 
		this();
		this.a = a;
		this.b = b;
		System.out.println("2 parametrize parent");
	}
	
	
}