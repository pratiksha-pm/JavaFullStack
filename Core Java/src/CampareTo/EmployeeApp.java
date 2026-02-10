package CampareTo;

public class EmployeeApp {

	public static void main(String[] args) {
		String s1="VIRAT";
		String s2="VIRU";
		int res=s1.compareTo(s2);
		System.out.println(res);
if(res>0) {
	System.out.println("s1 is grater");
}
else if(res<0) {
	System.out.println("s2 is grater");
}
else {
	System.out.println("both are same");
}
	}

}
