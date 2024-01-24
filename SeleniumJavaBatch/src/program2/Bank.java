package program2;

public abstract class Bank {

	public Bank() {
		System.out.println("Banking process in account opening");
	}
	
	abstract void login();
	abstract void Accountopeningdate();
	abstract void Accounttype();
	abstract void userdetails();
	abstract void Accountclosingdate();
	abstract void logoff();

    public void display() {
	System.out.println("displaying account details");
}
     public static void main(String[] args) {
	
}
}