package JavaInterview;

import java.util.HashMap;
import java.util.Map;

public class LoginPageClass {

	public static void main(String[] args) {
		String s[] = getUserCredentials("Customer").split(":");
		String un = s[0];
		String pwd = s[1];
		login(un,pwd );

	}
	public static String getUserCredentials(String role) {
		//Role base access control
				Map<String, String> user = new HashMap<String, String>();
				user.put("admin", "admin@az.com:admin123");
				user.put("Customer", "cust@az.com:cust123");
				user.put("Seller", "seller@az.com:seller123");
				user.put("partner", "partner@az.com:partner123");
				user.put("Distributor", "dist@az.com:dist123");
			return user.get(role);
	}
	
	public static void login(String un, String pwd) {
		System.out.println("Login with: " + un +" and: " +pwd );
	}

}
