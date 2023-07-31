package JavaAssignmentNaveenClass;

public class LaunchBroswer {

	public static void main(String[] args) {
		
		String browser = "ie";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch browser: " + browser );
			break;
		case "firefox":
			System.out.println("launch browser: " + browser);
			break;
		case "safari":
			System.out.println("launch browser: " + browser);
			break;
		case "ie":
			System.out.println("launch browser: " + browser);
			break;
		default:
			System.out.println("Please pass on right Browser name:  " + browser);
			break;
		}

	}

}
