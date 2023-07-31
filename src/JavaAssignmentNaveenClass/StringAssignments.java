package JavaAssignmentNaveenClass;

public class StringAssignments {

	public static void main(String[] args) {
		boolean b =compareStrings ("selenium", "selenium");
		System.out.println(b);
	    System.out.println(removeSpaceinString("       Pooja          Everyone   45    "));
	    printFirstandLastChar("automation");
	    System.out.println(reverseString("p"));
	    getLastHalfOfString("automation");
	      
	}
	
public static boolean compareStrings(String a, String b) {
	return a.equalsIgnoreCase(b);
	}

public static String removeSpaceinString( String s) {
	String s1= s.trim();
	String s2 = s1.replaceAll(" ", "");
	return s2;
}

public static void printFirstandLastChar(String s) {
	int n = s.length();
	System.out.println("first char is: " + s.charAt(0));
	System.out.println("Last char is: " + s.charAt(n-1));
	boolean b = s.contains("auto");
	System.out.println(b);
}

public static String reverseString( String s) {
	int n = s.length();
	String rev= "";
	if (n==1) {
		return s;
	}
	if (n>1) {
		for (int i=n-1; i>=0; i--) {
			rev = rev+ s.charAt(i);
		}
	}
	return rev;
}

public static void getLastHalfOfString(String s) {
	int n = s.length();
	System.out.println(s.substring(n/2, n));  
}

}
