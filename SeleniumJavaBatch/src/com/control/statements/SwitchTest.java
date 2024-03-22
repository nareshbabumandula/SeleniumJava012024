package com.control.statements;

public class SwitchTest {

	static void switchExample(String day) {

		switch (day.toLowerCase().trim()) {
		case "sun": case "sund":
			System.out.println("Sunday");
			break;
		case "mon":
			System.out.println("Monday");
			break;
		case "tue":
			System.out.println("Tuesday");
			break;
		case "wed":
			System.out.println("Wednesday");
			break;
		case "thu": 
			System.out.println("Thursay");
			break;
		case "fri":
			System.out.println("Friday");
			break;
		case "sat":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}


	}

	public static void main(String[] args) {
		switchExample("Thu");
		switchExample("sun");
		switchExample("sund");
		switchExample("tue");


	}

}
