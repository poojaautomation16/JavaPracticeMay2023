package AccessModifer1;

public class Car {
   public String name;
   protected int price;
   private int milage;
   String color;

	
	public static void main(String[] args) {
		Car c = new Car();
		
		System.out.println(c.name);
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.milage);

	}

}
