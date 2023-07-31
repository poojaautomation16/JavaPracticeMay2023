package ConstructorConcept;

public class EmployeeTest {
	
	String name;
	int age;
	double salary;
	
	public EmployeeTest(String name, int age) {
		this.name = name;
		this.age = age;	
	}



	public static void main(String[] args) {
		EmployeeTest e1 = new EmployeeTest("radha", 25);
		System.out.println(e1.name + " " + e1.age);
		
		Employee e2 = new Employee("Manish");
		System.out.println(e2.name);
		e2.age = 25;
		
		
		
		e1.name = "pooja";
		e1.salary = 10000000;
	}

}
