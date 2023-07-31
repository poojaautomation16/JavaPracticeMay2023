package JavaSession;

public class IfElseCondition {

	public static void main(String[] args) {
		int a=20;
		int b=20;
		if (a>b) {
			System.out.println("a is greater than b: " + a);
		}
		else {
			System.out.println("b is greater than or equal to a: " + b);
		}
		
		if (a==b) {
			System.out.println("both a and b are equal");
		}
		//dead code
//		if (true) {
//			System.out.println("hi");
//		}
//		else {
//			System.out.println("bye");
//		}
		
		boolean flag = true;
		if (flag) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		int Number =100;
		if (Number<=100) {
			if (Number>=91) {
				System.out.println("Grade A");
			}
			if (Number<=90) {
				System.out.println("Grade B");
			}
		}
		else {
			System.out.println("Invaid Number");
		}
		
		String browser= "firefox";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("start chrome");
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("start firefox");
		}
		else if (browser.equalsIgnoreCase("safari")) {
			System.out.println("start safari");
		}
		else {
			System.out.println("please give correct browser");
		}

	}

}
