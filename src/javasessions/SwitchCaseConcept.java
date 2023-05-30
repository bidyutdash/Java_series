package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
String browser = "ie";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
				if( 10 > 5) {
					System.out.println("10 is greater than 5");
				}
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "opera":
			System.out.println("launch opera");
		    break;	

		default:
			System.out.println("please pass the right browser.....");
			break;
		}	
		

	}

}
