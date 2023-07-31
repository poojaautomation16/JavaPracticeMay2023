
public class EmployeeTest {
	String name ;
	int age;
	
	public void add (int a, int b) {
		System.out.println(a+b);
	}
	
	public void printMsg() {
		System.out.println("Hello");
	}
	
	public void getEmployeeInfo(EmployeeTest ob) {
		ob.name = "tom";
		ob.age= 20;
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
		EmployeeTest obj = new EmployeeTest();
		obj.add(20, 30); // calling a method by passing the value. CallbyValue or argument
		obj.printMsg(); 
		
		obj.getEmployeeInfo(obj);// call by reference
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println("*************");
		obj.name ="Riya";
		obj.age =30;
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println("*************");
		obj.getEmployeeInfo(obj);
		System.out.println("*************");
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		

	}

}
