package Area;
class triangledemo{
	 int base;
      int height;
      
	public triangledemo(int base ,int height){
		this.base=base;
		this.height=height;
	}
	 double dispArea() {
		double area= 0.5*base*height;
		return area;
	}
			
}
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
triangledemo T=new triangledemo(50,20);
System.out.println(T.dispArea());
	}

}
