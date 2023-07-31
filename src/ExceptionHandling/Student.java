package ExceptionHandling;

public class Student {
	public static int getStudentMarks(String name) {
		System.out.println("Getting amrks for: " + name);
		if (name.equals("Shubham")) {
			try {
				int i=9/0;
			}catch (ArithmeticException e) {
				System.out.println("AE is coming");
				return 85;
			}
			finally {
				return 100;
			}
			}
			else if(name.equals("sapna")) {
				return 90;
			}
			else {
				System.out.println("student not found");
				return -1;
			}
		}
		
	

	public static void main(String[] args) {
		
	}

}
