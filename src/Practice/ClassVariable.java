package Practice;

public class ClassVariable {
	String name;
	int  age;
	String city;
	

	public static void main(String[] args) {
		
		ClassVariable cv = new ClassVariable();
		cv.name = "Tom";
		cv.age = 20;
		cv.city = "NY";
		System.out.println(cv.name + " : " + cv.age + " : " + cv.city);
		
		
		ClassVariable cv_1 = new ClassVariable();
		cv_1.name = "Peter";
		cv_1.age = 21;
		cv_1.city = "NJ";
		System.out.println(cv_1.name + " : " + cv_1.age + " : " + cv_1.city);
		
		
		
		ClassVariable cv_2 = new ClassVariable();
		cv_2.name = "david";
		cv_2.age = 22;
		cv_2.city = "LA";
		System.out.println(cv_2.name + " : " + cv_2.age + " : " + cv_2.city);
		
		
		ClassVariable cv_3 = new ClassVariable();
		cv_3.name = "Chris";
		cv_3.age = 22;
		cv_3.city = "PA";
		System.out.println(cv_3.name + " : " + cv_3.age + " : " + cv_3.city);
		System.out.println("-----------------------------------------------");
		
		cv = cv_1;
		System.out.println(cv.name + " : " + cv.age + " : " + cv.city);
		System.out.println(cv_1.name + " : " + cv_1.age + " : " + cv_1.city);
		System.out.println(cv_2.name + " : " + cv_2.age + " : " + cv_2.city);
		System.out.println(cv_3.name + " : " + cv_3.age + " : " + cv_3.city);
		
		System.out.println("-----------------------------------------------");
		cv_1=cv_2;
		System.out.println(cv.name + " : " + cv.age + " : " + cv.city);
		System.out.println(cv_1.name + " : " + cv_1.age + " : " + cv_1.city);
		System.out.println(cv_2.name + " : " + cv_2.age + " : " + cv_2.city);
		System.out.println(cv_3.name + " : " + cv_3.age + " : " + cv_3.city);
		
		System.out.println("-----------------------------------------------");
		cv_2=cv_3;
		System.out.println(cv.name + " : " + cv.age + " : " + cv.city);
		System.out.println(cv_1.name + " : " + cv_1.age + " : " + cv_1.city);
		System.out.println(cv_2.name + " : " + cv_2.age + " : " + cv_2.city);
		System.out.println(cv_3.name + " : " + cv_3.age + " : " + cv_3.city);
		
		
		
		
		
		
		
		
		

	}

}
