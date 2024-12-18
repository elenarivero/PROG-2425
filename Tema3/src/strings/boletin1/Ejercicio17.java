package strings.boletin1;

public class Ejercicio17 {

	public static void main(String[] args) {
		String codigo = "if (a==3) /* igual a tres */ a++; /* incrementamos a */"
				+ "else { a--; }";

		String res = quitaComentarios2(codigo);

		System.out.println(res);

	}

	static String quitaComentarios(String sentenciaC) {
		// if (a==3) /* igual a tres */ a++; /* incrementamos a */

		// Constantes para el inicio y el fin de los comentarios
		final String INICIO = "/*";
		final String FIN = "*/";

		// Inicializamos la cadena resulta a cadena vacía para luego ir concatenando el
		// código
		String cadRes = "";

		// Posición inicio almacena la posición en la que se encuentra el comentario de
		// apertura
		int posInicio = sentenciaC.indexOf(INICIO);
		// Inicializamos posFin a 0
		int posFin = 0;

		// Mientras haya comentarios en el código
		while (posInicio >= 0) {
			// Realizamos un substring para quedarnos con la cadena que es código
			cadRes += sentenciaC.substring(posFin, posInicio).trim() + " ";
			// Calculamos la posición en la que termina el comentario
			posFin = sentenciaC.indexOf(FIN, posInicio) + 2;
			// Volvemos a buscar otro comentario en el código
			posInicio = sentenciaC.indexOf(INICIO, posFin);
		}

		// Cuando ya no hay comentarios concatenamos lo que queda de código
		cadRes += sentenciaC.substring(posFin);

		return cadRes;
	}
	
	static String quitaComentarios2(String sentenciaC) {
		// if (a==3) /* igual a tres */ a++; /* incrementamos a */

		// Constantes para el inicio y el fin de los comentarios
		final String INICIO = "/*";
		final String FIN = "*/";

		// Inicializamos la cadena resulta a cadena vacía para luego ir concatenando el
		// código
		String cadRes = sentenciaC;
		
		// Cadena donde almacenamos el comentario
		String comentario = "";

		// Posición inicio almacena la posición en la que se encuentra el comentario de
		// apertura
		int posInicio = sentenciaC.indexOf(INICIO);
		
		// Inicializamos posFin a 0
		int posFin = sentenciaC.indexOf(FIN);

		// Mientras haya comentarios en el código
		while (posInicio >= 0 && posFin >=0) {
			// Almacenamos en comentario la cadena que se corresponde con el comentario
			comentario = cadRes.substring(posInicio, posFin + 2);
			
			// Sustituimos el comentario por cadena vacía
			cadRes = cadRes.replace(comentario, "");
			
			// Volvemos a calcular las posiciones de inicio y fin de los comentarios
			posInicio = cadRes.indexOf(INICIO);
			posFin = cadRes.indexOf(FIN);
		}

		return cadRes;
	}
}
