package ahorcado;

import java.util.Random;

public class JuegoAhorcado {
	static String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza",
			"brazo", "familia" };

	static final int NUMINTENTOS = 7;

	static String palabraSecreta = "";

	static String palabraPista = "";

	static String noAcertadas = "";

	static void generaPalabra() {
		Random rand = new Random();

		int pos = rand.nextInt(0, palabras.length);

		palabraSecreta = palabras[pos];
		
		palabraPista = "_".repeat(palabraSecreta.length());
	}

	static void compruebaLetra(char letra) {
		char nuevaLetra = Character.toLowerCase(letra);
		char[] arrayPista = palabraPista.toCharArray();

		int pos = palabraSecreta.indexOf(nuevaLetra);

		if(pos < 0) {
			noAcertadas += nuevaLetra + " ";
		} else {
			while (pos >= 0) {
				arrayPista[pos] = letra;
				pos = palabraSecreta.indexOf(nuevaLetra, pos+1);
			}
		}
		
		palabraPista = String.valueOf(arrayPista);
	}
	
	static void compruebaPalabra(String palabra) {
		String nuevaPalabra = palabra.toLowerCase();
		
		if(nuevaPalabra.equals(palabraSecreta)) {
			palabraPista = palabraSecreta;
		}
	}
	
	static void pintaPista() {
		System.out.println(noAcertadas);
		System.out.println(palabraPista);
	}
}
