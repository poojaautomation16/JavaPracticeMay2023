package OOP_Abstraction;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical {
//USmedical methods
	@Override
	public void physioServices() {
		System.out.println(" FH-- physioServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println(" FH-- cardioServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println(" FH-- ENTServices");
		
	}
	//UKmedical methods
	@Override
	public void neuroServices() {
		System.out.println(" FH-- neuroServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println(" FH-- orthoServices");
		
	}

	@Override
	public void Oncology() {
		System.out.println(" FH-- Oncology");
		
	}

	@Override
	public void gynoServices() {
		System.out.println(" FH-- gynoServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println(" FH-- opthoServices");
		
	}

	@Override
	public void covidVaccination() {
		System.out.println(" FH-- covidVaccination");	
	}

	@Override
	public void test(int a) {
		System.out.println(" FH-- test" + a);	
	}

	@Override
	public String get(int a) {
		System.out.println(" FH-- test" + a);	
		return "Hello";
	}

	@Override
	public String get(int a, int b) {
		System.out.println(" FH-- test" + a + " "+ b);	
		return "Hello";
	}

	@Override
	public void medicalNew() {
		System.out.println("fh--- Medical news");
		
	}
	//default overridden method from usmedical
	@Override
	public void billing() {
		System.out.println("FH--medical billing");
	}

}
