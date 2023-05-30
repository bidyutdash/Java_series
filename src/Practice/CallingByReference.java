package Practice;

public class CallingByReference {
	String name;
	int age;

	public static void main(String[] args) {
		CallingByReference cc = new CallingByReference();
		// Calling by value:
		cc.getEmp(50, 120);
		
		// Calling by method
		cc.getEmp1();
		
		// Calling By reference
		cc.name = "TOM";
		cc.age = 22;
		System.out.println(cc.name + "  " + cc.age);
		
		
		cc.getEmp2(cc);
		System.out.println(cc.name + "  " + cc.age);
		
		
		cc.name = "Jerry";
		cc.age = 60;
		System.out.println(cc.name);
		System.out.println(cc.age);
		
		cc.getEmp2(cc);
		
		
		
		

	}

	public void getEmp(int a , int b) {
		System.out.println(a+b);
	}

	public void getEmp1() {
		System.out.println("Hello-------->");
	}

	public void getEmp2(CallingByReference obj) {
		obj.name = "John";
		obj.age = 28;
		System.out.println(name);
		System.out.println(age);
		
		obj.name = "Bidyut";
		obj.age = 16;
		System.out.println(name);
		System.out.println(age);	
		
	}

}
