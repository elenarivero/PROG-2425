package boletin3;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variable donde almacenar el número
		int num;

		// Variable para almacenar las unidades
		int unidades;

		// Variable para almacenar las decenas
		int decenas;

		// Cadena donde guardar el resultado
		String resul = "";

		// Cadena para las decenas
		String cadDecenas = "";
		
		// Cadema para las unidades
		String cadUnidades = "";

		// Scanner para leer el número
		Scanner reader = new Scanner(System.in);

		// Pedimos un número al usuario
		System.out.println("Introduzca un número entero");
		num = reader.nextInt();
		
		// Me quedo con las unidades
		unidades = num % 10;

		// Me quedo con las decenas
		decenas = num / 10;


		if (num >= 1 && num <= 99) {

			switch (num) {
			case 10 -> resul = "diez";
			case 11 -> resul = "once";
			case 12 -> resul = "doce";
			case 13 -> resul = "trece";
			case 14 -> resul = "catorce";
			case 15 -> resul = "quince";
			default -> {
				
				switch (unidades) {
				case 1 -> cadUnidades = "uno";
				case 2 -> cadUnidades = "dos";
				case 3 -> cadUnidades = "tres";
				case 4 -> cadUnidades = "cuatro";
				case 5 -> cadUnidades = "cinco";
				case 6 -> cadUnidades = "seis";
				case 7 -> cadUnidades = "siete";
				case 8 -> cadUnidades = "ocho";
				case 9 -> cadUnidades = "nueve";
				}

				switch (decenas) {
				case 1 -> cadDecenas = "dieci" ;
				case 2 -> {
					if (unidades == 0) {
						cadDecenas = "veinte";
					} else {
						cadDecenas = "veinti";
					}
				}
				case 3 -> {
					cadDecenas = "treinta";
					if (unidades != 0) {
						cadDecenas = cadDecenas + " y " ;
					}
				}

				case 4 -> {
					cadDecenas = "cuarenta";
					if (unidades != 0) {
						cadDecenas = cadDecenas + " y " ;
					}
					
				}

				case 5 -> {
					cadDecenas = "cincuenta";
					if (unidades != 0) {
						cadDecenas = cadDecenas + " y " ;
					}
					
				}

				case 6 -> {
					cadDecenas = "sesenta";
					if (unidades != 0) {
						cadDecenas = cadDecenas + " y " ;
					}
				}

				case 7 -> {
					cadDecenas = "setenta";
					if (unidades != 0) {
						cadDecenas = cadDecenas + " y " ;
					}
				}

				case 8 -> {
					cadDecenas = "ochenta";
					if (unidades != 0) {
						cadDecenas = cadDecenas + " y ";
					}
				}
				case 9 -> {
					cadDecenas = "noventa";
					if (unidades != 0) {
						cadDecenas = cadDecenas + " y " ;
					}
				}
				}
			}
			}
		}

		resul = resul.equals("") ? (cadDecenas + cadUnidades): resul;
		System.out.println(resul);
		// Cerramos el Scanner
		reader.close();

	}

}
