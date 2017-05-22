import java.util.Scanner;

public class FortuneTellerApp {
	
	static String result = new String ("");

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Please type your First Name:");
	String firstName = input.next();
	
	checkForQuit(firstName);
		
 	
	result = firstName;

	System.out.println("Please type your Last Name:");
	String lastName = input.next();
	checkForQuit(lastName);
	
	result = result + " " + lastName;
			
	System.out.println("Please type your Age:");
	String ageS = input.next();
	checkForQuit(ageS);
	int age = Integer.parseInt(ageS);
	
	
	if (age % 2 == 0) {
		result = result + " will retire in 10 years ";
									
	} else {
		result = result + " will retire in 8 years ";
		
	}

	/*
	 * Request user input for Birth Month
	 */
	System.out.println("What is your birth month? Please enter a valid month between 1 and 12!");
	String birthM = input.next();
	checkForQuit(birthM);
	int birthMonth = Integer.parseInt(birthM);
	
	/*
	 * Validate and perform actions for the Birth Month
	 */
		
	if (birthMonth >= 1 && birthMonth <= 4) {
		result = result + "with $ 350,000.89 in the bank, ";			
	
	}	 
	 else if (birthMonth >= 5 && birthMonth <= 8) {
		result = result + "with $ 3,890,984.89 in the bank, "; 

	 }	 
	 else if (birthMonth >= 9 && birthMonth <=12) {
		result = result + "with $96 in the bank, ";	
	
	 } 	 
	 else {				 
		 result = result + " with $ 0.00 in the bank, ";
	
	 }

	

	/*
	 * Request user to provide sibling number
	 */
	System.out.println("How many siblings do you have?");	
	String sib = input.next();
	checkForQuit(sib);
	int siblings = Integer.parseInt(sib);
	
		
	/*
	 * Based on sibling number, provide appropriate response 
	 */
	 if (siblings == 1) {
		 result = result + "a vacation home in Australia,";
		
		}
	 else if (siblings == 2) {
		 result = result + "a vacation home in The Bahamas,";
		
		} 
	 else if (siblings == 3) {
		 result = result + "a vacation home in The Carribean,";
		
		}
	 else if (siblings == 4) {
		 result = result + "a vacation home in Hawaii,";
		
		} 
	 else if (siblings == 5) {
		 result = result + "a vacation home in Tahiti,";	
		
	 } 
	 else if (siblings > 5) {
		 result = result + "a vacation home in Sweden,";	
		
		} 
	 else {
		  result = result + "with a bad location,";
		 
	 }
	 
	 /*
	  * Request user input for favorite color
      */
		System.out.println("What is your favorite color in ROYGBIV?");
		System.out.println("Type HELP for help!");
		String response = input.next();
		checkForQuit(response);
		
		while (response.equalsIgnoreCase("HELP")){
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			String response2 = input.next();
			response = response2;
			checkForQuit(response);
		}
	
	
	/*
	 * Validate color option to perform action
	 */
	switch  (response.toLowerCase()) {
	
		case "red": 
			result = result + " and travel by sports car.";
		System.out.println(result);
	break;
	    
	case "orange":
	result = result + " and travel by moped.";
		System.out.println(result);
	break;
	
	case "yellow":
	result = result +  " and travel by a bike.";
		System.out.println(result);
	break;
	
	case "blue":
	result = result +  " and travel by a truck.";
		System.out.println(result);
	break;
	
	case "violet":
	result = result +  " and travel by a jet.";
		System.out.println(result);
	break;
	
	case "indigo":
	result = result +  " and travel by sedan.";
		System.out.println(result);
	break;
	
	case "green":
	result = result +  " and travel by a rickshaw.";
		System.out.println(result);
	break;	
 	
}
	
	
	
       
    /*
     [First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank,
a vacation home in *[location]*, and travel by *[mode of transportation]*.    
     */
	input.close();
	}
	
	public static void checkForQuit(String userInput){
		
		userInput = userInput.toLowerCase();
		
		if (userInput.equals("quit")) {		
		System.out.println("Nobody likes a quitter...");
		System.exit(0);
		}
		
	}
	
}