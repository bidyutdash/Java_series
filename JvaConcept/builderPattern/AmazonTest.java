package builderPattern;

public class AmazonTest {

	public static void main(String[] args) {
		AmazonPage am = new AmazonPage();
		
		
		am.getLogin()
		 	.clickOnLogin()
		 			.veriTitle()
		 				.signOut();
		
		
		am
			.getLogin()
					.signOut();
		
		
		
		am
			.clickOnLogin()
					.signOut();
		

	}

}
