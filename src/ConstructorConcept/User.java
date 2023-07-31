package ConstructorConcept;

public class User {
	String firstName;
	String lastName;
	String emailId;
	String phone;
	String password;
	String city;
	//user can be created if you have : FN , LN
	//FN, LN,email id
	//FN
	//FN, LN, password
	//FN, LN, emailid, phone, password, City
	
	User(String firstName){
		this.firstName = firstName;
	}
	
	User(String firstName,String lastName ){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	User(String firstName,String lastName , String emailId){
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	User(String firstName,String lastName , String password,String phone  ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phone =phone;
	}
	
	User(String firstName,String lastName , String password,String phone ,String city ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phone =phone;
		this.city = city;
	}

	public User(String firstName, String lastName, String emailId, String phone, String password, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.password = password;
		this.city = city;
	}

	public static void main(String[] args) {
		User u1 =new User("Vihaan", "Agrawal");
		System.out.println(u1.firstName + " " + u1.lastName);
		
	}

}
