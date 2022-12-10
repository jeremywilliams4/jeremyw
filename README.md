![38910776-binary-website-header-banner-computer-digitally-generated-illustration-for-web-site-headers](https://user-images.githubusercontent.com/75949144/206601277-03fdbd37-6843-43ec-b26a-cea37c94c3e9.jpg)

# 💻 JEREMY WILLIAMS, SOFTWARE DEVELOPER 💻
[![3158180](https://user-images.githubusercontent.com/75949144/206854903-b07ed3a6-ae58-4e47-a09f-1f1bbfef725b.png)](mailto:jeremy.williams4@snhu.edu)

[![GitHub-Mark](https://user-images.githubusercontent.com/75949144/206854958-062476a0-fa64-4677-85da-78062ea98c0f.png)](https://github.com/jeremywilliams4/jeremywilliams4.github.io.git)

[![youtube-2017-icon-logo-D1FE045118-seeklogo com](https://user-images.githubusercontent.com/75949144/206855579-816ba333-48c1-4528-8eb0-2e93da434663.png)](https://youtu.be/IwnrzGqmY8c)


## CS 499 Professional Self-Assessment
  
##    ABOUT ME
  In March of 2019, I took my first steps toward a major career change. Not an easy thing to do for a father and husband. I have worked as a commercial electrician for 20 years in nearly every capacity: master electrician, foreman, project estimator, project manager, etc. I knew that to be successful in the computer science field, I would need more than just my dedication and hard work ethic. I would need professional training, a degree that shows I am capable, and a willingness to commit to a lifetime of learning. Over the course of my time in the Computer Science program at SNHU I have been pushed harder than I ever have been before. I have also pushed myself farther than I ever have before. I have gained more than just knowledge of programming in Python, C++, and Java. I can do more than just create class diagrams, collect user stories, query databases, and troubleshoot network connections or programming errors. I can now look at practically any real-world problem or business need and imagine a software solution for it. 
	
##    EXPERIENCE
  Over my time spent in this program I have worked on many different types of projects. I have learned to collaborate on projects by working with classmates and my professor on a jukebox application. For this project, we were all assigned a portion of the program to work on and then commit to the master branch in our version control system (Bitbucket). This project showed me the value of version control, commit messages, branches, and pull requests. A new level of attention to detail arises when working collaboratively on a project. I also gained experience in the SDLC (Software Development Life Cycle) by collecting user stories, working on design with class diagrams, implementing code, testing code, etc. One of my favorite, and most difficult, courses required us to build a 3D rendering of a picture we took ourselves of three different objects resting on a plane. Here we used Visual Studio and OpenGL to build shapes using triangles, create a plane for the objects to rest on, position and control camera movements and set lighting all within C++ code. I had the chance as well to work with assembly language in my Software Reverse Engineering class. By breaking a program down into its basic components, and then recreating that program myself, I gained a more seasoned understanding of just why we use things like classes and methods in our programs today.

##    WHAT YOU CAN FIND HERE
  For my CS 499 Capstone course at SNHU, I created an [ePortfolio](https://github.com/jeremywilliams4/jeremywilliams4.github.io.git) that is a testament to the newfound skills and knowledge I have acquired during my time in this program and serves as evidence that I am now equipped to begin a professional career in the Computer Science field. Looking through this ePortfolio, will show how I will be a valuable asset to any software development team. In effort to best portray the breadth of my computer science knowledge, I have taken a program I created in a previous class and performed enhancements to it across three categories of professionalism in software development: Software Design & Engineering, Algorithms & Data Structures, and Databases. My process began with a code review of my original program that can be found on YouTube here. In this review, I describe the structure of the original program as well as identify areas for improvement. I also touch on the enhancements that I went on to make in the areas of data structures, decision loops, iterators, input validation, security improvements, and databases. More detail on the enhancements and their benefits can be found in the narrative included in the ePortfolio on GitHub. The original code as well as enhanced Java program are also available for you viewing in the ePortfolio. I am confident that upon exploring the included artifacts in this ePortfolio, you will be convinced, as I have been by it, that I am ready to take the valuable skills I am now a proud owner of and put them to work for you. Thank you for taking the time to read this intro! Happy exploring!
  
#### *Read on to learn more about the enhancements made to one of my old projects!*

### *OLD PROGRAM*
```c++
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
```

## *NEW PROGRAM*
```java
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
			
			//sends updated data to database by establishing a connection and sending contents of clientList ArrayList
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
```


### NARRATIVE FOR ENHANCEMENTS 1, 2, & 3
### ALL PERFORMED ON: ClientList program

### ARTIFACT HISTORY

My artifact for the: 1) Software Design and Engineering, 2) Algorithms and Data Structures, and 3) Databases, categories is a program titled, “ClientList”. This is a project from my CS410 class, Software Reverse Engineering. This is a simple program that prompts the user to select from a menu of options and then reacts according to that input. The program will display a current list of clients, and then allow the user to select a specific client to view their investment option or exit the program. I chose this program because it seemed like a great example of a real-world scenario and could allow for expandability. I imagined this type of program to be much like one that a business such as a bank, for example, may use to keep track of client information. The program very adequately showcases my ability to transform a real-world business need and into a simple and sophisticated software solution.

### ENHANCEMENTS

For this artifact I performed the following enhancements to align with the three different categories mentioned above:
#### 1)	Software Design and Engineering
-For this category enhancement, I converted my original C++ program into Java. Being able to translate a program from one language to another was a great way for me to showcase my computer science skills for this category, and a valuable skill in the ever-evolving development world.
#### 2) Algorithms and Data Structures
-For this category enhancement, I expanded the complexity of the original program by converting the list of clients from individual variables to members of an ArrayList. This showcased skills and knowledge of data structures as well as made the program more efficient and easier to expand in the future. For this category I also implemented some improvements regarding the security of the program by adding input validation and exception handling. Now the program will verify that the user input is within the range of the menu options. If not, the user is prompted with a message to make a valid entry. The user input required for the program to run must be an integer. In order to provide further input validation, I used try/catch blocks to handle any exceptions thrown from a letter being entered instead of an integer. 
#### 3) Databases
-For this category enhancement, I chose to use the ArrayList built by the program, to            populate a MySQL database. This was a great way to solve a real-world business problem and allow me to demonstrate my ability to work with databases in a way that incorporates useful business tools and software solutions. Now, every time the program is exited, a connection to a MySQL database is established that loads the contents of the clientList ArrayList into a database. 

#### REFLECTION

I learned quite a bit from revisiting my original program and then performing the above enhancements. I was reminded of the similarities of C++ and Java. Not surprising since Java was built on a C++ foundation. However, there were some syntax differences like method naming for instance that I had to correct. I also had to go about input validation a little differently than I would have had to in C++. These challenges, however, only strengthened my programming skills and led to a higher level of confidence and better performing program. Feedback was tremendously helpful as I navigated my way through the enhancements. I learned from that feedback that my original plan for the Databases category was not strong enough to showcase my proficiency in this area. I wanted to simply create a user log-in database for the program. However, the program now is much more sophisticated in the Databases category after building upon professor feedback. Instead, the program will load a MySQL database upon closing the program with the contents of the ArrayList of client names. 

#### MEETING OUTCOMES

The program described above allowed me to demonstrate my proficiency in a range of computer science disciplines. It was also a great learning opportunity to revisit an old program and make necessary enhancements to it. Along with these advantages, this program, and the work that I performed throughout all three categories of enhancements, clearly lay out my successful completion of the Five Course Outcomes outlined below:

#### 1)	Employ strategies for building collaborative environments that enable diverse audiences to support organizational decision making in the field of computer science

 <img width="326" alt="image" src="https://user-images.githubusercontent.com/75949144/206603461-beaaf021-ddbf-4e2d-817e-9cc1ea2c5a7a.png">

i.	I was able to achieve this in my portfolio with my artifact, ClientList, by taking a program originally written in the C++ language and translating it into Java, while maintaining its efficiency and honoring its original design features. This process is proof of my ability to operate in a collaborative way and be able to adapt to different audiences, diverse programming environments, and make decisions necessary while adhering to design techniques and user requirements. Java is the main language used by Android mobile devices and with the growing list of available devices, and greater and greater demand for mobile platforms for programs, being able to convert a standard desktop-style C++ program into Java is a very valuable and meaningful skill. 

ii.	I also successfully showcased my proficiency in this course outcome by my enhancement in the Databases category with this artifact. This enhancement meets that criterion by its utilization of trusted database software, MySQL, and taking advantage of its cohesiveness with Java and the Eclipse development environment. By using these combined tools, I have shown that I am able to use well-founded and innovative techniques to solve a computing problem. First, I chose to use the ArrayList of clients I built for enhancement two to automatically populate a MySQL database. Second, I also created a DatabaseConnection class where I wrote out individual SQL queries that not only portray my experience with SQL databases, but also serves as another way to populate a database from a Java program.  The solution offered in this program is an industry-specific one that will meet many relevant business needs: collecting client information, verifying that information, protecting that information, and allowing for expansion in an easy to maintain and simple software solution.

 <img width="468" alt="image" src="https://user-images.githubusercontent.com/75949144/206603519-3948b630-146b-4575-bd0a-ddd6cdeb7f73.png">

#### 2)	Design, develop, and deliver professional-quality oral, written, and visual communications that are coherent, technically sound, and appropriately adapted to specific audiences and contexts

[CODE REVIEW](https://youtu.be/IwnrzGqmY8c)

i.	I was able to meet this course outcome in my portfolio by performing a code review of my original version of my artifact, ClientList. For this code review, I created a screencast where I was able to walk through an evaluation of the program and highlight areas for improvement. The video can be found on YouTube by clicking here. This code review is an example of the skills I have obtained in analyzing a program, identifying its structure, and finding room for improvement. This code review covers an analysis of the structure, documentation, variables, arithmetic operations, loops and branches, and defensive programming techniques. Code reviews are a regular part of a software developer’s duties. The code review included in my portfolio showcases my knowledge of programming basics and best practices. It also shows my ability to create visuals and presentations that are easy to operate, easy to follow, and professional. 

ii.	I was also able to meet this course outcome by including descriptive, informative, and useful in-line comments to the code in my artifact, ClientList. The comments included in this program describe its functionality and purpose in a way that will make it easy for any developer to follow. This skill is one that is vital for a programmer to have. Most projects are done in a collaborative way, and it is very important that the work that one developer does to a program can be easily deciphered by another developer. Having people who are proficient in this area of the software development world is the only way we can have the sophisticated software solutions available to us today.

#### 3)	Design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution, while managing the trade-offs involved in design choices

<img width="468" alt="image" src="https://user-images.githubusercontent.com/75949144/206603562-13f0ae46-200c-436e-9b0d-57a5473bf758.png">
 
i.	I was able to achieve this outcome by the enhancements I made to my ClientList artifact in category #2. For this enhancement I took the names of the clients and created an ArrayList data structure to house the list of clients. My original artifact displayed a list of client names by simply creating a separate variable for each client. This enhancement now much better aligns with appropriate business needs and software solutions. In the real world, a business that would use a program similar to this would have a list of clients that is fluid. It would need to be able to grow and change with the business. An ArrayList is a more advanced programming concept that allows for expandability and better showcases my programming knowledge. This enhancement shows that I can take a program that technically does work, and then use fundamental programming techniques and best practices to make it more efficient and more useful for the end user. It also shows my understanding of Object-Oriented Programming techniques that will prove valuable to any employer. During my code review, I also recognized other areas for improvement in my original artifact. I performed enhancements regarding user input validation that make the program more reliable. Now if a user selects an option that is not part of the menu, an error message informs the user of their mistake and prompts them to make a valid entry. The original artifact did not have these features in place and would simply crash upon invalid input. These enhancements show that I can use algorithmic principles to solve problems while also making informed design decisions that are appropriate to the specific case.

#### 4)	Demonstrate an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals

i.	I achieved this course outcome in my ClientList artifact by first, converting my existing C++ program into Java. This is proof of my well-rounded programming knowledge in more than one language. It is also proof of my ability to not only learn a language or two, but to understand programming on a more advanced level and be able to implement software solutions to real-world problems. Specifically, in my enhancement regarding user input validation, after translating this program into Java, I implemented a try/catch block that not only validates correct integer input from the menu options, but also handles a mismatch exception that occurred if a user entered a letter instead of a number when making their selection. This error caused the program to crash before my enhancement. Now that error is handled, and the user is prompted with a message telling them to be sure and enter a number from the menu options. Although the program ran perfectly, with valid user input, before this enhancement, it will now continue to run without fail no matter what input it may see from a user. Using this specific method of error and exception handling shows my advanced understanding of available tools in Java and my understanding of computing best practices.

<img width="468" alt="image" src="https://user-images.githubusercontent.com/75949144/206603606-fbfa58f6-47bf-4c20-bf26-6720ce8ed9a0.png">
 
ii.	I also successfully showcased my proficiency in this course outcome by my enhancement in the Databases category with this artifact. This enhancement meets that criterion by its utilization of trusted database software, MySQL, and taking advantage of its cohesiveness with Java and the Eclipse development environment. By using these combined tools, I have shown my ability to use innovative techniques, skills, and tools to provide valuable computing solutions. First, I chose to use the ArrayList of clients I built for enhancement two to automatically populate a MySQL database. Second, I also created a DatabaseConnection class where I wrote out individual SQL queries that not only portray my experience with SQL databases, but also serves as another way to populate a database from a Java program. The solution offered in this program is an industry-specific one that will meet many relevant business needs: collecting client information, verifying that information, protecting that information, and allowing for expansion in an easy to maintain and simple software solution.
 
 <img width="431" alt="image" src="https://user-images.githubusercontent.com/75949144/206603871-859f9596-9260-4312-b3a7-3df319f8bfe3.png">

#### 5)	Develop a security mindset that anticipates adversarial exploits in software architecture and designs to expose potential vulnerabilities, mitigate design flaws, and ensure privacy and enhanced security of data and resources

<img width="238" alt="image" src="https://user-images.githubusercontent.com/75949144/206603907-908cab80-7d85-48aa-bae8-aefdc2bb1316.png">

i.	I have achieved this outcome by the enhancements I made to my ClientList artifact regarding input validation. Any data input into the system should be validated first. This is a major area for potential vulnerability. This a well-founded Defense in Depth (Johnson, 2020) secure coding standard. After my enhancements that validate all user input before it is allowed into the program, the ClientList artifact is now protected from any malformed or corrupt data entering the system through user input. This is very important for a system that stores client information that is likely sensitive in nature. Having a security mindset means that security is part of the design phase of the program. Security threats are brainstormed much as the UI/UX are. It is no longer enough to handle attacks after they occur. As programmers of today, these attacks must be expected, planned for, and prevented. The only way to come close to preventing attacks in modern computing is to implement security features into the design phase. That way, security threats like buffer overflow, or SQL injection attacks can be prevented. In this simple program, I have showcased my understanding of the importance of protecting customer data, and also that I can implement tools and programming techniques that anticipate security threats and protect user data.

### CONCLUSION

  This narrative follows my journey through performed enhancements in the categories: Software Design and Engineering, Algorithms and Data Structures, and Databases. I used one artifact, ClientList, for all three categories. This experience has made me a better programmer and has in turn, allowed me to showcase to future employers, professors, as well as myself, that I am ready to become a valuable asset in the software development world of today.






