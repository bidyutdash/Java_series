package inheritance;

public class Car extends Vehicle{

	public void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}

	@Override
	public void pertorlEngine() {
		System.out.println("Car -- pertrol engine");
	}

	public void test(int i, String j) {

	}

}
