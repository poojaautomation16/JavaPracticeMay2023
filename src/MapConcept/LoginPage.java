package MapConcept;

import java.util.HashMap;

public class LoginPage {
	
	//Role based access control
	public static String getUserCread(String role) {
		HashMap<String, String> credMap = new HashMap<String, String>();
		credMap.put("admin", "admin@az.com:admin123");
		credMap.put("Customer", "Customer@az.com:Cust123");
		credMap.put("Seller", "Seller@az.com:Seller123");
		credMap.put("Partner", "Partner@az.com:Partner123");
		credMap.put("distributor", "distributor@az.com:dist123");
		credMap.put("CategoryManager", "CategoryManager@az.com:cat123");
		
		return credMap.get(role);
	}
	
	public static void doLogin(String un, String pwd) {
		System.out.println("Login with: " +un + " and " + pwd);
	}

	public static void main(String[] args) {
		String s[] = getUserCread("Partner").split(":");
		String s1 = s[0].trim();
		String s2 = s[1].trim();
		doLogin(s1, s2);
		
		
	}

}
