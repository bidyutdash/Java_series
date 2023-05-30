package inheritance;

public class BMW extends Car{

	// Method Overridding: Poly + Morphism --> Run Time (Dynamic)
	// when you have a method in parent class and the same method in child class:
	// with the same name
	// with the same number of parameters
	// with the same sequence of parameters
	// with the same return

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	@Override
	public void pertorlEngine() {
		System.out.println("BMW -- pertrol engine");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	public void theftSafety() {
		System.out.println("BMW -- theftSafety");
	}

	public void test(String j, int i) {

	}

}
