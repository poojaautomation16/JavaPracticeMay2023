package JavaSession;

public class Employee {
	
	String name;
	int id;
	int age;
	String City;
	double Salary;
	boolean isPermanent;
	char gender;
     public Employee() { 
    	 System.out.println("Default constructor...");
     }
     public Employee(int a) {
    	 System.out.println("parametriase const...");
     }
     public Employee(String name, int id) {
    	this.name = name;
    	this.id =id;
     }
	public static void main(String[] args) {
		// pooja is object reference Name
		// new Employee is object
		Employee pooja = new Employee() ;
		Employee Manish = new Employee();
		Employee Sunil = new Employee();
		Employee Ashwin = new Employee();
		Employee Suhas = new Employee();
		pooja.name ="Pooja";
		pooja.age =25;
		pooja.City ="Bradenton";
		pooja.Salary =110000.00;
		pooja.isPermanent =true;
		Manish.name ="Manish";
		Manish.age =30;
		Manish.City ="Sarasota";
		Manish.Salary =200000.00;
		Manish.isPermanent =false;
	System.out.println(pooja.name + " "+pooja.age+" "+ pooja.City +" " +pooja.Salary );
	}

}
