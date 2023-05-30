package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodOveloading1 {
	public String name;
	public static String pwd;
	
	public void login() {
		System.out.println("Plz entter your user name & pwd....");
	}
	
	public static void login(String userName) {
		
	}
	
	public ArrayList<String> login(String userName, String pwd) {
		System.out.println("User Name: " + userName);
		System.out.println("Password : " + pwd);
		ArrayList<String> emp = new ArrayList<>(Arrays.asList("Tom" , "Peter", "David", "chris","John"));
		return emp;
	}

	public static void main(String[] args) {
		MethodOveloading1 mo = new MethodOveloading1();
		System.out.println(mo.login("test@user.com", "test123$"));
	}

}
