package criptograma;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Criptograma.desordenaAbecedario();
		System.out.println(Arrays.deepToString(Criptograma.abecedario));

		Criptograma.codificaFrase();
		System.out.println(Criptograma.fraseCodificada);
	}

}
