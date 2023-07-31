package OOP_Abstraction;

public interface USMedical extends WHO, UN {
 //one interface can extends multiple parents.
	//100% abstraction
	int min_fee = 100;
	public void physioServices() ;

	public void cardioServices();

	public void ENTServices();
	
	public void test(int a);
	
	public String get(int a);
	public String get(int a, int b);
	
	@Override
	public void covidVaccination();
	//partial abstraction
	//from jdk 1.8
	//1. we can have static method with method body(buss logic)
	public static void usMedPharmacy() {
		System.out.println("US----med Pharmacy");
	}
	//2. can have default method (non static) with method body
	//this method will be given to the class which will implement it
	//can we override it? yes it can be overridden using public access modifier
	default void billing() {
		System.out.println("US--medical billing");
	}
	
	
}
