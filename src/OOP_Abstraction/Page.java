package OOP_Abstraction;
// we can not create object of the abstract class.
//we can create constructor of the abstract class and it will be called when we create object of the child class
public abstract class Page {
	
	public Page () {
		System.out.println("*****Default Constructor****");
	}
	
	public Page (int i) {
		System.out.println("*****parametrize Constructor****");
	}

           public abstract void title();
           public abstract void url();
           public void header () {
        	   System.out.println("Page Header");
           }
           
           public final void logo () {
        	   System.out.println("Page logo");
           }
	

	

}
