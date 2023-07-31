package JavaAssignmentNaveenClass;

import java.util.ArrayList;

public class ReverseArray {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Varun");
		name.add("Reena");
		name.add("Naveen");
		name.add("Robin");
		name.add("Peter");
		ArrayList<String> newName = new ArrayList<>();
		int n = name.size();
		for (int i=n-1; i>=0; i--) {
			newName.add(name.get(i));	
		}
		System.out.println(newName);
		
		newName.clear();
		System.out.println(newName);
		name.trimToSize();
		System.out.println(name.size());
		

	}

}
