package JavaSession;

public class LargestElementInAnArray {
	
	public static int MinElements(int arr[]) {
		int n = arr.length;
		int minElement = Integer.MAX_VALUE;
		for (int i=0; i<n; i++) {	
		if (arr[i]<minElement) {
			minElement = arr[i];	
				}		
		}
		System.out.println("Smallest Element is " +  minElement );	
		return minElement;
	}
	
	public static int MaxElements(int arr[]) {
		int n = arr.length;
		int MaxElement = Integer.MIN_VALUE;
		for (int i=0; i<n; i++) {	
		if (arr[i]>MaxElement) {
			MaxElement = arr[i];	
				}		
		}
		System.out.println("Largest Element is " +  MaxElement );	
		return MaxElement;
	}

	public static void main(String[] args) {
		int a [] = {2, 3,6,8,4,1,9,7, 4, 8,10, 10};
		MinElements (a);
		MaxElements (a);
		int max1=a[0];
		int max2= a[0];
		int n = a.length;
		
		for (int i=1; i<n; i++) {
			if (a[i]>=max1) {
				max2=max1;
				max1=a[i];
			}
			else if (a[i]>=max2)
			{
				max2=a[i];
			}
		}
		System.out.println("Max Number is: " +max1);
		System.out.println("2nd Max number is: " +max2);
	}
}
