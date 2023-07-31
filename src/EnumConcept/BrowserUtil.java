package EnumConcept;

public class BrowserUtil {

	public static void main(String[] args) {
		Browser b = Browser.CHROME;
		
		if (b==Browser.CHROME) {
			System.out.println("Launch Chrome");
		}
		Enviorment env = Enviorment.QA;
		System.out.println(env.getEnvValue());
		System.out.println(AppConstants.LOGIN_PAGE_TITLE);
		
		
	}

}
