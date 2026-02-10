package Polymorphism;



public class securityForceApp {

	public static void main(String[] args) {
	
       duty(new Army());
		duty(new Navy());
		duty(new AirForce());
	}
	static void duty(securityForce s) {
		s.protect();
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
		System.out.println("Protecte land1 ");
	}
}
class Navy extends securityForce{
	void protect() {
		System.out.println("Protecte ship1 ");
	}
	void useShip() {
		System.out.println("Army uses Ship ");
		
	}
	
}
class AirForce extends securityForce{
	void protect() {
		System.out.println("Protecte air1 ");
	}
	void useJets() {
		System.out.println("Army uses air ");
		
	}
	
}