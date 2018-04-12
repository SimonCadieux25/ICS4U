package cadieux;

import java.util.Scanner;

public class SchoolSystem {

	static Scanner scan = new Scanner(System.in);
	
	public static void Main(String args[]) {
		
		System.out.println("Welcome To The Schools File Managment System \nWould you like to:\nEnter A New Record\nPrint Record\nQuit");
		String input = scan.nextLine();
		
		if(input.equals("Enter A New Record")) {
			
		}
		else if(input.equals("Print Record")) {
			
		}
		else if(input.equals("Quit")) {
			
		}
		else {
			System.out.print("Please Enter the Input Correctly");
		}
	}
}
