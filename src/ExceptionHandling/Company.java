package ExceptionHandling;

public class Company {
	
	/**
	 * throws keyword is used to throw the exception from one method to 
	 * another method. if the method can't handle the exception it can use the throws
	 * keyword and 
	 */
	
	
	public void m1() throws ArithmeticException{
		System.out.println("M1 Method");
		m2();
	}
	
	public void m2() throws ArithmeticException{
		System.out.println("M2 Method");
		try {
			m3();
			}
			catch(ArithmeticException e) {
				System.out.println("artimatic exception");
				e.printStackTrace();
			}
	}
	
	public void m3 () throws ArithmeticException{
		System.out.println("M3 Method");
		int i=9/0;
	}

	public static void main(String[] args) {
		Company c = new Company();
		c.m1();
		System.out.println("bye");

	}

}
