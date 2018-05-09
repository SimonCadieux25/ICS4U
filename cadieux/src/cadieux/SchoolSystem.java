package cadieux;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SchoolSystem {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Student> allStud = new ArrayList<Student>();

	public static void setRecordData() {

		String in, in1;
		int in2;

		System.out.print("Please enter the Students last name: ");
		in = scan.nextLine();
		System.out.print("Please enter the Students first name: ");
		in1 = scan.nextLine();
		System.out.println("Please enter the Student Number of the Student: ");
		in2 = scan.nextInt();

		allStud.add(new Student(in, in1, in2));

	}

	public static void update(Student s1) {

		Boolean on = true;
		while(on == true){
			System.out.println("Which field woould you like to edit:\n1. Last Name\n2. First Name\n3. Student Number\n4. Middle Initials\n5. Grade\n6. Phone Number\n7. E-Mail\n8. Street Address\n9. City\n10. Province\n11. Postal Code\n12. Quit");
			int in = scan.nextInt();
			scan.nextLine();

			if(in ==1) {
				System.out.print("Please enter the Students last name: ");
				s1.setLastName(scan.nextLine());
			}
			else if(in ==2) {
				System.out.print("Please enter the Students first name: ");
				s1.setFirstName(scan.nextLine());
			}
			else if(in == 3) {
				System.out.print("Please enter the student number: ");
				s1.setStudentNumber(scan.nextInt());
				scan.nextLine();
			}
			else if(in == 4) {
				System.out.print("Please enter the Students Middle Initials: ");
				s1.setMiddleInitials(scan.nextLine());
			}
			else if(in == 5) {
				System.out.print("Please enter the students grade: ");
				s1.setGrade(scan.nextInt());
				scan.nextLine();
			}
			else if(in == 6) {
				System.out.print("Please enter the Students Phone Number: ");
				s1.setPhoneNumber(scan.nextLine());
			}
			else if(in == 7) {
				System.out.print("Please enter the Students E-Mail: ");
				s1.setEMail(scan.nextLine());
			}
			else if(in == 8) {
				System.out.print("Please enter the Students Street Address: ");
				s1.setStreetAddress(scan.nextLine());
			}
			else if(in == 9) {
				System.out.print("Please enter the City the Student lives in: ");
				s1.setCity(scan.nextLine());
			}
			else if(in == 10) {
				System.out.print("Please enter the Province the Student lives in: ");
				s1.setProvince(scan.nextLine());
			}
			else if(in == 11) {
				System.out.print("Please enter the Students Postal Code: ");
				s1.setPostalCode(scan.nextLine());
			}
			else if(in == 12) {
				return ;
			}
		}
	}

	public static void displayRecord(Student s1) {

		System.out.println("Name: " + s1.getLastName() + " " +s1.getFirstName()+ " " +s1.getMiddleInitials()+ ". " + "\nStudent Number: " + s1.getStudentNumber() + "\tGrade: " + s1.getGrade()
		+ "\nPhone Number: " + s1.getPhoneNumber() + "\tE-Mail: " + s1.getEmail()
		+ "\nCity: " + s1.getCity() + "\tAddress: " + s1.getStreetAddress() + ".\tProvince: " + s1.getProvince() + "\nPostalCode: " + s1.getPostalCode() + "\n\n");

	}

	public static void printAll() {

		for(int i = 0; i<allStud.size(); i ++) {
			displayRecord(allStud.get(i));
		}
	}

	public static void Save() {
		File records = new File("Records.txt");

		if(!records.exists()) {
			try {
				records.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("There is already a file saved to the system, data will automaticly replace the current data.");
		}
		PrintStream fps = null;
		try {
			fps = new PrintStream(records);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fps.println(allStud.size());
		for(int i = 0; i<allStud.size();i++) {
			fps.println((allStud.get(i)).getLastName());
			fps.println((allStud.get(i)).getFirstName());
			fps.println((allStud.get(i)).getStudentNumber());
			fps.println((allStud.get(i)).getMiddleInitials());
			fps.println((allStud.get(i)).getGrade());
			fps.println((allStud.get(i)).getPhoneNumber());
			fps.println((allStud.get(i)).getEmail());
			fps.println((allStud.get(i)).getStreetAddress());
			fps.println((allStud.get(i)).getCity());
			fps.println((allStud.get(i)).getProvince());
			fps.println((allStud.get(i)).getPostalCode());
			fps.println("///////////xxxxxxxxx///////////");
			fps.println("");
			fps.println("");
		}

		fps.close();

	}

	public static void Load () {
		File records = new File("Records.txt");
		Scanner fscan = null;
		try {
			fscan = new Scanner(records);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String x = fscan.nextLine();
		for(int i = 1; i <= Integer.parseInt(x); i++) {
			allStud.add(new Student());
			String finput = "";
			int finput1 = 0;

			finput = fscan.nextLine();
			(allStud.get(allStud.size()-1)).setLastName(finput);

			finput = fscan.nextLine();
			(allStud.get(allStud.size()-1)).setFirstName(finput);

			finput1 = fscan.nextInt(); fscan.nextLine();
			(allStud.get(allStud.size()-1)).setStudentNumber(finput1);

			finput = fscan.nextLine();
			(allStud.get(allStud.size()-1)).setMiddleInitials(finput);

			finput1 = fscan.nextInt(); fscan.nextLine();
			(allStud.get(allStud.size()-1)).setGrade(finput1);

			finput = fscan.nextLine();
			(allStud.get(allStud.size()-1)).setPhoneNumber(finput);

			finput = fscan.nextLine();
			(allStud.get(allStud.size()-1)).setEMail(finput);

			finput = fscan.nextLine();
			(allStud.get(allStud.size()-1)).setStreetAddress(finput);

			finput = fscan.nextLine();
			(allStud.get(allStud.size()-1)).setCity(finput);

			finput = fscan.nextLine();
			(allStud.get(allStud.size()-1)).setProvince(finput);

			finput = fscan.nextLine();
			(allStud.get(allStud.size()-1)).setPostalCode(finput);

			fscan.nextLine();
			fscan.nextLine();
			fscan.nextLine();
		}
	}


	public static void Sort() {

		Collections.sort(allStud);

	}

	public static int Search(int find, int start, int end) {

		int mid = (end + start)/2;

		if(allStud.get(mid).getStudentNumber() == find) {
			return mid;
		}
		else if(start-end == 1) {
			return -1;
		}
		else if(find>mid) {
			return Search(find, mid+1, end);
		}
		else if(find<mid) {
			return Search(find, start, mid-1);
		}

		return -1;



	}

	public static void main(String args[]) {


		boolean cont = true;
		while(cont == true) {
			System.out.println("Welcome To The Schools File Managment System \nWould you like to:\n1. Enter A New Record\n2. Sort\n3. Print Record\n4. Update A Record\n5. Search\n6. Print All\n7. Save\n8. Load\n9. Quit");

			int input = scan.nextInt();
			scan.nextLine();

			if(input == 1) {
				setRecordData();
			}
			else if(input == 2) {
				Sort();
			}
			else if(input == 3) {
				System.out.print("enter the student number of the students file you want to print: ");
				displayRecord(allStud.get(Search(scan.nextInt(), 0, allStud.size()-1)));
			}
			else if(input == 4) {
				System.out.print("enter the student number of the students file you want to edit: ");
				update(allStud.get(Search(scan.nextInt(), 0, allStud.size()-1)));
			}
			else if(input == 5) {
				System.out.print("enter the Students Student Number that you wish to search for: ");
				int index = Search(scan.nextInt(), 0, allStud.size()-1);

				boolean on = true;
				while(on == true) {
					System.out.println("What would you like to do?: \n1. edit\n2. delete\n3. return");
					int in = scan.nextInt();
					
					if(in == 1) {
						update(allStud.get(index));
					}
					else if(in == 2) {
						allStud.remove(index);
						System.out.println("The student has been removed from the system.");
					}
					else if(in == 3) {
						on = false;
					}
				}
			}
			else if(input == 6) {
				printAll();
			}
			else if(input == 7) {
				Save();
			}
			else if (input == 8) {
				Load();
			}
			else if(input == 9) {
				return;
			}
			else {
				System.out.println("Please Enter the Input Correctly");

			}

		}
	}


}
