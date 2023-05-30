package Interface;

public class Test {

	public static void main(String[] args) {
		
		NY ny = new NY();
		ny.basicRoles();
		ny.foo("Bidyut");
		System.out.println(ny.hospitalName);
		System.out.println(ny.pageLoadTime);
		
		System.out.println(NYU.pageLoadTime);
		
		
		NYU.getData();
	
		
		

	}

}
