package Interface;


public interface NYU extends WHO{
	int pageLoadTime = 10;
	String hospitalName ="NYU";
	
	public void foo(String name);	
	
	public void foo(int age);
	
	
	
	// we can declare method with body 
	public static void getData() {
		System.out.println("Static method in interface");
	}
	
	
	default void getFoo() {
		System.out.println("default method..");
	}

}
