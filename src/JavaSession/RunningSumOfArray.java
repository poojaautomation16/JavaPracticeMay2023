package JavaSession;

public class RunningSumOfArray {

	public static void main(String[] args) {
		int arr[] = {2, 4,5,7,9,1,0};
		int sum[] = new int [7];
		sum[0]= arr[0];
		int n = arr.length;
		for (int i=1; i<n; i++) {
			sum[i] = arr[i]+sum[i-1];
			System.out.print(sum[i] + " ");
		}
		

	}

}
