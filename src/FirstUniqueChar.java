import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstUniqueChar {

	public static int firstUniqChar(String s) {
	    L: for (int i = 0, length = s.length(); i < length; i++) {
	        for (int j = 0; j < length; j++)
	            if (i != j && s.charAt(i) == s.charAt(j))
	                continue L;
	        return i;
	    }
	    return -1;
	}
	
	public static int firstUniqe(String s) {
	 Map <Character, Integer> map = new  HashMap <Character, Integer>();
	 int n = s.length();
	 for (int i=0; i<n; i++) {
		 char c= s.charAt(i);
		 if (map.containsKey(c)) {
			map.put(c, map.get(c)+1); 
		 }
		 else {
			 map.put(c, 1);
		 }
	 }
	 for (int i=0; i<n; i++) {
		 if (map.get(s.charAt(i))==1)
			 return i;
	 }
	 return -1;
	  }


	public static void main(String[] args) {
		System.out.println(firstUniqChar("mmiinnddyyoouu"));
		System.out.println(firstUniqe("mminnddyyoouu"));
		System.out.println(firstUniqe("mimnnddyyoouu"));
		System.out.println(firstUniqe("HehlloWords"));
		System.out.println(firstUniqe("mmiinnddyyoouu"));
		
		

	}
}

	

