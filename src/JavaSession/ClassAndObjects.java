package JavaSession;

public class ClassAndObjects {
	
	int i=20; //class variable(global scope)to acccess the class variable you need to create object/

	public static void main(String[] args) {
		
		int i=10 ; // local variable(within the method)
		System.out.println(i);
		ClassAndObjects obj = new ClassAndObjects();
		System.out.println(obj.i);
		
		
	}

}
