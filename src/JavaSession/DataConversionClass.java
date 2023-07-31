package JavaSession;

public class DataConversionClass {
// data conversion will happen with the help of wrapper class. 
	// wrapper classes- Interger Double ( when you want to convert s
	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		//String to Integer convrsion
		System.out.println(Integer.parseInt(x)+20);
		String y ="100A";
		//System.out.println(Integer.parseInt(y));
		String t = "12.33";
		double d = Double.parseDouble(t);
		System.out.println(d);
		 int t1 = 100;
		 String.valueOf(t1);
		 System.out.println(String.valueOf(t1)+20);
		
	}

}
