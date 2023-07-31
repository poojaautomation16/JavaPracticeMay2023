package SuperKeyword;

public class Page {
   int timeout = 100;
    public Page() {   
    	System.out.println("Default Constructor");
    }
    public Page(int a) {   
    	System.out.println("Parametrised Constructor:" + a);
    }
    public Page(int a, int b) {   
    	System.out.println("Parametrised Constructor: " +a+" "+b);
    }
   
   public void display () {
	System.out.println("Page Display");  
   }
}
