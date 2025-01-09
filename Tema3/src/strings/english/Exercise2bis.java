package strings.english;

import java.util.Scanner;

public class Exercise2bis {

	public static void main(String[] args) {
		// "ABCEDFGHIJKLMNOPQRSTUVWXYZ" -- 26

		// User message
		String message = "";

		// Message ciphered
		String cipheredMessage = "";

		// Every character of the message
		char letter;

		// Char with shift added
		char newLetter;

		// Variable to save the shift
		int shift = 0;

		// Scanner to read from console
		Scanner reader = new Scanner(System.in);

		// Ask the user a message
		System.out.println("Introduce a message to cipher");
		message = reader.nextLine().toUpperCase(); // hello everybody

		// Ask the user the shift
		System.out.println("Introduce the shift");
		shift = reader.nextInt(); // hello everybody

		// Loop to read the message
		for (int i = 0; i < message.length(); i++) {
			// Add the letter the shift
			letter = message.charAt(i);

			// Add the next letter in the alphabet
			newLetter = (char) (letter + shift);
			
			// if letter is less than Z and less than 9
			if ((letter >= 'A' && letter <= 'Z') ) {				
				if (newLetter > 'Z') {
					// in case is greater than Z
					cipheredMessage += (char) (newLetter % ('Z' + 1) + 'A');
				} else {
					cipheredMessage += newLetter;
				}
			} else if(letter >= '0' && letter <= '9') {
				if (newLetter > '9') {
					// in case is greater than 9
					cipheredMessage += (char) (newLetter % ('9' + 1) + '0');
				} else {
					cipheredMessage += newLetter;
				}
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
