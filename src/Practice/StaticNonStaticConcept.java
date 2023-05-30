package Practice;

public class StaticNonStaticConcept {

	public static void main(String[] args) {
		StaticNonStaticConcept ss = new StaticNonStaticConcept();
		StaticNonStaticConcept.m4();
		
	}
	
	// NS-----< S  (no obj need)
	// NS-----<NS  (no obj need)
	// s------<s   (no obj need)
	// S------<NS  (need obj )
	public void m() {
		System.out.println("Calling M: ");
		// calling static method from a non-static method
		StaticNonStaticConcept.m2();
	}
	
	public void m1() {
		System.out.println("Calling M1: ");
		m3();
	}
	
	public static void m2() {
		System.out.println("Calling M2: ");
		m4();
	}
	
	public void m3() {
		System.out.println("Calling M3: ");
	}
	
	public static void m4() {
		System.out.println("Calling M4: ");
		StaticNonStaticConcept dd = new StaticNonStaticConcept();
		dd.m5();
		
	}
	
	public void m5() {
		System.out.println("Calling M5: ");
	}
	
	public static void m6() {
		System.out.println("Calling M6: ");
	}

}
