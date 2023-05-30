package inheritance;

public class HomePage extends LoginPage{
	
	
	@Override
	public void verifyUsersCurrentPage(String currenPage) {
		System.out.println("User is now on : " + currenPage);
		System.out.println("Verified is on " + currenPage);
	}
	
	public void verifyUserName() {
		System.out.println("Verufied username is displaying on the top for homepage.........");
	}
	
	public void  verifyLogo() {
		System.out.println("Verified company Logo for home page...");
	}
	
	public void verifyCurrentCountrySelected() {
		System.out.println("verified current country for homepage....");
	}
	
	public void verifyTopDeal() {
		System.out.println("Verified to deals.....");
	}
	
	public void verifyPremiumDeals() {
		System.out.println("Verified premium deals.....");
	}

}
