package Inheritance;

public class Multilevel {

	public static void main(String[] args) {
		ch c=new ch();
		System.out.println(c.a);
		System.out.println(c.b);
	}

}
class GrandParent{
	int a=10;
}
class par extends GrandParent{
	int b=20;
}
class ch extends par{
}
