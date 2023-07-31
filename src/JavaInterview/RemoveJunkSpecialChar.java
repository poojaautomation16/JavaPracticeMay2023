package JavaInterview;

public class RemoveJunkSpecialChar {

	public static void main(String[] args) {
		String s ="&^*&^(*pooja*(Agrawal";
		
		//regular expression [^a-zA-Z0-9]
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
