package OOP_Inheritance;

public class Car extends Vehicle{
	public void start() {
		System.out.println("Car---- Start");
	}
	
	public void stop() {
		System.out.println("Car---- Stop");
	}
	
	public void refuel() {
		System.out.println("Car---- Refuel");
	}
	
	public static void drive () {
		System.out.println("car----- drive");
	}
	//private method cannot be overridden
	private void testing() {
		System.out.println("car-Testing");
	}
	//a final method can not be overridden
	public final void power() {
		System.out.println("car-power");
	}

}
