package ahorcado;

import java.util.Random;

public class Ahorcado {

	static String[] palabras = {"humanidad", "hombre", "mujer", "niño"};
	
	static String palabraSecreta = "";
	
	public static void main(String[] args) {
		generaPalabra();
		
		System.out.println(palabraSecreta);

	}
	
	static void generaPalabra() {
		Random rand = new Random();
		int pos = rand.nextInt(0, palabras.length);
		
		palabraSecreta = palabras[pos];
				
	}

}
