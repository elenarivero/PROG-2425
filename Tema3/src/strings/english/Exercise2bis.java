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
			// Current letter of the message
			letter = message.charAt(i);

			// The newLetter is the current letter
			newLetter = letter;

			if ((letter >= 'A' && letter <= 'Z')) {
				// Obtain a value between 0 and 25. Then, add the value of 'A'
				newLetter = (char) (((letter - 'A' + shift + 26) % 26) + 'A');

			} else if (letter >= '0' && letter <= '9') {
				// Obtain a value between 0 and 9. Then, add the value of '0'
				newLetter = (char) (((letter - '0' + shift + 10) % 10) + '0');
			}
			// Append the newLetter
			cipheredMessage += newLetter;

		}

		// Print the message ciphered
		System.out.println(cipheredMessage);

		// Close Scanner
		reader.close();

	}

}
