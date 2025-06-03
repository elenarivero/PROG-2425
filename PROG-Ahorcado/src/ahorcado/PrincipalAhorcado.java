package ahorcado;

public class PrincipalAhorcado {

	public static void main(String[] args) {
		JuegoAhorcado.generaPalabra();

		System.out.println("Palabra secreta: " + JuegoAhorcado.palabraSecreta);

		JuegoAhorcado.compruebaLetra('a');

		System.out.println(JuegoAhorcado.palabraPista);
		System.out.println(JuegoAhorcado.noAcertadas);

		JuegoAhorcado.compruebaLetra('e');

		System.out.println(JuegoAhorcado.palabraPista);
		System.out.println(JuegoAhorcado.noAcertadas);
	}

}
