package cadieux;

import java.util.Scanner;

public class SchoolSystem {

	static Scanner scan = new Scanner(System.in);

	private static Student setRecordData() {
		Student s1 = new Student();
		
		String in;
		int in1;

		System.out.print("Please enter the Student Number: ");
		in1 = scan.nextInt();
		s1.setStudentNumber(in1);
		System.out.print("Please enter the Last Name: ");
		scan.nextLine();
		in = scan.nextLine();
		s1.setLastName(in);
		System.out.print("Please enter the First Name: ");
		in = scan.nextLine();
		s1.setFirtsName(in);
		System.out.print("Please enter the Middle Initials: ");
		in = scan.nextLine();
		s1.setMiddleInitials(in);
		System.out.print("Please enter the Grade: ");
		in1 = scan.nextInt();
		s1.setGrade(in1);
		System.out.print("Please enter the Phone Number: ");
		scan.nextLine();
		in = scan.nextLine();
		s1.setPhoneNumber(in);
		System.out.print("Please enter the E-Mail: ");
		in = scan.nextLine();
		s1.setEMail(in);
		System.out.print("Please enter the Street Address: ");
		in = scan.nextLine();
		s1.setStreetAddress(in);
		System.out.print("Please enter the City: ");
		in = scan.nextLine();
		s1.setCity(in);
		System.out.print("Please enter the Province: ");
		in = scan.nextLine();
		s1.setProvince(in);
		System.out.print("Please enter the PostalCode: ");
		in = scan.nextLine();
		s1.setPostalCode(in);
		
		return s1;
	}
	
	private static void displayRecord(Student s1) {
		
		System.out.println("Name: " + s1.getLastName() + " " +s1.getFirstName()+ " " +s1.getMiddleInitials()+ ". " + "\nStudent Number: " + s1.getStudentNumber() + "\tGrade: " + s1.getGrade()
						 + "\nPhone Number: " + s1.getPhoneNumber() + "\tE-Mail: " + s1.getEmail()
						 + "\nCity: " + s1.getCity() + "\tAddress: " + s1.getStreetAddress() + "\tProvince: " + s1.getProvince() + "\nPostalCode: " + s1.getPostalCode());
		
	}

	public static void main(String args[]) {

		
		boolean valInput = false;
		Student RecordLocation = null;
		while(valInput == false) {
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
				valInput = false;
			}
		}
	}
}
