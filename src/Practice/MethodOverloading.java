package Practice;

public class MethodOverloading {
	
	
	public void getData() {
		int i = 10;
		int j = 20;
		int sum = i + j;
		System.out.println(sum);
	}
	
	public void getData(int i) {
		int j = 10;
		int sum = i + j;
		System.out.println(sum);
	}
	
	public void getData(int i, int j) {
		int sum = i + j;
		System.out.println(sum);
	}
	
	public void getData(String name) {
		System.out.println(name);
	}
	
	public void getData(String name, int age) {
		System.out.println("Name: "+name + " & age is : " + age);
	}
	
	public void getData(int age , String name) {
		System.out.println("Name: "+name + " & age is : " + age);
	}
	
	public String getData(String name, int age, String city) {
		String info = "name : " + name + " Age :  " + age + " City : " + city;
		return info;
		
	}
	

	public static void main(String[] args) {
		MethodOverloading ml = new MethodOverloading();
		ml.getData(30, "TOM");

	}
	

}
