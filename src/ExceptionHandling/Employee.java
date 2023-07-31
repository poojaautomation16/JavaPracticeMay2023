package ExceptionHandling;

public class Employee {
String name ;
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try
		{
			int i=9/0;	
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is handelled");
			e.printStackTrace();
		}
	try {
		Employee e = new Employee();
	e= null;
	System.out.println(e.name);
	}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception is handelled");
			e.printStackTrace();
		}
		
		System.out.println("bye");
		

	}

}
