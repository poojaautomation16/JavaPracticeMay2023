package WebDriver_Arch;

public class GoogleTest {
	
	public static void main (String a[]) {
		
		Webdriver driver =null;
		String browserName = "ie";
		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
        case "firefox":
        	driver = new FirefoxDriver();
			break;
        case "ie":
    	   driver = new IEdriver();
	    break;

		default:
			System.out.println("Please pass on the right browser....");
			break;
		}
		
		driver.get("www.google.com");
		String s = driver.getTitle();
		System.out.println(s);
		driver.findElement();
		
		
		
	}

}
