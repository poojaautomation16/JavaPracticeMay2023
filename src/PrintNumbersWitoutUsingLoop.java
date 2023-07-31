import java.util.stream.IntStream;

public class PrintNumbersWitoutUsingLoop {

	public static void main(String[] args) {
		//print number without using loop
		//using recursive function
		// streams
		//printNumber(0, 100);
		IntStream.range(0, 100).forEach(e-> System.out.println(e));
		if (System.out.printf("Hello world" +"\n")==null) {}
		if(System.out.format("Hello world" +"\n")==null) {}

	}
	public static void printNumber(int stNum, int finalNum) {
		if (stNum<=finalNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, finalNum);
		}
	}
	

}
