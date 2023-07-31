package OOP_Abstraction;

public class LoginPage extends Page {

	@Override
	public void title() {
		System.out.println("LP---Page title");	
	}

	@Override
	public void url() {
		System.out.println("LP---URL");	
	}
    @Override
	 public void header () {
  	   System.out.println("Login Page Header");
     }
     
    public void dologin(String un, String pwd) {
    	System.out.println("Login with: "+un + " " +pwd);
    }
    
    public void dologin(String un, String pwd, long ph) {
    	System.out.println("Login with: "+un + " " +pwd + " " + ph);
    }
}
