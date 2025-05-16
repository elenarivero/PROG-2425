package ejemplos;

import java.util.Objects;

/**
 * Clase Empleado para representar a los empleados
 * Hereda de la clase Persona
 */
public class Empleado extends Persona {
	
	private double salario;
	
	public Empleado(String dni, String nombre, int edad) {
		super(dni, nombre, edad);
	}

	public Empleado(String dni, String nombre, int edad, double salario) throws SalarioNegativoException {
		this(dni, nombre, edad);
		if(salario >= 0) {
			this.salario = salario;
		} else {
			throw new SalarioNegativoException();
		}
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

	@Override
	public String toString() {
		String res = super.toString();
		res += "\n" + this.salario;
		return res;
	}

	@Override
	public int hashCode() {
		return Objects.hash(salario);
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
//		Empleado nuevoEmpleado = null;
		
		if(obj instanceof Empleado nuevoEmpleado2) {
			
			if(this.salario == nuevoEmpleado2.salario) {
				res = true;
			}
		}
		
		return res;
		
	}

	public void antiguedad() {
//		super.antiguedad();
		this.salario += 500;
	}

	@Override
	public void voz() {
		// TODO Auto-generated method stub
		
	}

	
}
