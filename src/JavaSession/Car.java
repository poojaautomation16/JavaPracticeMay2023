package JavaSession;

public class Car {
	String name;
	int price;
	String color;
	static int wheels =4;
	
// static class var should be common value for each object
	public static void main(String[] args) {
		Car c1= new Car();
		c1.name ="BMW";
		c1.price = 60;
		c1.color ="Blue";
		
		
		Car c2= new Car();
		c2.name ="Mercedeas";
		c2.price = 80;
		c2.color ="White";
		
		Car c3= new Car();
		c3.name ="Tesla";
		c3.price = 110;
		c3.color ="red";
		System.out.println( c1.name+ " : " +c1.price +" : "+ c1.color + " : " + wheels  );

	}

}
