package OOP_AbstractClass;

public class LoginPage extends Page {
    
	//hidden default constructor
	public LoginPage() {
		System.out.println("LP default constructor ");
	}
	
	public LoginPage(int i) {
		System.out.println("LP constructor " + i);
	} 
	
	@Override
	public void title() {
		System.out.println("LP---title ");	
	}

	@Override
	public void url() {
		System.out.println("LP--title");	
	}
	
	@Override
	public void defaultPageTimeOut() {
		System.out.println("Page time out = 5 sec ");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with " + un + " and " + pwd );
	}
	
	

}
