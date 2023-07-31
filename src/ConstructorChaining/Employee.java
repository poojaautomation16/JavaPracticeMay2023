package ConstructorChaining;

public class Employee {
	String name;
	int age;
	double salary;
	
	
	public Employee() {
		
	}

	public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
	}
	

}
