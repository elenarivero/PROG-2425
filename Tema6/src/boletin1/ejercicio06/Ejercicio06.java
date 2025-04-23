package boletin1.ejercicio06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		List<Integer> lista = leeNumeros();
		
		Collections.sort(lista);
		
		escribeLista(lista);
		
	}

	public static List<Integer> leeNumeros() {
		List<Integer> listaNumeros = new ArrayList<>();
		String fichero = "src\\boletin1\\ejercicio06\\numeros.txt";

		try (Scanner reader = new Scanner(new FileReader(fichero))) {

			int numero;
			
			while(reader.hasNextInt()) {
				numero = reader.nextInt();
				
				listaNumeros.add(numero);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado: " + e.getMessage());
		}

		return listaNumeros;
	}
	
	public static void escribeLista(List<Integer> lista) {
		String fichero = "src\\boletin1\\ejercicio06\\numerosOrdenados.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))){
			
			for(int numero : lista) {
				bw.write(String.valueOf(numero));
				bw.newLine();
			}
			
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
