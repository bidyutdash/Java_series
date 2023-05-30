package Practice;

public class Encapsulation1 {

	public static void main(String[] args) {


		Encapsulation e = new Encapsulation();
		e.setAge(24);
		e.setName("TOM");
		e.setCity("Queens");
		
		System.out.println(e.getName()+ " " + e.getCity() + "  " + e.getAge());
		
		e.getMM("John", 22);

	}

}
