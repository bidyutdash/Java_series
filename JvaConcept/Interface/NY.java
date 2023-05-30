package Interface;

public class NY implements NYU{
	
	String hospitalName = NYU.hospitalName;
	int pageLoadTime = 20;
	
	@Override
	public void getFoo() {
	}
	
	

	@Override
	public void basicRoles() {
		System.out.println("Must be a covid camp");
	}

	@Override
	public void foo(String name) {
		System.out.println("Name is " + name);
		
	}

	@Override
	public void foo(int age) {
		System.out.println("age is : " + age);
		
	}

}
