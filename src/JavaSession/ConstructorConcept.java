package JavaSession;

public class ConstructorConcept {

	public static void main(String[] args) {
		//construct the object
		Employee e1 = new Employee();
		e1.name = "Poornima";
		e1.age =25;
		e1.id =100;
		e1.isPermanent = true;
		e1.gender = 'f';
		Employee e2 = new Employee("pooja", 100);
	}

}
