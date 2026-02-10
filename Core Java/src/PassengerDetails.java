import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class PassengerDetails {

	public static void main(String[] args) {
		Passenger p=new Passenger(1000,"Jonh","Nagpur","Mumbai");
		Passenger p1=new Passenger(1004,"Rohan","Pune","Mumbai");
		Passenger p2=new Passenger(1002,"Muskan","Raipur","Mumbai");
		Passenger p3=new Passenger(1003,"Pratik","Amravati","Mumbai");
		ArrayList al= new ArrayList();
		al.add(p);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		PassengerDetails s1=new PassengerDetails();
		System.out.println(al);
		}

	

}
class Passenger implements Comparator{
	int P_id;
	String P_name;
	String Destination_from;
	String Destination_to;
	public Passenger(int P_id, String P_name, String Destination_from,String Destination_to) {
		this.P_id=P_id;
		this.P_name=P_name;
		this.Destination_from= Destination_from;
		this.Destination_to=Destination_to;
	}
	public void 
	
	@Override
	public int compare(Object o1, Object o2) {
	int res=(((PassengerDetailss1)(01)).name).compareTo((((PasssengerDetailss1)(o2)).name));
	if(res>0) {
		retrun 1;
	}
	else {
		return -1;
	}
	public 
}
