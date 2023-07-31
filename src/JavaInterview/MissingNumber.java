package JavaInterview;

public class MissingNumber {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,7,8,9};
	int sum = 0;
		for(int i=0; i<=a.length-1 ; i++) {
			sum = sum+ a[i] ;
		}
		int n= a[a.length-1];
		int actualsum = n*(n+1)/2;
		System.out.println("Actual sum is: " +actualsum );
		 System.out.println("Missing num is: " + (actualsum-sum));
		

	}

}
