package HAS_A;
public class HAS_ARelashionship {

	public static void main(String[] args) {
		student s=new student();
		Bike b=new Bike("honda",10000,"black");
		System.out.println(b.getBrand());
		s.hasA(b);
		System.out.println(s.h.getJob());
		 System.out.println(s.h.getWeight());
		 
		 
		 
		
		
	}

}
 class student{
	 Heart h=new Heart("pumping",70);
	 void hasA(Bike b,) {
		 System.out.println(b.getBrand());
		 System.out.println(b.getPrice());
		 System.out.println(b.getColor());
	 }
	 Brain B=new Brain("Function",80);
	 void hasA(Book c) {
		 System.out.println(c.getPrice());
		 System.out.println(c.getName());

	 }

 }

 class Bike{
	 String brand;
	 int price;
	 String color;
	 public Bike(String brand,int price,String color) {
		 this.brand=brand;
		 this.price=price;
		 this.color=color;
	 }
	 public String getBrand() {
		 return brand;
	 }
	 public void setBrand(String brand) {
		 this.brand=brand;
	 }
	 public int getPrice() {
		 return price;
	 }
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 public String getColor() {
		 return color;
	 }
	 public void setColor(String color) {
		 this.color = color;
	 }
 }
 class Heart{
	 String job;
	 double weight;
	 public Heart(String job,double weight) {
		 super();
		 this.job=job;
		 this.weight=weight;
	 }
	 public String getJob() {
		 return job;
	 }
	 public void setBrand(String job) {
		 this.job=job;
	 }
	 public double getWeight() {
		 return weight;
	 }
	 public void setPrice(double weight) {
		 this.weight = weight;
	 }
	  } 

 class Brain{
	 String job;
	 double weight;
	 public Brain(String job,double weight) {
		 super();
		 this.job=job;
		 this.weight=weight;
	 }
	 public String getJob() {
		 return job;
	 }
	 public void setBrand(String job) {
		 this.job=job;
	 }
	 public double getWeight() {
		 return weight;
	 }
	 public void setPrice(double weight) {
		 this.weight = weight;
	 }
	  } 
 class Book{
	 String name;
	 int price;
	 public Book(String name,int price) {
		 super();
		 this.name=name;
		 this.price=price;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setBrand(String name) {
		 this.name=name;
	 }
	 public int getPrice() {
		 return price;
	 }
	 public void setPrice(int price) {
		 this.price = price;
	 }
	  } 



