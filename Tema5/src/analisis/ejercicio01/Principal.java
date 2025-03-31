package analisis.ejercicio01;

public class Principal {

	public static void main(String[] args) {
		Vehiculo v = new Vehiculo();
		
		v.acelerar(100);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Me he esperado 10 segundos");
	}

}
