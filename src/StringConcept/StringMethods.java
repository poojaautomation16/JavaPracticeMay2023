package StringConcept;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "this is my java code and i am so happy and i am so cool";
		int n = s.length();
		System.out.println(n);
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(37));
		System.out.println(s.indexOf("m"));
		System.out.println(s.indexOf("i"));//1st occurance of i
		int a=  s.indexOf("i")+1;
		System.out.println(s.indexOf("i", a));
		System.out.println(s.indexOf("i", s.indexOf("i", a)+1));
		//find all index of i using loop?
		// find 4th occurance of i with the index of formula.
		System.out.println(s.charAt(25));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("Cypress")); //-1
		
		String test= "     Selenium      ";
		test = test.trim();
		System.out.println(test);
		
		//replace
		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));
		String s2 = "this is mt java code";
		System.out.println(s2.toUpperCase());
		
		//substring
		
		String mg = "your username is: Naveen";
		System.out.println(mg.substring(18));
		System.out.println(mg.substring(0, 16)); // this will print values from 0 15 only 
		System.out.println(mg.substring(mg.indexOf(":")+2, mg.length()));
		
		//contains
		String g = "your username is: Naveen";
		System.out.println(g.contains("Naveen"));
		
		//equals:
		String p1 = "Hello Selenium";
		String p2 = "Hello selenium";
		System.out.println(p1.equals(p2));
		System.out.println(p1.equalsIgnoreCase(p2));
		
		//split
		String lang = "java_python_ruby_javascript";
		String l[] = lang.split("_");
		System.out.println(Arrays.toString(l));
		
		String k = "xXtestingXxXSeleniumXXxXAutomationxXXCypress";
		
		String k1[] = k.split("xX");
		System.out.println(Arrays.toString(k1));
		
		String m = "your username is naveen";
		String m1= m.split("is")[1].trim();
		System.out.println(m1);
		
		String empdata = "meera|Automation|Pune|India|323232|SDET|123.33";
		//String e[] = empdata.split("|"); // |is being used as a regular expression
		String e[] = empdata.split("\\|");
		System.out.println(e[0]);
		
		// output:->I love "java" and I am so happy
		String d1= "I love \"java\" and I am so happy";
		System.out.println(d1);
		createXpath ("Waseem");
		

	}
	
	public static void createXpath(String empName) {
		String xapth = "//a[text()='"+empName+"']";
		System.out.println(xapth);
	}

}
