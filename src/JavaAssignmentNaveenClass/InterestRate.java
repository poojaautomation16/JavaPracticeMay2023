package JavaAssignmentNaveenClass;

public class InterestRate {

	public static void main(String[] args) {
		String loanType = "auto";
		int salary = 36000;
		double interestRate;
		
		switch (loanType) {
		case "car":
			interestRate = 5;
			break;
		case "housing":
			if (salary>35000) {
				interestRate = 4;
			}
			else {
				System.out.println("Not applicable for Housing loan ");
				return;
			}
			break;
		case "personal":
			interestRate = 6;
			break;
		case "education":
			interestRate = 2.5;
			break;

		default:
			System.out.println("This loan type is not given: " + loanType);
			return;
		}
		System.out.println("Interest rate for " + loanType +" is: " + interestRate + "%");
	}

}
