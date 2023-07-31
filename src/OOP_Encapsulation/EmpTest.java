package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Honey");
		e1.setAge(25);
		e1.setSalary(45.78);
		System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary());
		System.out.println(e1.getAmount());
		
		Employee e2 = new Employee();
		System.out.println(e2.getName() + " " + e2.getAge() + " " + e2.getSalary());
		System.out.println(e2.getAmount());
		
		LoginPage lp = new LoginPage();
		lp.setUserName("pooja@gmail.com");
		lp.setPassWord("pooja1234");
lp.doLogin();
		
		LoginPage lp1 = new LoginPage();
		lp1.doLogin();
	}

}
