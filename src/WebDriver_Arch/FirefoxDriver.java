package WebDriver_Arch;

public class FirefoxDriver implements Webdriver {

	public FirefoxDriver() {
		System.out.println("Launch Firefox Browser");
	}

	@Override
	public void findElement() {
		System.out.println("find element");

	}

	@Override
	public void findElements() {
		System.out.println("find elements...........");

	}

	@Override
	public void click() {
		System.out.println("click on element");

	}

	@Override
	public void sendKeys(String key) {
		System.out.println("send Keys: " + key);

	}

	@Override
	public void get(String url) {
		System.out.println("Get String: " + url);

	}

	@Override
	public String getTitle() {
		return "title";
	}

	@Override
	public void close() {
		System.out.println("Close the browser");
	}

	@Override
	public void quit() {
		System.out.println("Quit the browser");
	}
}

