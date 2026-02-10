package Abstraction;

public class ShapesApp {
	public static void main(String[] args) {
		duty1(new Circle(20));
		duty1(new Triangle(20,30));
		duty1(new Square(20));
		}
		static void duty1(Shapes S) {
			S.disp();
			S.findArea();
			}
	}
abstract class Shapes{
	double area;
	static double pi=3.14;
	abstract void disp();
	abstract void findArea();
}
class Circle extends Shapes{
	int r;
	public Circle(int r) {
		super();
		this.r=r;
}
  void findArea(){
	 area=pi*r*r;;
		}
  void disp() {
	findArea();
	System.out.println("Area of triangle :" +" "+ area);
	}
}

class Triangle extends Shapes{
	int b;
	int h;
public Triangle(int b,int h) {
	super();
	this.b=b;
	this.h=h;
}
 void findArea(){
	 area=(0.5)*b*h;
	}
 void disp() {
	findArea();
	System.out.println("Area of triangle :" +" "+ area);
	}
}

class Square extends Shapes{
	int s;
	public Square(int s) {
		super();
		this.s=s;
	}
	void findArea(){
		 area=s*s;
	}
	void disp() {
		findArea();
		System.out.println("Area of Square :"+" "+area);
	}
}
