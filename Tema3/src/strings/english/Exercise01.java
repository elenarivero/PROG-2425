package strings.english;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// "ABCEDFGHIJKLMNOPQRSTUVWXYZ" -- 26
		
		// User message
		String message = "";
		
		// Message ciphered
		String cipheredMessage = "";
		
		// Every character of the message
		char letter;
		
		// Scanner to read from console
		Scanner reader = new Scanner(System.in);
		
		// Ask the user a message
		System.out.println("Introduce a message to cipher");
		message = reader.nextLine().toUpperCase(); // hello everybody
		
		// Loop to read the message
		for(int i = 0; i<message.length(); i++) {
			letter = message.charAt(i);
			// if letter is less than Z and less than 9
			if((letter >= 'A' && letter < 'Z') || (letter >= '0' && letter < '9')) {
				// Add the next letter in the alphabet
				cipheredMessage += (char)(letter+1);
			} else if (letter == 'Z'){
				// in case we have Z
				cipheredMessage += 'A';
			} else if (letter == '9') {
				// in case we have 9
				cipheredMessage += '0';
			} else { // Any other char
				cipheredMessage += letter;
			}
		}
		
		// Print the message ciphered
		System.out.println(cipheredMessage);
	
		// Close Scanner
		reader.close();

	}

}
