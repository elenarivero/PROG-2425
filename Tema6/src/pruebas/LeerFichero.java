package pruebas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\pruebas\\pruebas.txt"));

			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
		} catch (IOException e) {
			System.err.println("Error a la hora de leer el fichero");
		}

	}

}
