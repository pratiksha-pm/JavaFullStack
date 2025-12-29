package Inheritance;
class parent{

	public parent() {
	
		System.out.println("thsi is parent constructor");
	}
}
class child extends parent{
public child() {
	
	System.out.println("thsi is child constructor");
	}
}
public class ParentApp2 {
	public static void main(String[] args) {
		child c=new child();
}
}
