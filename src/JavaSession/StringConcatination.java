package JavaSession;

public class StringConcatination {

	public static void main(String[] args) {
		
		String s = "Hello world";
		String s1= "100";
		String ph="9417798713";
		//String is collaction of multiple character.
		
		String x= "Hello";
		String y= "world";
		
		int a= 100;
		int b=200;
		System.out.println(a+b);
		System.out.println(x+y); // concat operator
        System.out.println(a+x);
        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        
        char c1= 'a';
        char c2='b';
        System.out.println(c1+c2); // result will be 195
        System.out.println(c1+""+c2); //result will be ab
        
        byte b1 = 120;
        byte b2= 80;
        byte b3= (byte) (b1+b2);
        System.out.println(b3);    //-56
        int b4=  b1+b2;
        System.out.println(b4); //200
        
        int g= 10;
        int h= 2;
        int h1=3;
        System.out.println(g/h); //5
        System.out.println(g/h1); //3
        
     //   System.out.println(9/0); // arithmatic exception
        System.out.println(0/9);  //0
      //  System.out.println(0/0); //arithmatic exception
        System.out.println(0.0/0); //NaN
        System.out.println(0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(5/0.0); // infinity
        System.out.println(5.0/0.0); // infinity 
        
        char t= 'a';
        System.out.println(t); //a
        System.out.println((int)t); //97
        char t1= 'z';
        System.out.println(t1); //z
        System.out.println((int)t1); //122
        
        String name = "Selenium Webdriver"; 
        boolean status= name.startsWith("selenium");
        
	}

}
