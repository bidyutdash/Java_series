package javasessions;

public class Constructors {

	String name;
	String dob;
	String city;
	int age;

	public Constructors(String name, String dob, String city) {
		this.name = name;
		this.dob = dob;
		this.city = city;
	}

	public Constructors(String name) {
		this.name = name;
	}

	public Constructors(String name, String dob, String city, int age) {
		this.name = name;
		this.dob = dob;
		this.city = city;
		this.age = age;
	}
	
	// When we do not create any constructor , Java compiler will create a default constructor for us
	// Constructors name should be same as class name
	// Constructor can not have any return type
	// We can overload a constructor
	// when we will create object , constructor will be called
	
	
	
	public void getInfo(Constructors obj) {
		obj.name = "Dash";
		//Constructors c = new Constructors("Dash");
		System.out.println("****" + obj.name);
	}
	
	
	
	public static void main(String[] args) {
		
		Constructors con = new Constructors("TOM");
		System.out.println(con.name);
		con.name = "Peter";
		System.out.println(con.name);
		
		Constructors con1 = new Constructors("John", "01/01/1995", "Woodside");
		System.out.println(con1.name + " " + con1.dob + " " + con1.city);
		
		Constructors con2 = new Constructors("David", "12/12/1994", "Queens", 22 );
		System.out.println(con2.name + " " + con2.dob + " " + con2.city + " " + con2.age);
		
		Constructors con3 = new Constructors("Jony", "12/12/1998", "Astoria", 25 );
		System.out.println(con3.name + " " + con3.dob + " " + con3.city + " " + con3.age);
		
		
		// calling by reference
		con3.getInfo(con3);
		
		// calling from constructors1
		Constructors1 v = new Constructors1();
		v.getM();
		Constructors1.getM("Tom");
		
		
	}

}
