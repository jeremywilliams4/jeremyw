import java.util.Scanner; //scanner object to collect user input
import java.util.ArrayList;  //imports ArrayList class and methods to build client list
import java.util.InputMismatchException; //used to verify user input 
import java.sql.*; //import to allow SQL queries
import javax.sql.*; //import to allow SQL queries

public class ClientList {
	
	//method creates an ArrayList of client names that can be easily added to
	public static void DisplayClients (){
	ArrayList<String> clientList = new ArrayList<String>();
	
	//.add method appends new client names to ArrayList "clientList"
	clientList.add("Bob Jones");
	clientList.add("Sarah Davis");
	clientList.add("Amy Friendly");
	clientList.add("Johnny Smith");
	clientList.add("Carol Spears");
		
	int i=0;
	//loop to print the contents of the client list to the console using .size method
	for(i=0; i < clientList.size(); ++i) {
		//iterates through list printing client names until end of ArrayList is reached
		System.out.println(clientList.get(i));
	}
	//prints a new line to create space between console messages
	System.out.println();

	
	}
	
	//method to display a customer's choice investment options
	public static void DisplayCustomerChoice() {
		//variable to capture user choice
		int display_choice;
		
		//prompts the user to choose which client they want to view
		System.out.println("Enter the number of the client you wish to view");
		
		//try block verifies user input is integer, catch handles exception if user enters anything other that an integer value
		try {
		//collects the user's choice
		Scanner scnr = new Scanner(System.in);
		
		//variable to capture user input
		display_choice = scnr.nextInt();
		
		//if statement that only runs if user enters 1
		if (display_choice == 1) {
			System.out.println("Bob Jones selected option 1");
			System.out.println();
		}
		//runs only if user enters 2
		else if (display_choice == 2) {
			System.out.println("Sarah Davis selected option 2");
			System.out.println();
		}
		//runs only if user enters 3
		else if (display_choice == 3) {
			System.out.println("Amy Friendly selected option 1");
			System.out.println();
		}
		//runs only if user enters 4
		else if (display_choice == 4) {
			System.out.println("Johnny Smith selected option 1");
			System.out.println();
		}
		//runs only if user enters 5
		else if (display_choice == 5) {
			System.out.println("Carol Spears selected option 2");
			System.out.println();
		}
		//Verifies valid user input from menu options (original program had no input validation)
		else if (display_choice < 1 || display_choice > 5) {
			System.out.println("Invalid entry. Please select a number.");
			System.out.println();
		}
		}
		//catch handles any user input that is not an integer and prompts user to enter a number
		catch(InputMismatchException exception)
		{
		  //Message to user to obtain valid entry
		  System.out.println("This is not an integer. Please enter a number");
		  System.out.println();
		}
	}

	public static void main(String[] args) {
		
		//Greeting to welcome the user
		System.out.println("This program has been modified by jr. developer Jeremy Williams.");
		System.out.println();
		System.out.println("Hello. Welcome to our investment company.");
		
		//while loop with boolean to make menu run continuously until user chooses to exit program
		while(true) {
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println();

		//menu displayed to user of available options for them to choose from
		System.out.println("Press 1 to - DISPLAY the client list?");
		System.out.println("Press 2 to - VIEW a client's choice?");
		System.out.println("Press 3 to - EXIT the program?");
		
		//variable to capture user choice
		int choice;
		
		//try block verifies valid input from user, uses catch to handle any input that is not an integer
		try {
		//new scanner object catches user input
		Scanner scnr = new Scanner(System.in);
		choice = scnr.nextInt();
		
		//if/else statements to handle user choice
		//if statement runs only if user enters 1
		if(choice == 1) {
			System.out.println("You chose 1");
			System.out.println();
			System.out.println("CLIENT LIST");
			
			//calls DisplayInfo() function to display client list
			DisplayClients();
		}
		//runs only if user enters 2
		else if(choice == 2) {
			System.out.println("You chose 2");
			
			//calls DisplayCustomerChoice() function to display client list
			DisplayCustomerChoice();
		}
		//runs only if user enters 3
		else if(choice == 3) {
			System.out.println("You chose 3");
			System.out.println();
			System.out.println("Goodbye.");
			System.out.println();
			
			//message informs user that database will be updated with current contents of ArrayList 
			System.out.println("Sending data to database...");
			
			//sends updated data to database by establishing a connection a sending contents of clientList ArrayList
			DatabaseConnection db = new DatabaseConnection();{
			    try (Connection connect = db.getConnection()) {
			    	String sql = "INSERT INTO clientList " +
			    "VALUES (clientList)";
			        try (PreparedStatement ps = connect.prepareStatement(sql)) {
			        	  for (ArrayList<String> clientList;;) {
			                  ps.addBatch();
			              }
			    //catch blocks handle SQLExceptions
			    } catch (SQLException e) {
					e.printStackTrace();
				}

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			//closes scanner object "scnr" before ending program
			scnr.close();

		    //ends the program if user selects option #3
			return;

		}
		//Verifies valid user input from menu options (original program had no input validation)
		else if (choice < 1 || choice > 3) {
			System.out.println("Invalid entry. Please select an option from 1-3.");
		}
		}
		
		//catch handles any input that is not an integer
		catch(InputMismatchException exception)
		{
		  //Message to user to obtain a valid entry
		  System.out.println("This is not an integer. Please enter a number.");
		  System.out.println();
		}
		
		
		
	}
	
}

}


