package OOP_Encapsulation;

public class LoginPage {
	
	private String userName;
	private String passWord;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassWord(String passWord) {
		if (passWord!=null) {
			if (passWord.length()>=8) 
			{
		         this.passWord = passWord;
		     }
			}
	}
	
	public void doLogin() {
		System.out.println("Login with " + userName + " and " + passWord );
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	

}
