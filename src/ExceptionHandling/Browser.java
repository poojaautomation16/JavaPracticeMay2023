package ExceptionHandling;

public class Browser {

	public static void main(String[] args) {
		String browser = "naveen";
		
		if (browser.equals("chrome")) {
			System.out.println("Browser found");
		}
		else {
			System.out.println("browser not found");
			throw new FrameworkException("browser not found");
		}
		System.out.println("enter the url");

	}

}
