package JavaSession;

public class ObjectReferenceConcept {
	//Class data members
	String name;
	int age;
	public void get() {
		System.out.println("get method");
	}

	public static void main(String[] args) {
		ObjectReferenceConcept obj = new ObjectReferenceConcept();
		obj =null;
		obj.name ="tom";
		System.out.println(obj.name);
		
		//no reference objects
		new ObjectReferenceConcept().name = "pete";
		new ObjectReferenceConcept().age = 25;
	}

}
