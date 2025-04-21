package pruebas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src\\pruebas\\escritura.txt", true));
			bw.newLine();
			bw.write("Hola a todos");
			bw.newLine();
			bw.write("nueva línea");
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println("Ha habido algún problema al abrir el fichero");
		}

	}

}
