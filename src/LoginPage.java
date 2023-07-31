import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LoginPage {
	
	public static void login(String userName, String passWord) {
		System.out.println("Login with: " + userName + "  and: " + passWord);
		
	}
	///fill registration form
	//admin, naveen: naveen@gmail.com:banglaore:india:560011
	public static String getUserCred(String role){
		HashMap<String, String> map= new HashMap<>();
		map.put("admin", "admin@amazon.com:admin123");
		map.put("seller", "seller@amazon.com:seller123");
		map.put("partner", "partner@amazon.com:partner123");
		map.put("vendor", "vendor@amazon.com:vendor123");
		map.put("user", "user@amazon.com:user123");
		
		return map.get(role);
	}

	public static void main(String[] args) {
		//Map<String, String> map= new HashMap<String, String>();
		//Map<String, String> map= new LinkedHashMap<String, String>();
		Map<String, String> map= new TreeMap<String, String>();
		map.put("admin", "456");
		map.put("seller", "123");
		map.put("partner", "34");
		map.put("vendor", "21");
		map.put("rahul", "680");
		map.put("Vihaa", "500");
		map.put("a", "100");
		map.put("t", "null");
		map.put("&", "");
		map.put("1", "");
		map.forEach((k,v)-> System.out.println(k + " : " + v));
		
		
		
		String u1= getUserCred("partner");
		String [] userDetails1 = u1.split(":");
		login(userDetails1[0], userDetails1[1]);
		
	}

}
