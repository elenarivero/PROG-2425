package boletin3;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int horas, min, seg;
		String resul = "";
		
		Scanner reader = new Scanner(System.in);
		horas = reader.nextInt();
		min = reader.nextInt();
		seg = reader.nextInt();
			
		seg++;
		
		if(seg == 60) {
			seg = 0;
			min++;
			
			if(min == 60) {
				min = 0;
				horas ++;
				if (horas == 24) {
					horas = 0;
				}
			}
		}
		
		resul += (horas < 10 ? "0" : "") + horas + ":";
		resul += (min < 10 ? "0" : "") + min + ":";
		resul += (seg < 10 ? "0" : "") + seg;
		
		System.out.println(resul);
		reader.close();
	}

}
