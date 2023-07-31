package ConstructorConcept;

public class LoginPage {
	String UserName;
	String Password;
	
	public LoginPage(String userName, String password) {
		super();
		UserName = userName;
		Password = password;
	}
	
	public void doLogin() {
		System.out.println("login to app");
		System.out.println("login with " + UserName + " and "  + Password);
	}
	
    public void resetPassword() {
    	System.out.println("reset My password");
	}


}
