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

			newLetter = letter;

			// if letter is less than Z and less than 9
			if ((letter >= 'A' && letter <= 'Z')) {

				// Add the next letter in the alphabet
				// Obtain a value between 0 and 25
				newLetter = (char) (((letter - 'A' + shift) % 26) + 'A');

			} else if (letter >= '0' && letter <= '9') {
				newLetter = (char) (((letter - '0' + shift) % 10) + '0');
			}
			// Any other char
			cipheredMessage += newLetter;

		}

		// Print the message ciphered
		System.out.println(cipheredMessage);

		// Close Scanner
		reader.close();

	}

}
