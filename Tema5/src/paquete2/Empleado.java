package paquete2;

import java.util.Objects;

import ejemplos.Persona;

public class Empleado extends Persona{
	
	private double salario;
	
	public Empleado(String dni, String nombre, int edad) {
		super(dni, nombre, edad);
	}

	public Empleado(String dni, String nombre, int edad, double salario) {
		super(dni, nombre, edad);
		this.salario = salario;
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

	
}
