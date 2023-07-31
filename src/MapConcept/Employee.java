package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	public static void main(String[] args) {
		Map<String, String> emp = new HashMap<String, String>();
		
		emp.put("A", "Tom");
		emp.put("B", "Nikhil");
		emp.put("C", "Robert");
		System.out.println(emp.get("A"));
		emp.forEach((p,q)-> System.out.println(p +" :"+ q));
		
		Map<String, Integer> emp1 = new HashMap<String, Integer>();
		emp1.put("tom", 100);
		emp1.put("peter", 200);
		emp1.put("Peter", 300);
		emp1.put("Naveen", 400);
		emp1.put("Null", 400);
		emp1.put("Null", 500);
		
		emp1.forEach((k,v)-> System.out.println(k + ":" + v));
		
		System.out.println(emp1.get("Naveen"));
		System.out.println(emp1.get("Null"));
		
		//how to traverse entire hasgmap
		

	}

}
