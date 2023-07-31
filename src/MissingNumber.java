
public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {1, 2,3, 4, 5,6,7,9,10};
		int sum =0;
		for (int i=0; i<a.length; i++) {
		sum = sum+ a[i];	
		}
            System.out.println("Sum of array is: " +sum);
       int  sumactual =0;
       for(int j=0; j<=10; j++){
    	   sumactual= sumactual +j;   
       }

       System.out.println("Sum of actual nubers is: " +sumactual);
         
       System.out.println ("Missing nubers is: " +(sumactual-sum));  
	
	}
}
