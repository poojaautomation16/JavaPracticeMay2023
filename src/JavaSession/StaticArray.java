package JavaSession;

public class StaticArray {

	public static void main(String[] args) {
		//We use static array when we have constant data.
		// total no of months 12, days 31
	
		int i=10;
		    i=20;
		    i=30;
		    System.out.println(i);
		   //array can store multiple values in single variable
		   // no primitive data
		  int k[] = new int[5] ; //array deceleration
		   int j[] = {1,2,3,4,5 }; //array deceleration
		   System.out.println(j); // it will give some memory address.
		   //static array have continuous memory allocation
		  
		 for (int i1=0; i1<j.length; i1++) {
		 System.out.println(j[i1]);
		 }
		 System.out.println("Highest Index is::"+ (j.length-1));
		 System.out.println("Lowest Index is::"+ (0));
		
		 //for each loop :enhanced for loop
		 for (int values: j) {
			 System.out.println(values);
		 }
		 
		 String lang[] = new String[]{"java","paython","JS","Ruby"};
		 for (int l=0; l<lang.length; l++) 
		 {
			System.out.println(l+":"+lang[l]); 
		 }
		 
		 
		 
		 
	}

}
