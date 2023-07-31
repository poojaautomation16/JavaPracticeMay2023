import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "The rains have started here";
		String s1[] = s.split(" ");
		int len = s1.length;
		//below line will give you first string"
		String a1 = s1[0] ;
		System.out.println(a1);
		String rev = "";
		for (int i=len-1 ; i>=0; i--) {
			rev= rev+ s1[i]+ " ";	
		}
		System.out.println(rev);
		
//		String a = "  This is my java code and i'm so Happy  ";
//		int length = s.length();
//		System.out.println(length);
//		System.out.println(s.indexOf('s'));
//		System.out.println(s.indexOf('s', s.indexOf('s')+1));
//		//System.out.println(a.charAt(-1));
//		System.out.println(a.indexOf('m'));
//		System.out.println(a.indexOf('m', a.indexOf('m')+1));
//		System.out.println(a.indexOf("python")); //-1
//		//String Comparison
//		System.out.println(a.toLowerCase());
//		System.out.println(a.trim());
//		//System.out.println(a.replace(" ", ""));
		
		String lang = "Java_python_javaScript_Ruby";
		String [] langArray = lang.split("_");
		System.out.println(langArray[0]);
		System.out.println(langArray[3]);
		System.out.println(Arrays.toString(langArray));
		for (String e: langArray) {
			System.out.print(e + " " );
		}
		System.out.println();
		
		String pool = "xXTestingXxXxXseleniumxXXpythonxXAutomationXxX";
		String []poolArray = pool.split("xX");
		System.out.println(Arrays.toString(poolArray));
		System.out.println(poolArray.length);
		
		
		

	}

}
