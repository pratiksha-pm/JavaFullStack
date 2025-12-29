package Polymorphism;

public class mainTrainer {

	public static void main(String[] args) {
		
JavaTrainer J=new JavaTrainer();
ApiTrainer T=new ApiTrainer();
TestTrainer A=new TestTrainer();
J.Teach();
T.Teach();
A.Teach();
	}

}
class Trainer{
	void Teach() {
		System.out.println("Trainer teches");
	}
}
class JavaTrainer{
	void Teach() {
		System.out.println("Trainer teches java");
		
	}
}
class ApiTrainer{
	void Teach() {
		System.out.println("Trainer teches api");
		
	}
}
class TestTrainer{
	void Teach() {
		System.out.println("Trainer teches tests");
		
	}
}