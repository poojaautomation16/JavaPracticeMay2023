package OOP_AbstractClass;

public abstract class Page {
	
	//cannot create object of abstract class
	//we can create constructor of the abstract class
	//this constructor will be called when we create the object of child class.
	public Page() {
		this(5);
		System.out.println("Page default constructor");
	}
	//we can call this constructor with the help of this keyword
	public Page(int i) {
		System.out.println("Page constructor" + i);
	} 
	public abstract void title ();
	public abstract void url ();
	
	public void defaultPageTimeOut() {
		System.out.println("Page time out = 20 sec ");
	}
	//made this method static to prevent overriding
	public static void displayFooter() {
		System.out.println("page--- displayfooter ");
	}
	
	//made this method final to prevent overriding
		public final void displaylogo() {
			System.out.println("page--- DisplayLogo ");
		}

}
