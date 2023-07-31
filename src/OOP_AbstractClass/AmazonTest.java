package OOP_AbstractClass;

public class AmazonTest {

	public static void main(String[] args) {
		LoginPage lp= new LoginPage(10);
		lp.title();
		lp.url();
		lp.defaultPageTimeOut();
		lp.displaylogo();
		Page.displayFooter();
		lp.doLogin("Hello@gmail.com", "Hello134");
		System.out.println("*************************");
		Page p = new LoginPage(15);
		p.defaultPageTimeOut();//it will give child class time as we reference type check will be failed. 
		p.displaylogo();
		p.title();
		p.url();
		Page.displayFooter();
		
		
	

	}

}
