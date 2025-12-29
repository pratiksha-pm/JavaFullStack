package Inheritance;
 class  player{
	String name;
	int age;
	String gender;
	
	
}
class football extends player {
int goals;
int assist;
public football(String name,int age,String gender, int goal,int assist) {
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.goals=goal;
	this.assist=assist;
	
}
	public int getGoals() {
		return goals;
		
	}
	public int getAssist() {
		return assist;
		
	}public String getName() {
		return name;
	}
		}
public class inheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
football F=new football();
F.setter("Pratiksha",21 , 100, 5);
F.getter();
F.get(50);
	}

}
