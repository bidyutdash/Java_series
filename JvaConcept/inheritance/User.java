package inheritance;

public class User {
	
	String username;
	String password; 
	
	public void getUser() {
		System.out.println("Sending User Name : " + username);
		System.out.println("Sending Password : " + password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
