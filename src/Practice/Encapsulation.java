package Practice;

public class Encapsulation {

	private String name;
	private String city;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void getMM(String name, int age) {
		getInfo(name, age);
	}
	
	private void getInfo(String name, int age) {
		System.out.println("Verifying name & the name is : "+ name);
		System.out.println("Verifying age & the age is : " + age);
	}

}
