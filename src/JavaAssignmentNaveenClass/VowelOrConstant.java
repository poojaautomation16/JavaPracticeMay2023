package JavaAssignmentNaveenClass;

public class VowelOrConstant {

	public static void main(String[] args) {
		char ch ='a';
		switch (ch) {
		case 'a' :
		case 'A':
		case 'e' :
		case 'E':
		case 'i' :
		case 'I':
		case 'o' :
		case 'O':
		case 'u' :
		case 'U':
		System.out.println("Char is a vowel: " + ch);	
			break;

		default:
			System.out.println("Char is a Constant: " + ch);	
			break;
		}
		
	}

}
