package JavaSession;

public class Test {

	public static void main(String[] args) {
		Palindrome("madam");
		Palindrome("hello");

	}
	
	public static void Palindrome(String d) {
	int n = d.length();
	String rev ="";
	for (int i=n-1; i>=0; i--) {
		char c = d.charAt(i);
		rev = rev+c;
	}
	
	System.out.println(rev);
	
	if (d.equalsIgnoreCase(rev)) {
		System.out.println("String is a palindrome");
	}
	else {
		System.out.println("String is not a palindrome");
	}

}
}