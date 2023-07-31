package ConstructorConcept;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("manish", 34, 'M', 5.7);
		Person p1 = new Person("Sugamdha", 30, 'F', 5.2);
		System.out.println(p.name + " " + p.age + " " + p.gender + " " +p.height );
		System.out.println(p1.name + " " + p1.age + " " + p1.gender + " " +p1.height );

	}

}
