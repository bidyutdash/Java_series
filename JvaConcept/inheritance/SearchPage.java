package inheritance;

public class SearchPage extends HomePage{
	
	@Override
	public void verifyLogo() {
		System.out.println("Verified logo for search page.....");
	}
	
	@Override
	public void verifyUserName() {
		System.out.println("Verified username is displaying on the top for searchpage.........");
	}
	
	
	@Override
	public void verifyUsersCurrentPage(String currenPage) {
		System.out.println("Verifying current page for Search page : Actual result: " + currenPage);
	}
	
	@Override
	public void verifyCurrentCountrySelected() {
		System.out.println("Verifying current country for Search page");
	}
	
	public void verifyLeftNavItems() {
		System.out.println("Veryfied left nav items for searchpage");
	}
	
	public void verifyFilter() {
		System.out.println("Verified filter working as expected for search page....");
	}
	
	

}
