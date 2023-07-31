package ExceptionHandling;

public class ThrowKeyword {
/**
 * when you want to create a new exception you use throw keyword.
 * you can write throw new Exception name.
 * 
 * @param args
 */
	public static void getInfo() {
		String data = null;
		if (data==null) {
		try {
			throw new Exception ("Data not found Exception");
		}
		catch(Exception e) {
			System.out.println("Data not found Exception is coming");
			e.printStackTrace();;
		}
		}
	}
	public static void main(String[] args) {
		try {
			throw new Exception ("Naveen exception");
		}
		catch(Exception e) {
		System.out.println("some exception is coming");
		e.printStackTrace();
		}
	
		getInfo();
	
		
	
	}
}
