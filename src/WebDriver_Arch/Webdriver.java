package WebDriver_Arch;

public interface Webdriver extends SearchContext {
	@Override
	public void findElement();
	@Override
	public void findElements();
	
	public void click();
	
	public void sendKeys(String key);
	
	public void get (String url);
	
	public String getTitle();
	
	public void close();
	
	public void quit();

}
