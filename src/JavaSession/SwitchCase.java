package JavaSession;

public class SwitchCase {

	public static void main(String[] args) {

		//switch case
		String browser= "chrome";
		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "Firefox":
			System.out.println("Launch Firefox");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;
		case "Safari":
			System.out.println("Launch Safari");
			break;
		default:
			System.out.println("Please pass correct browser");
			break;
		}
//not a good example
		int marks =101;
		switch (marks) {
		case 100:
			System.out.println("Grade A");
			break;
		case 90:
			System.out.println("Grade B");
			break;
		case 80:
			System.out.println("Grade C");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		
		
	}

}
