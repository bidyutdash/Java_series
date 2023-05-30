package inheritance;

public class LoginPage extends User{
	

	@Override
	public void getUser() {
		System.out.println("Logging in.........");
	}
	
	public void verifyUserValid(String username) {
		System.out.println("Verifying the user is valid or not !!");
		System.out.println("User is valid. User Name is " + username);
		System.out.println("password is verified....");
	}
	
	public void verifyUsersCurrentPage(String currenPage) {
		System.out.println("Verified user is on " + currenPage);
	}
}
