package pruebas;

public class Pruebas2 {

	public static void main(String[] args) {
		String notaCadena;
		int nota = 8;

		notaCadena = switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			yield "Suspenso";
		}
		case 5 -> {
			yield "Aprobado";
		}
		case 6 -> {
			yield "Bien";
		}
		case 7, 8 -> {
			yield "Notable";
		}
		case 9, 10 -> {
			yield "Sobresaliente";
		}
		default -> {
			yield "";
		}
		};

		System.out.println(notaCadena);
	}

}
