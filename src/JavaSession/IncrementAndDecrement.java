package JavaSession;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int g = -99;
		int h = g++;
		System.out.println(g);//-98
		System.out.println(h);//-99
		
		//2. pre increment
		int c= 1;
		int d= ++c;
		System.out.println(c);//2
		System.out.println(d);//2
		
		int m=-97;
		int n=++m;
		System.out.println(m);//-96
		System.out.println(n); //-96
		
		//3. post decrement
		
		int a1=1;
		int b1=a1--;
		System.out.println(a1);//0
		System.out.println(b1);//1

		//3. pre decrement
		
				int a2=1;
				int b2=--a2;
				System.out.println(a2);//0
				System.out.println(b2);//0

		
		
	}

}
