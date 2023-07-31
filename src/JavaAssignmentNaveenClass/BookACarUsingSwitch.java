package JavaAssignmentNaveenClass;

public class BookACarUsingSwitch {

	public static void main(String[] args) {
		String car = "Hello";
		switch (car) {
		case "Mini":
			System.out.println("Book mini");
			break;
		case "Sedan":
			System.out.println("Book Sedan");
			break;
		case "Suv":
			System.out.println("Book Suv");
			break;
		case "Premium":
			System.out.println("Book Premium");
			break;

		default:
			System.out.println("Please select a car type you want to book");
			break;
		}

	}

}
