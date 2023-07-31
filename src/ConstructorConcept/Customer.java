package ConstructorConcept;

public class Customer {
	String name;
	int custId;
	String city;
	long phoneNo;
	
	public Customer(String name, int custId, String city, long phoneNo) {
		super();
		this.name = name;
		this.custId = custId;
		this.city = city;
		this.phoneNo = phoneNo;
	}
	
	public int getSalary(int totalCTC, int bonus) {
		return totalCTC + bonus;
	}
	
	

}
