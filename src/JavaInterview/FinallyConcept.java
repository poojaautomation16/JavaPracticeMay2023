package JavaInterview;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
		test2();
		FinallyConcept f = new FinallyConcept();
		FinallyConcept f1 = new FinallyConcept();
		FinallyConcept f2 = new FinallyConcept();
		
		 f= null;
		 f1= null;
		 f2= null;
		//when we call this method gc will destroy all the object without any reference. 
		 System.gc();
		 

	}
	
	public void finalize () {
		System.out.println("finalize method");
	}
	
	public static void test1() {
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("Test");
		}catch(Exception e){
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
		
	}
	
	public static void test2() {
		int i=10;
		try {
			System.out.println("Inside try block");
			int k=i/0;
			
		}catch(ArithmeticException e){
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
		
	}

}
