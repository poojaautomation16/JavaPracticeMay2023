package ExceptionHandling;

public class tryCatchBlock {
	
	String name ;

	public static void main(String[] args) {
		tryCatchBlock b = new tryCatchBlock();	
		System.out.println(b.name);
		b= null;
		try {
        int a =9/0;
		System.out.println(b.name);
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		}
		catch(ArithmeticException e) {
			System.out.println("catch block");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		System.out.println("bye");

	}

}
