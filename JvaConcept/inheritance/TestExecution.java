package inheritance;

public class TestExecution {

	public static void main(String[] args) {
		/**
		 * 1. navigate to the URL
		 * 2. Enter valid userName & password , verify
		 * 3. 
		 */
		
		User user = new User();
		user.setUsername("admin@rrtech.com");
		user.setPassword("rrtech0000%");
		user.getUser();
		System.out.println("-----------------------------------------------------------");
		
		LoginPage loginPage = new LoginPage();
		loginPage.getUser();
		loginPage.verifyUserValid(user.getUsername());
		loginPage.verifyUsersCurrentPage("Company Loginpage....");
		System.out.println("-----------------------------------------------------------");
		
		HomePage homePage = new HomePage();
		homePage.verifyLogo();
		homePage.verifyCurrentCountrySelected();
		homePage.verifyUserName();
		homePage.verifyUsersCurrentPage("Homepage");
		homePage.verifyUserValid(user.getUsername());
		homePage.verifyTopDeal();
		homePage.verifyPremiumDeals();
		homePage.verifyCurrentCountrySelected();
		
		System.out.println("-----------------------------------------------------------");
		SearchPage  searchPage = new SearchPage();
		searchPage.verifyCurrentCountrySelected();
		searchPage.verifyLogo();
		searchPage.verifyUserName();
		searchPage.verifyUsersCurrentPage("Search page");

	}

}
