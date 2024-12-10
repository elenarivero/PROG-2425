package cadenas;

public class Pruebas {

	public static void main(String[] args) {
		String barra = "\\";
		System.out.println("Mi perro \\ \"Perico\" es de color blanco");

		char[] hola = {'h', 'o', 'l', 'a'}; 
		String cadena = String.valueOf(hola);
		System.out.println(cadena);
		
		String cadena1 = " ";
		String cadena2 = "A";
		
		int valor = cadena1.compareToIgnoreCase(cadena2);
		System.out.println(valor);
		
		String ejemplo = "";
		ejemplo += "hola";
		ejemplo += "adiós";
		
		System.out.println(ejemplo);
		System.out.println(ejemplo.charAt(5));
		
		int num = 5;
		String cad5 = num+"";
		
		System.out.println(cad5);
		
		String cadenaLarga = "una m mañana, al despertar de un sueño intranquilo mañana";
		String subcadena = cadenaLarga.substring(12, 24);
		System.out.println(subcadena);
		
		System.out.println(subcadena.length());
		System.out.println(cadenaLarga.lastIndexOf("mañana"));
	}
}
