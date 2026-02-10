package Polymorphism;

public class TendulkarApp {

	public static void main(String[] args) {
		Tendulkar t=new ArjunTendulkar();
		t.job();
		t.profession();
		((ArjunTendulkar)t).smoke();
	//	t.smoke(); because it specialized inhertiance and parent can not access child method

	}

}
class Tendulkar{
	void job() {
		System.out.println("play cricket");
	}
	void profession() {
		System.out.println("he is batsman");
	}
}
class  ArjunTendulkar extends Tendulkar{
	void smoke() {
		System.out.println("he smoke some time");
	}
	void profession() {
		System.out.println("he is baller");
	}
}