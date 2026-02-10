package Abstraction;
public class SecurityForceApp {
     public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<Army>>>>>>>>>>>>>>>");
	    duty(new Army1());
	    System.out.println("<<<<<<<<<<<<<<<Navy>>>>>>>>>>>>>>>");
		duty(new Navy1());
		System.out.println("<<<<<<<<<<<<<<<AirForce>>>>>>>>>>>>>>>");
		duty(new AirForce1());
		}
		static void duty(securityForce1 s) {
			s.protect();
		}
	}
abstract class securityForce1{
	abstract void protect() ;
}
class Army1 extends securityForce1{
	void useLand() {
		System.out.println("Army uses Land ");
		}
	void protect() {
		System.out.println("Protecte land1 ");
	}
}
class Navy1 extends securityForce1{
	void protect() {
		System.out.println("Protecte oceans ");
	}
	void useShip() {
		System.out.println("Army uses Ship ");
		}
}
class AirForce1 extends securityForce1{
	void protect() {
		System.out.println("Protecte air ways ");
	}
	void useJets() {
		System.out.println("Army uses air ");
		}
}