package boletin1.ejercicio03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03 {

	public static void main(String[] args) {
		double mediaEdad = 0;
		double mediaAltura = 0;
		int sumaEdades = 0;
		double sumaAlturas = 0;
		int cont = 0;

		String nombre;
		int edad;
		double altura;

		String nombres = "";

		try (BufferedReader br = new BufferedReader(new FileReader("src\\boletin1\\ejercicio03\\Alumnos.txt"))) {

			// 1º Leemos una línea del fichero
			String linea = br.readLine();

			// 2º Comprobamos que la línea no es null, en cuyo caso realizamos acciones
			// sobre ella
			while (linea != null) {
				// Dividimos la línea por el espacio
				String datos[] = linea.split(" ");

				// En la posición 0 está el nombre
				nombre = datos[0];
				
				// En la posición 1 está la edad
				edad = Integer.parseInt(datos[1]);
				
				// En la posición 2 está la altura
				altura = Double.parseDouble(datos[2]);

				// Concatenamos el nombre
				nombres += nombre + " ";
				
				// Añadimos la edad
				sumaEdades += edad;
				
				// Añadimos la altura
				sumaAlturas += altura;

				// Sumamos 1 al contador para el cálculo de las medias
				cont++;

				// Leemos la siguiente línea
				linea = br.readLine();
			}
			
			// Cálculo de la media de las edades
			mediaEdad = sumaEdades / cont;
			
			// Cálculo de la media de las alturas
			mediaAltura = sumaAlturas / cont;
			
			// Pintamos los nombres
			System.out.println(nombres);
			
			// Pintamos la media de las edades
			System.out.println("Media edades: " + mediaEdad);
			
			// Pintamos la media de las alturas
			System.out.println("Media alturas: " + mediaAltura);

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error en la lectura: " + e.getMessage());
		}

	}

}
