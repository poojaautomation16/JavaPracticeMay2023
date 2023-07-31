package ExceptionHandling;

public class FInallyBlock {

	public static void main(String[] args) {
		System.out.println("ABC");
		try {
			int i=9/0;	
		}
		catch (ArithmeticException e) {
			System.out.println("AE exception is coming");
			e.printStackTrace();
		}
		finally {
			System.out.println("I'm in finally block");
		}

	}

}
