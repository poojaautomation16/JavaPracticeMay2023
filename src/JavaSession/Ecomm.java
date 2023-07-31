package JavaSession;

public class Ecomm {
	
	public void login() {
		System.out.println("Default Login");
	}
	public void login(String un, String pwd) {
		System.out.println("Login With:" + un +" "+ pwd);
	}
	public void login(String email, String pwd, String otp) {
		System.out.println("Login With:" + email +" "+ pwd +" "+ otp);
	}

	public static void main(String[] args) {
		Ecomm user = new Ecomm();
		user.login("pooja", "12345");

	}

}
