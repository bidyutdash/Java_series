package Practice;

public class Booking {
	static String companyName = "Booking.com";
	static String companyUrl = "https://www.booking.com";
	String state;
	String city;
	String hotelName;
	String checkInDate;
	String checkOutDate;
	int Days;
	int peoples;
	double cost;

	public static void main(String[] args) {
		
		Booking bk = new Booking();
		bk.state = "New York";
		bk.city = "Woodside";
		bk.hotelName = "The Queens Hotel";
		bk.checkInDate = "02/24/2023";
		bk.checkOutDate = "02/26/2023";
		bk.Days = 3;
		bk.peoples = 2;
		bk.cost = 550.50;
		System.out.println(Booking.companyName + "  " + Booking.companyUrl + " State:  " + bk.state + " City: "+ bk.city + " Hotel Name: "+ bk.hotelName + " Check IN: "+ bk.checkInDate + " Check-Out:  "+ bk.checkOutDate + " Number of days: "+ bk.Days + " Number of people: "+ bk.peoples + " Hotel Cost: "+ bk.cost);
		System.out.println("-----------------------------------------------------------");
		
		
		
		Booking bk1 = new Booking();
		bk1.state = "Florida";
		bk1.city = "Orlando";
		bk1.hotelName = "The hotel holiday In";
		bk1.checkInDate = "02/26/2023";
		bk1.checkOutDate = "02/28/2023";
		bk1.Days = 3;
		bk1.peoples = 4;
		bk1.cost = 1100.90;
		
		System.out.println(Booking.companyName + "  " + Booking.companyUrl + " State:  " + bk1.state + " City: "+ bk1.city + " Hotel Name: "+ bk1.hotelName + " Check IN: "+ bk1.checkInDate + " Check-Out:  "+ bk1.checkOutDate + " Number of days: "+ bk1.Days + " Number of people: "+ bk1.peoples + " Hotel Cost: "+ bk1.cost);

		
		
		//System.out.println(companyName);//this is not the right way, 
		System.out.println(Booking.companyName);
		
		
		//System.out.println(companyUrl); // this is not the right way
		System.out.println(Booking.companyUrl);
		
	
	}

}
