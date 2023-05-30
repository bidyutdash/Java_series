package Practice;

public class ArrayC {
	public static void main(String[]args) {
		
		String [] a = {"chrome","firefox","ie","safari","edge"};
		
		
		for(int i=0; i<a.length; i++) {		
			switch (a[i]) {
			case "chrome":
				System.out.println("Coming from " + a[i]);
				break;
			case "firefox":
				System.out.println("Coming from " + a[i]);
				break;
			case "ie":
				System.out.println("Coming from " + a[i]);
				if(a[i].equals("ie")) {
					System.out.println("deprecated");
				}
				break;
			case "safari":
				System.out.println("Coming from " + a[i]);
				break;
			case "edge":
				System.out.println("Coming from " + a[i]);
				break;

			default:
				System.out.println("Nothing match");
				break;
			}
		
		}
		
		
		
		
		
		
	}

}
