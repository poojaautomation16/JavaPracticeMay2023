package DataConversion;

public class DataConversion {

	public static void main(String[] args) {
		String x="100";
		//System.out.println(Integer.valueOf(x)+20);
		//String to int using wrapper Class
		//int i = Integer.valueOf(x);
		int i = Integer.parseInt(x);
		System.out.println("new value of x is: " +i );
		//String to double
		Double.parseDouble(x);
		System.out.println("new double value of x is: " + Double.parseDouble(x) );
        //String to boolean:
		String headless= "true";
		boolean b= Boolean.parseBoolean(headless);
		
	}

}
