package analisis.ejercicio01;

public class Vehiculo {
	private String modelo;
	private String marca;
	private String matricula;
	private String color;
	private boolean encendido = false;
	private int marcha = 0;
	private int velocidad = 0;
	
	public boolean acelerar(int velocidad) {
		boolean res = false;
		
		if(this.velocidad < velocidad) {
			res = true;
			
			while(this.velocidad < velocidad) {
				this.velocidad++;
				System.out.println(this.velocidad);
				if(this.velocidad >=0 && this.velocidad<30 && marcha<1) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				} else if(this.velocidad >=30 && this.velocidad<50 && marcha<2) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				} else if(this.velocidad >=50 && this.velocidad<70 && marcha<3) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				}  else if(this.velocidad >=70 && this.velocidad<100 && marcha<4) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				}  else if (this.velocidad >=100 && marcha<5) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marcha);
				}
			}
		}
		
		return res;
	}
	public void subirMarcha() {
		this.marcha++;
	}

}
