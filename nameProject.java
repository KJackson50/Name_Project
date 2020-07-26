import java.util.Scanner;

public class firstName_lastName {

	public static void main(String[] args) {
		
		
		
		Scanner firstName = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter First Name");
	    String userNamefirst = firstName.nextLine();  // Read user input
	   
		Scanner lastName = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Last Name");
	    String userNamelast = lastName.nextLine();  // Read user input
	    
	    
	    System.out.println("Your name is " + userNamefirst + " " + userNamelast + ".");  // Output user input
		
		

	}

}
