package JavaSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		int i[] = {10, 20, 30, 40, 50};// array literals
        System.out.println(i); //out of this will some garbage value [I@626b2d4a
        System.out.println(Arrays.toString(i));//[10, 20, 30, 40, 50]
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("java","python","JS","c++"));
        System.out.println(names);
        
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D", "F"));
        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D", "E"));
        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","D", "E"));
        Collections.sort(l3);
        System.out.println(l1.equals(l2));
        System.out.println(l2.equals(l3));
        l1.removeAll(l2);
        System.out.println(l2);
        System.out.println(l1);
        
        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java","python","JS","c++", ".net"));
        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java","python","html","c++", ".net"));
        lang1.retainAll(lang2);
        System.out.println(lang1);
        lang1.addAll(lang2);
        System.out.println(lang1);
        lang1.add(0, "c");
        System.out.println(lang1);
        
        
        
	}

}
