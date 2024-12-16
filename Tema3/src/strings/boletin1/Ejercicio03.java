package strings.boletin1;

public class Ejercicio03 {

	public static void main(String[] args) {
		int espacios = cuentaEspacios("cadena larga");
		
		System.out.println(espacios);

	}

	static int cuentaEspacios(String frase) {
		int cont = 0;
		
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i) == ' ') {
				cont++;
			}
		}
		
		return cont;
	}
}
