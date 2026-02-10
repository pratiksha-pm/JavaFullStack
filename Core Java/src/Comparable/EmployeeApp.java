package Comparable;
import java.util.ArrayList;
import java.util.Collections;
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e=new Employee(101,"Pratiksha",210);
		Employee e1=new Employee(102,"Pratiksha",210);
		Employee e2=new Employee(103,"Pratiksha",210);
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(e);
		al.add(e2);
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
class Employee implements Comparable{
int id;
String name;
int salary;
public Employee(int id,String name,int salary) {
	super();
	this.id=id;
	this.name=name;
	this.salary=salary;
}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
}
	public String toString() {
		return id+" "+name+" "+salary;
		}
	@Override
	public int compareTo(Object o) {
		if(this.id>(((Employee)(o)).id)) {
			return 1;
		}
		else {
		return -1;}
		
	}
}
