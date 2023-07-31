
public class StringBufferAndStringBuilder {
	
	public static void main(String[] args) {
		
		//String Immmutabele
		String s = "Hello";
		System.out.println(s+"hi");
		System.out.println(s);
		StringBuffer s1 = new StringBuffer("Helloworld");
		System.out.println(s1);
		s1.append("123");
		System.out.println(s1);
		StringBuilder s2 = new StringBuilder("Helloworld");
		System.out.println(s2);
		s2.append("123");
		System.out.println(s2);
		
		
	}

}
