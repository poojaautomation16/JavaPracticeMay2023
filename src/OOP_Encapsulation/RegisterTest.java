package OOP_Encapsulation;

public class RegisterTest {

	public static void main(String[] args) {
		Register r = new Register("name",40, 8769876345l, "Nagpur", true );
		System.out.println(r.getName() + " " + r.getAge() + " " + r.getPhoneNumber() + " " + r.getCity() + " " + r.isPerm());
		// in this case we have set the value using constructor only.
		// however if we want to update the any value, we will need setter for that purpose
		r.setAge(41);
		r.setCity("Banglore");
		
		System.out.println(r.getName() + " " + r.getAge() + " " + r.getPhoneNumber() + " " + r.getCity() + " " + r.isPerm());
		

	}

}
