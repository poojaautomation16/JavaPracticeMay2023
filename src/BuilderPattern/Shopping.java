package BuilderPattern;

public class Shopping {
	//when we are returning this keyword instead of void we should write current class object
	//we can also write it as return new Shopping(); but it will create a new object every time method will be called
	//to avoid multiple object creation we will use this keyword.
	//this means current class Object.
	public Shopping login() {
		System.out.println("User is logged in");
		return this;
		//return new Shopping();
	}
	
      public Shopping login(String un, String pwd) {
    	  System.out.println("Login with" + un + ":" + pwd);
    	  return this;
	}
      
      public Shopping search(String productName) {
    	  System.out.println("search product" + productName );
    	  return this;
	}
      
      public Shopping search(String productName, int price) {
    	  System.out.println("search product" + productName+ ":" + price );
    	  return this;
	}

      public Shopping addToCart(String productName) {
    	  System.out.println("Add To Cart" + productName );
    	  return this;
	}
      
      public Shopping doPayment(String cc, int cvv) {
    	  System.out.println("Make Payment" + cc + ":" + cvv);
    	  return this;
	}
      
      public Shopping generateOrder() {
    	  System.out.println("Generate order" + " 12345");
    	  return this;
	}
      
      public Shopping logout() {
    	  System.out.println("logout");
    	  return this;
	}

}
