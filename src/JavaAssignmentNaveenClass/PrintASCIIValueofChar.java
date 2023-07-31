package JavaAssignmentNaveenClass;

public class PrintASCIIValueofChar {

	public static void main(String[] args) {
		
		
		for (int ch = '0'; ch<='9'; ch++) {
			System.out.print((char)ch + ":" +ch + " "  );
		}
		System.out.println();
		for (int ch2 = 'A'; ch2<='Z'; ch2++) {
			System.out.print((char)ch2 + ":" +ch2 + " " );
		}
		System.out.println();
		for (int ch1 = 'a'; ch1<='z'; ch1++) {
			System.out.print((char)ch1 + ":" +ch1+ " "  );
		}
		
		

	}

}
