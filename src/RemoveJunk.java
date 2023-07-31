
public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "$%^&*pooja Agrawal 467";
		String s1 =" $^&$&* testing )((^& Selenium @#$%^& java))";
		
	//	use regular expression [^a-zA-Z0-9]
String s2= s.replaceAll("[^a-zA-Z0-9]", "");
		s= s.replaceAll("[^a-zA-Z0-9]", "");
       //  System.out.println (s);
         s1= s1.replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println (s1);
        // System.out.println (s2);
         
         int num = 123456; //54321
         int rev =0;
         while (num!=0) {
        	rev= rev*10+ num%10;
        	num= num/10;
        	}
         System.out.println("reverse number is: "+ rev);
         int num1 = 123456;
         StringBuffer sf = new StringBuffer(String.valueOf(num1));  
         System.out.println(sf.reverse());
         
         int a[] = {1, 2, 3, 4,5, 6, 8};
         //find the missing number
         //sum= 1+2+3+4+5+6+7= 28 n*(n+1)/2 
       //sum= 1+2+3+4+5+7= 22
         //diff = 28-22=6  
	int len = a.length;
	int sum = 0;
	for (int i=0; i<len ; i++) {
		sum= sum+a[i];
	}
     System.out.println("sum of array is: "+sum );
     int lastValue = a[len-1];
     int totalSum = lastValue*(lastValue+1)/2;
     
     System.out.println("Missing Number is: "+ (totalSum-sum) );
   
	}
	

}
