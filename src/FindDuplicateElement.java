import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {
		String infra[] = {"amazon", "gcp", "azure", "amazon", "ali baba", "saucelab", "gcp","azure"};
		int l = infra.length;
		System.out.println("length of array is:" + l);
		System.out.println("***********Brute force*************");
		for (int i=0; i<l; i++) {
			for (int j=i+1; j<l; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}
		
		System.out.println("***********Hash set*************");
		Set<String> list = new HashSet<String>();
		for (String e: infra) {
			if(list.add(e)==false) {
				System.out.println(e);
			}
		}
		
		System.out.println("***********Hash map*************");
		Map<String, Integer> InfraMap = new HashMap<String, Integer>();
		for (String e: infra) {
			Integer count= InfraMap.get(e);
			if (count == null) {
				InfraMap.put(e, 1);
			}
			else {
				InfraMap.put(e, ++count);
			}
		}
		System.out.println(InfraMap);
	}

}
