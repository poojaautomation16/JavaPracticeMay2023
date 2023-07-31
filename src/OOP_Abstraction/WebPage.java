package OOP_Abstraction;

public class WebPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.logo();
		lp.header();
		lp.dologin("admin", "admin");
		System.out.println("**************************");
		Home hp = new Home();
		hp.title();
		hp.header();
		hp.logo();
		hp.url();
	}

}
