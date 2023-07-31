package JavaInterview;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Selenium";
		int n = s.length();
		String rev ="";
		for (int i=n-1; i>=0; i--) {
			rev = rev+ s.charAt(i);
		}
		System.out.println(rev);
		findReverseOfaNumber(12455);
		findReverseOfaNumber(33675);

	}
	
	public static void findpalindrome(String s) {
		int n = s.length();
		String rev = "";
		for (int i=n-1 ; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("reverse String is: " + rev);
		if (rev.equalsIgnoreCase(s)) {
			System.out.println( s + " : String is a palindrome");
		}
		else {
			System.out.println( s + " : String is not a palindrome");
		}
		
	}
	
	public static void findrevWithStringBuffer(String s) {
		StringBuffer s1 = new StringBuffer(s);
		StringBuffer rev = s1.reverse();
		String s2= rev.toString();
		System.out.println("rev String is: " + s2);
		if (s2.equalsIgnoreCase(s)) {
			System.out.println( s + " : String is a palindrome");
		}
		else {
			System.out.println( s + " : String is not a palindrome");	
			
		}
		
		}
		
	public static void findReverseOfaNumber(int s) {
		int rev = 0;
		while (s!=0) {
			rev= rev*10 + s%10;
			s= s/10;
		}
		System.out.println("Reverse of the Number is: " + rev);
		
	}

}
