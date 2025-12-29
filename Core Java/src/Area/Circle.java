package Area;
class circledemo{
	 int r;
       static float pi ;
       static {
    	   pi= 22/7;
       }
       
	public circledemo(int r){
		this.r=r;
	}
	 float  dispArea() {
		float area =pi*r*r;
		return area;
	}
			
}
public class Circle {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
     circledemo c=new circledemo(10);
     System.out.println(c.dispArea());

	}
    
}
