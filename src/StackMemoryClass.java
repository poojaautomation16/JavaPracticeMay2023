
public class StackMemoryClass {
	public static void t1() {
		System.out.println("t1 method");
		StackMemoryClass.t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		StackMemoryClass.t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
		StackMemoryClass obj = new StackMemoryClass();
		obj.m1();
	}
	
	public void m1() {
		System.out.println("m1 method");
		int i=10;
		m2();
		t1();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		//m1();
	}

	public static void main(String[] args) {
		StackMemoryClass obj = new StackMemoryClass();
		obj.m1();

	}

}
