package cadieux;

import java.util.Scanner;

public class SchoolSystem {

	static Scanner scan = new Scanner(System.in);

	private static Student setRecordData() {
		Student s1 = new Student();


		System.out.print("Please enter the Student Number: ");
		s1.setStudentNumber();
		System.out.print("Please enter the Last Name: ");
		s1.setLastName();
		System.out.print("Please enter the First Name: ");
		s1.setFirtsName();
		System.out.print("Please enter the Middle Initials: ");
		s1.setMiddleInitials();
		System.out.print("Please enter the Grade: ");
		s1.setGrade();
		System.out.print("Please enter the Phone Number: ");
		s1.setPhoneNumber();
		System.out.print("Please enter the E-Mail: ");
		s1.setEMail();
		System.out.print("Please enter the Street Address: ");
		s1.setStreetAddress();
		System.out.print("Please enter the City: ");
		s1.setCity();
		System.out.print("Please enter the Province: ");
		s1.setProvince();
		System.out.print("Please enter the PostalCode: ");
		s1.setPostalCode();
		
		return s1;
	}
	
	private static void displayRecord(Student s1) {
		
		System.out.print("Name: " + s1.getLastName() + " " +s1.getMiddleInitials()+ " " + s1.getFirstName() + "\tStudent Number: " + s1.getStudentNumber() + "Grade: " + s1.getGrade()
						 + "\n\nPhone Number: " + s1.getPhoneNumber() + "\t\tE-Mail: " + s1.getEmail()
						 + "\nCity: " + s1.getCity() + "\tAddress: " + s1.getStreetAddress() + "\tProvince: " + s1.getProvince() + "\tPostalCode: " + s1.getPostalCode());
		
	}

	@SuppressWarnings("unused")
	public static void Main(String args[]) {

		
		boolean valInput = false;
		Student RecordLocation = null;
		while(valInput = false) {
			System.out.println("Welcome To The Schools File Managment System \nWould you like to:\nEnter A New Record\nPrint Record\nQuit");
			
			String input = scan.nextLine();

			if(input.equals("Enter A New Record")) {
				valInput = true;
				RecordLocation = setRecordData();
			}
			else if(input.equals("Print Record")) {
				valInput = true;
				displayRecord(RecordLocation);
			}
			else if(input.equals("Quit")) {
				return;
			}
			else {
				System.out.print("Please Enter the Input Correctly");

			}
			System.out.println("Do you want to do anything else?");
			input = scan.nextLine();
			if(input.equals("Yes")) {
				valInput = true;
			}
		}
	}
}
