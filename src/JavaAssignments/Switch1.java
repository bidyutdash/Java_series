package JavaAssignments;

public class Switch1 {

	public static void main(String[] args) {
		
		// WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		
		char isItVowel = 'd';
		
		switch (isItVowel) {
		case 'a':
			System.out.println(isItVowel + " is a vowel.");
			break;
			
		case 'e':
			System.out.println(isItVowel + " is a vowel.");
			break;
			
		case 'i':
			System.out.println(isItVowel + " is a vowel.");
			break;
			
		case 'o':
			System.out.println(isItVowel + " is a vowel.");
			break;
			
		case 'u':
			System.out.println(isItVowel + " is a vowel.");
			break;

		default:
			System.out.println(isItVowel + " is a consonent.");
			break;
		}
		
		
		// WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		
		String env = "DEV";
		
		switch (env.toLowerCase().trim()) {
		case "qa":
			System.out.println("Test run on QA environment.........");
			break;
			
		case "staging":
			System.out.println("Test run on staging environment.........");
			break;
			
		case "dev":
			System.out.println("Test run on dev environment.........");
			break;
			
		case "uat":
			System.out.println("Test run on uat environment.........");
			break;

		default:
			System.out.println("please pass the correct environment..........!");
			break;
		}
		
		/**
		 * WAP to book the specific type of car from the Uber app using Switch - Case. 
		 * Car Type: Mini, Sedan, SUV, Premium 
		 * If user passes wrong car type, print please select the right car type
		 */
		
		String carName = "SUV";
		
		switch (carName.toLowerCase().trim()) {
		case "mini":
			System.out.println("Your car booking is confirmed...A " + carName + " car on the way to pick you up------>");
			break;
			
		case "sedan":
			System.out.println("Your car booking is confirmed...A " + carName + " car on the way to pick you up------>");
			break;
			
		case "suv":
			System.out.println("Your car booking is confirmed...A " + carName + " car on the way to pick you upy------>");
			break;
			
		case "premium":
			System.out.println("Your car booking is confirmed...A " + carName + " car on the way to pick you up------>");
			break;

		default:
			System.out.println("please select the right car!!");
			break;
		}
		
		/**
		 * WAP to launch browsers using If-ElseIf and Switch Case.
		 * Browser: Chrome/Firefox/IE/Safari
		 * If user passes wrong browser, print please pass the right browser name
		 */
		
		String browser = "IE".toLowerCase();
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome browser....");
		}
		else if (browser.endsWith("firefox")){
			System.out.println("launch firefox browser.....");
		}
		else if(browser.endsWith("ie")) {
			System.out.println("launch ie browser.....");
		}
		else if(browser.endsWith("safari")) {
			System.out.println("launch safari browser....");
		}
		else {
			System.out.println("please pass the right browser name");
		}
		
		
		/**
		 * WAP to define the interest rate on the basis of Loan type using Switch Case
		 * Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		 * For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		 */
		
		String loanType = "housing loan".toLowerCase();
		int usersSalary = 100000;
		
		switch (loanType) {
		case "car loan":
			System.out.println("APPLICABLE FOR "+ loanType +" , Interest Rate is 17%.");
			break;
			
		case "housing loan":
			if(usersSalary<35000) {
				System.out.println("NOT APPLICABLE FOR housing loan....! Salary should be more than 35000!");
			} 
			else {
				System.out.println("APPLICABLE FOR "+ loanType +" , Interest Rate is 7.5%.");
			}
			break;
			
		case "personal loan":
			System.out.println("APPLICABLE FOR "+ loanType +" , Interest Rate is 14%.");
			break;
			
		case "education loan":
			System.out.println("APPLICABLE FOR "+ loanType +" , Interest Rate is 17%.");
			break;

		default:
			System.out.println("pass the correct loan type");
			break;
		}

	}

}
