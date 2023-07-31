package ConstructorConcept;

public class rectangle {
	
	double length;
	double width;
	
	rectangle(){
		this.length =0;
		this.width =0;
	}

	public rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea (double length, double width){ 	
		return length*width;
	}	
	public static void main(String[] args) {
		rectangle r = new rectangle();
		rectangle r1 = new rectangle(34.5, 50.0);
		System.out.println(r.length +" " + r.width);
		System.out.println(r1.length +" " + r1.width);
		System.out.println(r1.calculateArea(3, 4));
		
		
	}

}
