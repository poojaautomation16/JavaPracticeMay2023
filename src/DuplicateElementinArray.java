import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementinArray {

	public static void main(String[] args) {
		String Name[] = {"Java","python","C++","Ruby","Java",".Net","C++","C",};
		
		for (int i=0 ; i<Name.length; i++) {
			for (int j=i+1; j<Name.length; j++) {
				if (Name[i].equals(Name[j])) {
					System.out.println("Duplicate Element is::"+ Name[i]);
				}
			}
		}

		System.out.println("***************************");
		 Set<String> dup = new HashSet<String>();
		 for (String names :Name) {
			 if (dup.add(names)==false) {
				 System.out.println("Duplicate Element is::"+names);
			 }
		 }
		
		 System.out.println("**********Hash Map Solution*************");
		 
		 Map<String, Integer> Duplicate = new HashMap<String, Integer>();
		 for (String dname : Name) {
			Integer count= Duplicate.get(dname);
			if (count==null) {
				Duplicate.put(dname, 1);
			}
			else {
				Duplicate.put(dname, ++count);
			}
		 }
		 System.out.println("Hash map is "+ Duplicate ); 
		 
	}

}
