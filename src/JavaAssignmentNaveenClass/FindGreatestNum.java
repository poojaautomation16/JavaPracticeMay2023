package JavaAssignmentNaveenClass;

public class FindGreatestNum {

	public static void main(String[] args) {
		int n1=102, n2=98, n3=98, n4=97;
		if ( n1>= n2 && n1>=n3 && n1>=n4) {
			System.out.println("greatest no is: " + n1);
		}
		else if ( n2>=n3 && n2>=n4) {
			System.out.println("greatest no is: " + n2);
		}
		else if ( n3>=n4) {
			System.out.println("greatest no is: " + n3);
		}
		else {
			System.out.println("greatest no is: " + n4);
		}

	}

}
