package pruebas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LecturaScanner {

	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new FileReader("src\\pruebas\\numeros.txt"));
			
			double numero;
			double suma = 0;
			
			while(sc.hasNextDouble()) {
				numero = sc.nextDouble();
				suma += numero;
				System.out.println(numero);
			}
			
			System.out.println(suma);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
