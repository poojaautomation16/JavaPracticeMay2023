
public class Test {
	
	public static void main(String[] args) {
		String sn= "Thisdfgdddfhd is UI Automation";
		String s[]= sn.split(" ");
		int length = s.length;
		String longestString =getLength(s);
		System.out.println("Longest String is: " +longestString );
		
		String[] d = {"sun", "moon", "earth" , "water", "moon"};
		int len = d.length;
		 for (int i=0; i<len ;i++) {
			 for (int j=i+1; j<len ; j++) {
				if (d[i].equalsIgnoreCase(d[j])) {
					System.out.println("Duplicate String is: " + d[i]);
				}
				 
			 }
		 }
		
		}
	

	public static String getLength(String [] s) {
		int index=0;
		int element = s[0].length();
		for (int i=1; i<s.length ; i++) {
				if(s[i].length()>element) {
					index=i;
					element = s[i].length();		
				}	
			}
		return s[index];
	}
	


}
