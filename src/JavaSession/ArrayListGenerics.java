package JavaSession;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListGenerics {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(23);
		ar.add(1);
		ar.add(34);
		ar.add(23);
		ar.add(56);
		for (int num: ar) {
			System.out.println(num);	
		}
		Collections.sort(ar);
		System.out.println(ar);
		ArrayList<String> list = new ArrayList<String>();
		list.add("pooja");
		list.add("Manish");
		list.add("Vihaan");
		list.add("Ayansh");
		list.add("Vimla");
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(0));
		
	}

}
