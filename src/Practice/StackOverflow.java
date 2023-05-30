package Practice;

public class StackOverflow {

	public void m1() {
		System.out.println("calling M1: ");
		m2();
	}
	
	public void m2() {
		System.out.println("calling M2: ");
		m3();
	}
	
	public void m3() {
		System.out.println("calling M3: ");
		m4();
	}
	
	public void m4() {
		System.out.println("calling M4: ");
		// if m4 call m1, it will be stackOverflow
		m1();
	}
	
	public static void main(String[] args) {
		StackOverflow so = new StackOverflow();
		so.m1();
		
		
	}
}
