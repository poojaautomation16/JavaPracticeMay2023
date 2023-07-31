package StringConcept;

import ExceptionHandling.FrameworkException;

public class StringReverse {

	public static void main(String[] args) {
		//Selenium
		 String s = "Selenium";
		 System.out.println(reverseString(s));
		 
		 String p = "seleniumuineles";
		 palindromeString(p);
		 
		String r = "testing selenium Cypress";
				 System.out.println(reverseString(r));
				 int r1= 123;
				 String r2= Integer.toString(r1);
				 System.out.println(reverseString(r2));

	}
	
		public static String reverseString(String s) {
		if (s==null) {
			System.out.println("null values are not allowed");
			throw new FrameworkException ("String can not be null");
		 }
		 int n = s.length();
		 System.out.println("Length is: "+ n);
		 String rev="";
		 if(n==0) { 
				return "String length is zero";
			 }
		 if(n==1) {
			return s;
		 }
		 else 
		 for (int i=n-1; i>=0; i--) {
			 rev = rev+ s.charAt(i);
		 }
		return rev;
		
	}
	
	public static void palindromeString(String s) {
		int n = s.length();
		 String rev="";
		 if (n==0) {
			 System.out.println("Empty String");
		 }
		 else if(n==1) {
			System.out.println(s); 
		 }
		 else 
		 for (int i=n-1; i>=0; i--) {
			 rev = rev+ s.charAt(i);
		 }
		  if (rev.equals(s)) {
			  System.out.println("String is a palindrome");
		  }	
	}

}
