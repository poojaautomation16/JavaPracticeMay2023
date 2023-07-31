package JavaAssignmentNaveenClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteANumberFromAnArray {

	public static void main(String[] args) {
		int[] p = {1, 4,5,2,3,22,31,2};
		int n =p.length;
		int []a = new int [n-1];
		int j=0;
		for (int i=0; i<n; i++) {
			if (p[i]!=22) {
			a[j]=p[i];
			j++;
			}
		}
		System.out.println(Arrays.toString(a));
		
		Object [] cricket = new Object [6];
		cricket [0] = "salman";
		cricket [1] = "BangalTiger";
		cricket [2] = "24th June";
		cricket [3] = 'M';
		cricket [4] = 26;
		cricket [5] = 34.5;
		System.out.println(Arrays.toString(cricket));
		
		ArrayList<String> color = new ArrayList<>();
		color.add("red");
		color.add("Yellow");
		color.add("green");
		color.add("blue");
		color.add("purple");
		
//		for (String e: color) {
//			System.out.println(e);
//		}
		System.out.println(color.get(1));
		System.out.println(color.set(0, "peach"));
		System.out.println(color.get(0));
		//color.remove(3);
	for (String e: color) {
		if ( e.equals("blue")) {
			System.out.println(e);
			break;
		}
	}
      
	}

}
