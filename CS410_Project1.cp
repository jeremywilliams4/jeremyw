//
//  main.cpp
//  CS410_Project1
//
//  Created by Jeremy Williams on 7/31/22.
//

#include <iostream>
using namespace std;

//method to check for user credentials
void CheckUserPermissionAccess(){
    
}

//method to display client list
void DisplayInfo(){
    //names of clients
    string client1 = "Bob Jones";
    string client2 = "Sarah Davis";
    string client3 = "Amy Friendly";
    string client4 = "Johnny Smith";
    string client5 = "Carol Spears";
    
    //options to choose from for investments
    string option1 = "Brokerage";
    string option2 = "Retirement";
    
    cout << "1. " << client1 << " selected option " << option1 << endl;
    cout << "2. " << client2 << " selected option " << option2 << endl;
    cout << "3. " << client3 << " selected option " << option1 << endl;
    cout << "4. " << client4 << " selected option " << option1 << endl;
    cout << "5. " << client5 << " selected option " << option2 << endl;

}

//method to change client choice
void ChangeCustomerChoice(){
    //variable to capture user choice
    int change_choice;
    
    //options to choose from for investments
    string option1 = "Brokerage";
    string option2 = "Retirement";
    
    //prompts the user to choose which client they want to change
    cout << "Enter the number of the client you wish to change" << endl;
    //collects user's choice
    cin >> change_choice;
    
    //runs based on which option user chooses
    if (change_choice == 1){
        cout << "1. Bob Jones selected option 1 " << option1 << endl;
    } if (change_choice == 2){
        cout << "2. Sarah Davis selected option 2 " << option2 << endl;
    } if (change_choice == 3){
        cout << "3. Amy Friendly selected option 1 "<< option1 << endl;
    } if (change_choice == 4){
        cout << "4. Johnny Smith selected option 1 " << option1 << endl;
    } if (change_choice == 5){
        cout << "5. Carol Spears selected option 2 "<< option2 << endl;
    }
    
}

int main(int argc, const char * argv[]) {
    //Greeting
    cout << "This program has been modified by jr. developer Jeremy Williams." << endl;
    cout << "Hello. Welcome to our investment company." << endl << endl;
    cout << "What would you like to do?" << endl;
    
    //variable to capture user choice
    int choice;
    
    //options available for the user to choose from by hitting 1, 2, or 3
    cout << "DISPLAY  the client list? (enter 1)" << endl;
    cout << "CHANGE a client's choice? (enter 2)" << endl;
    cout << "Exit the program? (enter 3)" << endl;
    
    cin >> choice;
    
    //if user selects #1
    if(choice == 1){
        cout << "You chose 1" << endl;
        //calls the function to display the client list
        DisplayInfo();
    }
    //if user selects #2
    if(choice ==2){
        cout << "You chose 2" << endl;
        //calls the function to change the client choice
        ChangeCustomerChoice();
    }
    //if user selects #3
    if(choice ==3){
        cout << "You chose 3" << endl;
        //ends the program

    }
    return 0;
}
