package Inheritance;

public class ParentApp1 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c=new Child();
System.out.println(c.a);
System.out.println("-----------------");
c.disp();//private can not access
	}

}
class Parent{
	private int a=10;
	int b=20;
	private void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}
class Child extends Parent{
	
}


