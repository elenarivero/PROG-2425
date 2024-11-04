package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Cálculo del m.c.d.
		// Dos números
		int numA = 0, numB = 0;
		int menor;
		
		boolean enc = false;
		
		Scanner reader = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Introduzca un número:");
				numA = reader.nextInt();
				assert (numA > 0) : "Debe introducir un valor mayor que 0";
			} catch (InputMismatchException e) {
				System.out.println("Debe introducir un valor entero");
				reader.nextLine();
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			}
		} while (numA < 1);
		
		do {
			try {
				System.out.println("Introduzca otro número:");
				numB = reader.nextInt();
				assert (numB > 0) : "Debe introducir un valor mayor que 0";
			} catch (InputMismatchException e) {
				System.out.println("Debe introducir un valor entero");
				reader.nextLine();
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			}
		} while (numB < 1);
		
		// Comprobamos quién es menor
		menor = numA <= numB ? numA : numB;
		
		while (!enc){
			if(numA % menor == 0 && numB % menor == 0) {
				System.out.println("El máximo común divisor es: " + menor);
				enc = true;
			}
			menor--;
		}
		
		
		reader.close();
	}

}
