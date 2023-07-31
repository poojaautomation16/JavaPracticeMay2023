package JavaInterview;

public class SwapTwoIntWithoutUsingThirdVar {
	
	public static void main(String []s) {
	int x=18;
	int y = 7;
	
//	x= x+y; //23
//	y= x-y; //18
//	x= x-y ; //7
	
//	x= x*y; //56
//	y =x/y; //18
//	x= x/y; //7
	
	x = x^y;
	y = x^y;
	x= x^y;
	
	System.out.println("X is: " +x);
	System.out.println("Y is: " +y);
	
	}
}
