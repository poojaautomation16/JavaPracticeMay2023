package OOP_Encapsulation;

public class Employee {
    //binding the private property with public methods ( can be getter or setter or constructors or any public method with complex logic)
	//public layer is created to access private layer
	//to access these variable we need to create public layer of getter and setter
	//we have to create public getter and setters
	//its not necessary to create both getter and setter for the variable
	// we can also set the value using constructor but if we want to update any value, we will need setter for that purpose
	//setter can be user to check length as well.
	private String name;
	private int age;
	private double salary;
	private int amount;
	/**
	 * here we are hiding the logic in private method and calling the method in another
	   public method to get the required value.
	 */
	
	private void calculateShareAmount() {
		//int i=10;
		int fee =20;
		amount =(int) (salary+fee);
	}
	public int getAmount() {
		calculateShareAmount();
		return amount;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	} 
	
	public int getAge() {
		return age;
	} 
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	

}
