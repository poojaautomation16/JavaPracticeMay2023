package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		
		b.start(); // overridden
		b.stop();  // inherited
		b.autoparking(); //individual method of child class
		b.refuel();  // inherited
		b.engine();   //inherited from grandParent
		BMW.drive();
		
		System.out.println("**********************************");
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		c.engine();
		
		Car.drive();
		System.out.println("**********************************");
		
		Audi a = new Audi();
		a.start();
		a.refuel();
		a.engine();
		a.autoStart();
		a.TheftSefety();
		
		//child class object can be referred by parent class variable:
		//Top Casting- c1.autoparking will not be allowed.
		Car c1 = new BMW();
		c1.start();
		c1.engine();
		c1.refuel();
		c1.stop();
		//c1.autoparking();  This is not allowed as reference type is car and object is of
		//bmw type . so car reference will not be able to bmw method. 
	
		System.out.println("**********************************");
		//downcasting
		//BMW b1 = (BMW)new Car (); // when we run this code we will get class cast exception
		//b1.start();
		
		
	}

}
