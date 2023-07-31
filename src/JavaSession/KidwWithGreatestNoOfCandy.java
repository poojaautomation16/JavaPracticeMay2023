package JavaSession;

import java.util.Arrays;

public class KidwWithGreatestNoOfCandy {

	public static void main(String[] args) {
		int a [] = {2,3,5,1,3};
		int n = a.length;
		boolean result[] = new boolean [5];
		int maxcacndy =3;
		int max = Integer.MIN_VALUE;
		
		for (int i=0; i<n; i++) {
			if (a[i]>max) {
				max= a[i];
			}
		}
		System.out.println("Largest Element is: " + max);
		for (int i=0; i<n; i++) {
			int j =a[i]+maxcacndy;
			if (j>=max) {
				result[i]= true;
			}
			else {
				result[i]= false;
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
