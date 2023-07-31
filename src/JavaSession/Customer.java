package JavaSession;

import java.util.ArrayList;

public class Customer {

	public ArrayList<String> doSearch(String categoryName) {
		System.out.println("Searching the product:: " +categoryName);
		ArrayList<String> prodList = new ArrayList<String>();
		switch (categoryName) {
		case "Apple":
			prodList.add("iphone 12");
			prodList.add("macbook pro");
			prodList.add("Ipad Mini");
			break;
        case "Samsung":
        	prodList.add("washer");
			prodList.add("dryer");
			prodList.add("tablet");
			break;
        case "HP":
        	prodList.add("Headphone");
			prodList.add("Laptop");
			prodList.add("desktop");
			break;

		default:
			System.out.println("Product category  not found:  "+categoryName );
			break;
		}
		return prodList;
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		ArrayList<String> appleList = c1.doSearch("Apple");
		System.out.println("Total number of apple product is::"+ appleList.size());
		System.out.println("All the apple products are"+ appleList);
		
		ArrayList<String> samsungList = c1.doSearch("Samsung");
		System.out.println("Total number of Samsung product is::"+ samsungList.size());
		System.out.println("All the Samsung products are: "+ samsungList);
		
		
		ArrayList<String> list = c1.doSearch("dell");
		System.out.println(list);
	}

}
