package SuperKeyword;

public class Car extends Vehicle {
	
	int speed = 100;
	
	public Car() {
		System.out.println("Car Class Default constructor ");	
	}
	
	public Car(int a) {
		System.out.println("Car Class constructor " + a);
	}
	
    public void start() {
		System.out.println("Car Start Method");
	}
    
    public static void testiing() {
    	System.out.println("Car testing");
    }

}
