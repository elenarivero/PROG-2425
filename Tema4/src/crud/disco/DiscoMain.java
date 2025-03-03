package crud.disco;

import java.util.Scanner;

public class DiscoMain {

	public static void main(String[] args) {

		int codigo;
		
		Scanner reader = new Scanner(System.in);
		
		Disco d1 = new Disco(1);
		Disco d2 = new Disco(2);
		Disco d3 = new Disco(3);
		DiscoCRUD.añadeDisco(d1);
		DiscoCRUD.añadeDisco(d2);
		DiscoCRUD.añadeDisco(d3);
		
		System.out.println("Introduzca el código a eliminar:");
		codigo = reader.nextInt();
		Disco discoEliminar = new Disco(codigo);
		
		DiscoCRUD.eliminaDisco(discoEliminar);
		
		DiscoCRUD.pintaLista();
		
		reader.close();
		
	}

}
