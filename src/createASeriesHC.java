
public class createASeriesHC {

	public static void main(String[] args) {
       int a=5; int b=3; int n=5;
       int x= (int) (a+ Math.pow(2, 0)*b);
       System.out.print(x + " ");
       for (int i=1; i<n; i++) {
    	  x= (int) (x+ Math.pow(2, i)*b);
    	  System.out.print(x + " ");
       }
      
	}

}
