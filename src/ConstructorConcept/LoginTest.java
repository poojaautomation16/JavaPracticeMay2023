package ConstructorConcept;

public class LoginTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage("hello123@gmail.com", "hello123");
		lp.doLogin();
		
		LoginPage vijay = new LoginPage("vijay@gmail.com", "vijay123");
		vijay.doLogin();

	}

}
