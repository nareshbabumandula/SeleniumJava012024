package com.casting;

public class Apollo extends Hospital{
	
	double registrationFee = 500;
	
	public void registration() {
		System.out.println("Registration facility should be available at Apollo hospitals");
	}
	
	public void canteen() {
		System.out.println("Canteen facility is available");
	}

	public static void main(String[] args) {
		
		// In upcasting we can access all the methods of parent class + overridden methods of parent class
		// In downcasting we can access all the methods of child class + unique methods of parent class
		Hospital hospital = new Apollo(); // upcasting or generalization
		hospital.registration(); // child 
		hospital.admission(); // parent
		hospital.emergency(); // parent
		System.out.println(hospital.registrationFee);
			
		Apollo apollo = (Apollo) hospital; // upcasting or specialization
		System.out.println(apollo.registrationFee);	
		apollo.registration();
		apollo.canteen();
		apollo.admission();
		apollo.emergency();
	}

}
