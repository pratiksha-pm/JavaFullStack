package Polymorphism;

public class Trainer1 {

	public static void main(String[] args) {
		duty(new JavaTrainermain());
		duty(new ApiTrainermain());
		duty(new TestTrainermain());
	}
	static void duty(Trainermain t) {
		t.Teach();
	}

}
class Trainermain{
	void Teach() {
		System.out.println("Trainer teches");
	}
}
class JavaTrainermain extends Trainermain{
	void Teach() {
		System.out.println("Trainer teches java");
		
	}
}
class ApiTrainermain extends Trainermain{
	void Teach() {
		System.out.println("Trainer teches api");
		
	}
}
class TestTrainermain extends Trainermain{
	void Teach() {
		System.out.println("Trainer teches tests");
		
	}
}