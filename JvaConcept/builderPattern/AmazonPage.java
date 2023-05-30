package builderPattern;

public class AmazonPage {
	
	
	
	public AmazonPage getLogin() {
		System.out.println("userName sending-----");
		System.out.println("Password sending");
		return this;
	}
	
	public AmazonPage clickOnLogin() {
		System.out.println("Clicking on login button-----");
		return this;
	}
	
	
	public AmazonPage veriTitle() {
		System.out.println("Verifying title-----");
		return this;
	}
	
	public AmazonPage signOut() {
		System.out.println("Signing Out------");
		return this;
	}

}
