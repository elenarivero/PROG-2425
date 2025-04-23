package boletin1.ejercicio05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio05 {

	public static final String FICHERO = "src\\boletin1\\ejercicio05\\datos.txt";
	
	public static void main(String[] args) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO, true))){
			Scanner reader = new Scanner(System.in);
			
			String nombre;
			int edad;
			
			System.out.println("Introduzca el nombre");
			nombre = reader.nextLine();
			
			System.out.println("Introduzca la edad");
			edad = reader.nextInt();
			
			bw.write(nombre + " " + edad);
			bw.newLine();
			bw.flush();
			
			reader.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
