package JavaInterview;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		int num[] = {-100, 24,500, -88, 65,88008, -908};
		int n = num.length;
		int smallest = num[0];
		int largest = num[0];
		
		for (int i=1; i<n; i++) {
			if (num[i]>largest) {
				largest= num[i];
			}
			else if(num[i]<smallest) {
				smallest =num[i];
			}
		}
		
		System.out.println("Smallest number is : " + smallest );
		System.out.println("Largest number is : " + largest);

	}

}
