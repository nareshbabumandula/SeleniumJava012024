package program2;

public class Icicibank extends Bank {

	public static void main(String[] args) {
		Icicibank i=new Icicibank();
		Bank b  =new Icicibank();
		b.login();
		b.Accountopeningdate();
		b.Accounttype();
		b.userdetails();
		b.Accountclosingdate();
		b.logoff();
		b.display();
		i.Internetbanking();
}

	@Override
	void login() {
		System.out.println("User is able to login banking page");
		
	}

	@Override
	void Accountopeningdate() {
		System.out.println("Mention the account opening date");
		
	}

	@Override
	void Accounttype() {
		System.out.println("Mention the Type of account ");
		
	}

	@Override
	void userdetails() {
		System.out.println("Provide the basic details of the customer ");
		
	}

	@Override
	void Accountclosingdate() {
		System.out.println("Mention the account closing date");
		
	}

	@Override
	void logoff() {
		System.out.println("logging off the page");
		
	}
	void Internetbanking() {
		System.out.println("Internet banking is available");
	}
   
}
