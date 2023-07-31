package AccessModifer1;

public class BMW extends Car {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.color);
		System.out.println(c.price);
		
		BMW b = new BMW();
		System.out.println(b.name);
		System.out.println(b.color);
		System.out.println(b.price);

	}

}
