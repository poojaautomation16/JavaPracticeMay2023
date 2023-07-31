package StringConcept;

public class StringPractice {

	public static void main(String[] args) {
		String s= "testing"; // String Literals
		//String is collection/array of character
		String s1 = new String ("testing");// String Objects
	    String s2 = "testing";
	    System.out.println(s==s2); //true
	    System.out.println(s==s1); //false
	    System.out.println(s1==s2); //false
	    System.out.println(s.equals(s2)); //true
	    System.out.println(s.equals(s1)); //true
	    
	    String t1="Selenium";
	    String t2 = new String ("Selenium");
	    t2.intern(); //it will create same value inside constant pool as well.
	    
	    String z= "testing";
	  z = z.concat("Automation");// this method will create a new value "TestingAutomation" but will not change the value of z.
	    System.out.println(z); //this will give "testing" as strings are immutable existing sting z ill notchnage.
	    //System.out.println(z1);
	    
	    String r = "      Cypress       ";
	    System.out.println(r.trim());//this will create a new String without space and original value of r will remain "      Cypress       ".
	
	    System.out.println(r);
	    //String Buffer and String Builder
	    
	    StringBuilder sb = new StringBuilder("Naveen");
	    sb.append("Automation");
	    System.out.println(sb);
	    
	    
	    
	    
	    

	}

}
