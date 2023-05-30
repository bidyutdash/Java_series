package Practice;

public class StaticNonStatic {

	public static void main(String[] args) {
		System.out.println("Main Method: ");
		StaticNonStatic st = new StaticNonStatic();
		getData();
		st.getData3();
		
		

	}
	
	public static void getData() {
		System.out.println("Method getData : ");
		StaticNonStatic.getData1();
		
	}
	
	public static void getData1() {
		System.out.println("Method getData_1 : ");
		StaticNonStatic t1 = new StaticNonStatic();
		t1.getData2();
		
	}
	
	public void getData2() {
		System.out.println("Method getData_2 : ");
	    getData3();
	}
	
	public void getData3() {
		System.out.println("Method getData_3 : ");
		getData();
	}

}
