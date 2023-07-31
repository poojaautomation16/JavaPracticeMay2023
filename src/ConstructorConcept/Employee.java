package ConstructorConcept;

public class Employee {
	
	String name;
	int id;
	int age;
	double salary;
	boolean isperm;
	char gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	/**
	//constructor name will remain same is class name.
	//constructor will never return any value.
	//two type of constructor: default(zero parameter) and parameterize constructor
	//We can overload our constructor
	//constructor is called when we create an object of the class
	//purpose of the constructor is to help create object
    //constructor is helping initilize the class variable, so we will never write business logic
     inside constructor.
     //since we can't return any value , thats another reason we should not write logic
      inside constructor.
	 //We can create a private constructor, we won't be able to create the object of that
	  class, in that case we will have to make all the method and member static to be able to access
	  methods and variable of that class.
	 */
	
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
    public Employee(String name) {
    	System.out.println("1 para Constructor");
    	this.name = name;	
	}
    
    public Employee(String name, int id, int age) {
    	System.out.println("3 parameter Constructor");
		this.name = name;
		this.id = id;
		this.age = age;
   	}
    
	public Employee(String name, int id, int age, double salary, boolean isperm) {
		super();
		System.out.println("5 parameter Constructor");
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isperm = isperm;
	}

	public Employee(String name, int id, int age, double salary, boolean isperm, char gender) {
		super();
		System.out.println("6 parameter Constructor");
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isperm = isperm;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Pooja");
		System.out.println(e2.name);
		Employee e3 = new Employee("Manish", 10011,34 );
		System.out.println(e3.name);
		System.out.println(e3.age);
		System.out.println(e3.id);
		


	}

}
