package JavaSession;

public class Browser {
	
	String name;
	double version;
	String vendor;
	// call by reference example 
    public void getInfo(Browser br) {
    System.out.println(br.name +" " + br.vendor +" "+ br.version);	
    }

	public static void main(String[] args) {
		Browser br = new Browser();
		
		br.name ="chrome" ;
		br.vendor = "google";
		br.version = 91.1;
		br.getInfo(br);

	}

}
