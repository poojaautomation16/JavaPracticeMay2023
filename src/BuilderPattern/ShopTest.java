package BuilderPattern;

public class ShopTest {

	public static void main(String[] args) {
		Shopping shop = new Shopping();
		//advantage of builder pattern every method is returning
		//current class object and we can call the method directly 
		//1.
		shop.login("naveen@gmail.com", "naveen123")
		.search("macBookPro")
		.doPayment("232424", 234)
		.generateOrder()
		.logout();
		
		//2.
				shop.login("naveen@gmail.com", "naveen123")
				.search("tshirt", 100)
				.addToCart("tshirt")
				.logout();
		
		

	}

}
