package JavaSession;

public class FunctionsInJava {
	// cannot create a function inside a function
	// can call one function from another function
	
	//1. no input no return
	public void test() {
		System.out.println("no input no return function");
		int i=10;
		System.out.println(i);
	}
	//2. some input no return
	public void test(int i) {
		System.out.println("Some input no return function");
		System.out.println(i);
	}
	//3. no input Some return
	public int getBalance() {
		System.out.println("get Balance");
		int fee= 10;
		int tax= 5;
		int total = fee+tax;
		return total;
	}
	//4. some input Some return
		public int getBalance(int f, int t) {
			System.out.println("get Balance");
			int total = f+t;
			return total;
		}

	public static void main(String[] args) {
		FunctionsInJava fun = new FunctionsInJava();
		fun.test();
		fun.test(30);
		System.out.println(fun.getBalance());
		System.out.println(fun.getBalance(10, 45));
	}

}
