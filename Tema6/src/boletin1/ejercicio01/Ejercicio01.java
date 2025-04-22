package boletin1.ejercicio01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		double suma = 0;
		double media;
		double numero;
		int cont = 0;
		
		try (Scanner reader = new Scanner(new FileReader("src\\boletin1\\ejercicio01\\NumerosReales.txt"))) {
			while(reader.hasNextDouble()) {
				numero = reader.nextDouble();
				suma += numero;
				cont++;
			}
			
			media = suma/cont;
			System.out.println("Suma total: " + suma);
			System.out.println("Media: " + media);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero: " + e.getMessage());
		}

	}

}
