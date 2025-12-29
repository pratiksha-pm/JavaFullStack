package Inheritance;

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c =new child();
	}

}
class parent1{

	public parent1() {
	System.out.println("this is parent1 constructor");
	}
	
}
class parent2{
int b=20;
	public parent2() {
		System.out.println("this is parent2 constructor");
	}
	
}
//syntax erro
class child extends parent1,parent2{
	public child() {
		System.out.println("this is child constructor");
}
	