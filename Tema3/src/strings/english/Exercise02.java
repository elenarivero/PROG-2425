package strings.english;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// "ABCEDFGHIJKLMNOPQRSTUVWXYZ" -- 26
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// Numbers
		String numbers = "0123456789";
		
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
		
		// Position of the letter in the alphabet
		int posLetter;
		
		// Position of the number in numbers
		int posNumber;

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
			
			posLetter = alphabet.indexOf(letter);
			posNumber = numbers.indexOf(letter);
			
			if(posLetter >= 0) {
				posLetter = (posLetter + shift + 26) % alphabet.length();
				newLetter = alphabet.charAt(posLetter);
			} else if (posNumber >= 0){
				posNumber = (posNumber + shift + 10) % numbers.length();
				newLetter = numbers.charAt(posNumber);
			}			
			
			cipheredMessage += newLetter;
			
		}

		// Print the message ciphered
		System.out.println(cipheredMessage);

		// Close Scanner
		reader.close();

	}

}
