package OOP_Abstraction;

public class Home extends Page {
	@Override
	public void title() {
		System.out.println("HP--- title");
	}

	@Override
	public void url() {
		System.out.println("HP--- URL");
	}
	
	@Override
	public void header () {
 	   System.out.println("HP----Page Header");
    }
    
	

}
