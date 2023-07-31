package AccessModifer2;
import AccessModifer1.Car;

public class Tesla extends Car {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		
		Tesla t = new Tesla();
		System.out.println(t.name);
		System.out.println(t.price);
	

	}

}
