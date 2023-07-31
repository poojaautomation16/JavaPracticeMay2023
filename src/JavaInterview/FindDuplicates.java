package JavaInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		String s[] = {"Java", "c", "c++", "Springboot", "Java", "c++", "Java"};
		int n = s.length;
		
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (s[i].equalsIgnoreCase(s[j])) {
					System.out.println("Duplicate element is: " + s[i]);
				}
			}
		}
		
		findDuplicateviaHashMap(s);
		findDuplicateViaSet(s);
	}
	
	public static void findDuplicateviaHashMap(String []s) {
		Map<String, Integer> dup = new HashMap<String, Integer> ();
		int len = s.length;
		for (int i=0; i<len; i++) {
			if (dup.containsKey(s[i])) {
				dup.put(s[i], dup.get(s[i])+1);
			}
			else {
				dup.put(s[i], 1);
			}	
		}
		System.out.println(dup);
		
	}
	
	public static void findDuplicateViaSet(String []s) {
		Set<String> dup = new HashSet<String> ();
		for (String lang: s) {
			if (dup.add(lang)==false) {
				System.out.println("Duplicate Element is: " + lang);
			}
		}		
	}

}
