package boletinbucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int num, numAnt;
		int contFallos = 0;
		int contTotal = 0;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Dime un número inicial:");
		
		num = reader.nextInt();
		numAnt = num;
		
		while(num != 0) {
			if(num < numAnt) {
				contFallos++;
				System.out.println("Fallo, es menor");
			} 
			numAnt = num;
			contTotal++;			
			
			System.out.print("Dime un número:");
			num = reader.nextInt();
		}
		
		System.out.println("Total de números introducidos: " + contTotal);
		System.out.println("Números fallados: " + contFallos);
		
		reader.close();

	}

}
