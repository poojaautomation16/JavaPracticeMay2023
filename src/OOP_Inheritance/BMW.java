package OOP_Inheritance;

public class BMW extends Car {
	//overridden
	@Override
	public void start() {
		System.out.println("BMW----- Start");
	}
	
	public void autoparking() {
		System.out.println("BMW----- autoparking");
	}
	//static method cannot be overridden 
	//method hiding
	public static void drive () {
		System.out.println("BMW----- drive");
	}

}
