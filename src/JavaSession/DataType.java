package JavaSession;

public class DataType {

	public static void main(String[] args) {
		//size-1 byte and -128 to 127
		byte b = 10;
		b=30;
		System.out.println(b);
		
		//short size=2 byte/16 bits range::32768 to 32767
		short s1=  1234;
		System.out.println(s1);
		
		//int size 4bite/32 bit  range: -2147483648 to  -2147483647
		
		int i= 23450;
		int i1=-112128472;
		
		System.out.println(i);
		System.out.println(i1);
		
		//long size 8bite/64 bit  range: -9223372036854775808 to  9223372036854775807
		long po = 1000000201021L;
		System.out.println(po);
		
		//float
		float f1= 34.23f;
		float f2= (float) 45.34;
		System.out.println(f1);
		System.out.println(f2);
		
		//double size -8 byte 64 bits
		double d= 32434.12;
		
		//char
		//sigle digit value
		char a= '1';
		char b1= '%';
		char c1= 'e';
		System.out.println(a);
		System.out.println(b1);
		System.out.println(c1);
		
		//boolean : true /false
		//size:1 bit
		boolean flag = true;
		boolean flag1= false;
		
		System.out.println(flag);
		System.out.println(flag1);
		
		byte t=063;  //this is used as octal number. and java will print its decimal equivalent.
		System.out.println(t); //43
		
				
		
	}

}
