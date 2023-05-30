package Practice;

public class Constructor1 {

	String owner;
	String accountNumber;
	int zip;
	String city;
	double balance;

	public Constructor1(String owner, String accountNumber, int zip, String city, double balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.zip = zip;
		this.city = city;
		this.balance = balance;
	}

	public double deposit(double depositAmount) {
		balance = balance + depositAmount;
		return balance;
	}

	public double withdraw(double withdrawAmount) {
		balance = balance - withdrawAmount;
		return balance;
	}

	public static void main(String[] args) {
		Constructor1 con = new Constructor1("Jony", "89271", 11233, "Queens", 1500.2);

		System.out.println("Owner Name: " + con.owner + " / " + "Account Number: " + con.accountNumber + " / " + "Zip: "
				+ con.zip + " / " + "City Name: " + con.city + " / " + " Your current balance: " + con.balance);
		
		con.withdraw(120);
		System.out.println("Owner Name: " + con.owner + " / " + "Account Number: " + con.accountNumber + " / " + "Zip: "
				+ con.zip + " / " + "City Name: " + con.city + " / " + " Your current balance: " + con.balance);
		
		con.deposit(300);
		System.out.println("Owner Name: " + con.owner + " / " + "Account Number: " + con.accountNumber + " / " + "Zip: "
				+ con.zip + " / " + "City Name: " + con.city + " / " + " Your current balance: " + con.balance);
		

	}

}
