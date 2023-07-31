package SuperKeyword;

public class LoginPage extends Page {
   int timeout = 200;
   
   public LoginPage() {
	   super();
	   System.out.println("Login Page Default Constructor");	   
   }
   
   public void loginInfo() {
	  System.out.println("Login Info Method");
	  super.display();
	    
   }
   @Override
   public void display() {
	   System.out.println("LP Display"); 
	   super.display();
   }
	
   public void getTimeout() {
		  System.out.println("time out is: "+ timeout); 
		  System.out.println(super.timeout);
	   }
	
}
