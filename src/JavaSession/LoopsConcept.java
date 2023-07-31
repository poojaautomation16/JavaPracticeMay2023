package JavaSession;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		//while loop
		int i=10;
		while (i>=1) {
			System.out.println(i);
			//i++; ++i;
			i= i-1; // without this statement this will a infinite loop
		}
		
		int k=1;
		while(true) {
			System.out.println(k);
			k++;
			if(k==20) {
				break;
			}
		}
		// we always use while loop when you are not sure how many iteration you need.
		//example paginaton, you need to look for a value and you are not sure on which page it will be
		//carousel is naother one as you are not sure on which click you will get the item
		//Calendar picker/ date picker- when you have select future date. you are not sure how many times you have to click to select a date.
		//use case of infinite loop..billboard with message
		//facebook/linkedin app scrolling -lazy page loading
		System.out.println("**************for loop******************");
		//for loop
		//when we know number of cycles/iteration we can use for loop
		//total number of links images on page
		//drop down values
		//web-tables
		
		
		for (int j=1 ; j<=10; j++) {
			if(j%2==0) {
			System.out.println(j);
			}
		}
		//using double in for loop 
		for (double d=1.0 ; d<=10.0; d++) {
			if(d%2==1) {
			System.out.println(d);
			}
		}
		
		//using char in for loop
		
		for (char c='A' ; c<='Z'; c++) {
			System.out.println(c); // it will print A to Z on console.	
		}
		
		for (int c1=97 ; c1<=122; c1++) {
			System.out.println(c1);
			System.out.println((char)c1);// it will print ascii value on console.	
		}
		System.out.println("**********do while loop************");
		//custom wait 
		//element is displayed.
		int r=1;
		do {
			System.out.println(r);
			r++;
		} while (r<=10);
		
		for (int p=0; p<=9; p++) {
			for (int q=0; q<=9; q++) {
				System.out.print(p+""+q+" ");
			}
			System.out.println();
		}
		

	}

}
