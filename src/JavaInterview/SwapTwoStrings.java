package JavaInterview;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String a= "Hello";
		String b= "World";
		System.out.println("Value of a is: " +a);
		System.out.println("Value of b is: " +b);
		//1. Concatenate both the string and store it in a
		a= a+b; //helloworld
		
		//2. store the value of hello in b
		b= a.substring(0, a.length()-b.length());
		//3. store intial string b in a
		
		a= a.substring(b.length());
		
		System.out.println("Value of a is: " +a);
		System.out.println("Value of b is: " +b);

	}

}
