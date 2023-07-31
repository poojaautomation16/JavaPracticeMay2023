package SuperKeyword;

public class Audi extends Car {
	
	int speed= 200;

	public Audi() {
		super(10);
		System.out.println("Audi Constructor");
	}
	
	@Override
	public void start() {
		System.out.println("Audi Start Method ");
		super.start();
	}
	
	public void getSpeed() {
		System.out.println(speed);
		System.out.println(super.speed);
	}

}
