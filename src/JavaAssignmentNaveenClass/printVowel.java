package JavaAssignmentNaveenClass;

public class printVowel {

	public static void main(String[] args) {
		
		for (int ch='a'; ch<='z'; ch++) {
			if ((char)ch=='a' ||(char)ch=='e'||(char)ch=='i'||(char)ch=='o'||(char)ch=='u') {
				System.out.println((char)ch);
			}
		}
		
		for(int i=1; i<=10; i++) {
			if (i%7!=0) {
			System.out.println(i);
			}
			else {
				System.out.println("bye , see you tomorrow");
				break;
			}
		}

	}

}
