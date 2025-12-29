package Inheritance;

public class Main {

	public static void main(String[] args) {
		Army a=new Army();
		a.job();
		a.protect();
		a.useLand();
		System.out.println("----------");
		Navy n=new Navy();
		n.protect();
		n.useShip();
		System.out.println("----------");
		AirForce f=new AirForce();
		f.protect();
		f.useJets();

	}

}
class securityForce{
	void job() {
		System.out.println("Protect Nation");
	}
	void protect() {
		System.out.println("Protect ");
	}
}
class Army extends securityForce{
	
	void useLand() {
		System.out.println("Army uses Land ");
		
	}
	void protect() {
		System.out.println("Protecte land ");
	}
}
class Navy extends securityForce{
	void protect() {
		System.out.println("Protecte ship ");
	}
	void useShip() {
		System.out.println("Army uses Ship ");
		
	}
	
}
class AirForce extends securityForce{
	void protect() {
		System.out.println("Protecte air ");
	}
	void useJets() {
		System.out.println("Army uses air ");
		
	}
	
}