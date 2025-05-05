package fechas;

import java.time.LocalDate;

public class EjemplosFechas {

	public static void main(String[] args) {
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fecha = LocalDate.of(2020, 3, 15);
		
		
		LocalDate fechaSuma = fechaHoy.plusDays(5);
		System.out.println(fechaSuma);
		System.out.println(fechaHoy);
		
		if(fechaSuma.isAfter(fecha)) {
			System.out.println("Es posterior");
		} else {
			System.out.println("Es anterior");
		}
		

	}

}
