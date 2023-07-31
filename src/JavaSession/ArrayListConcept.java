package JavaSession;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {
		//arraylist is a default class in java
		//need to create an object using new keyword.
		ArrayList ar = new ArrayList();
		ar.add("pooja");
		ar.add(25);
		ar.add("Florida");
		ar.add("USA");
		ar.add("Test Engg");
		System.out.println(ar.size());
		//Collections.sort(ar);
		System.out.println(ar);
		System.out.println(ar.get(0));
		//System.out.println(ar.get(4)); index out of bound exception
		ar.remove(3);
		System.out.println(ar.get(3));
		for (Object values: ar) {
			System.out.println(values);
		}
		
	}

}
