package JavaAssignmentNaveenClass;

public class MethodAssigments {

	public static double prod(double a , double b) {
		return a*b;
	}
	
	public static void areaOfCircle(int r) {
		double area;
		double circumference;
	    area = 3.14*r*r;
	    circumference = 2*3.14*r;
	    System.out.println("area of circle is: "+ area +"Circumference is: " + circumference );
	}
	
	public static void maxAndMin(int a, int b, int c) {
		if (a>b && a>c) {
			System.out.println("greatest number is ");
		}
	}
	
	public static void main(String args[]) {
		double prod = prod(3, 5);
		System.out.println(prod);
		areaOfCircle(4);
		
	
	
}
}
