package parte2.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<CuentaCorriente> cuentas = new ArrayList<>();
		
		CuentaCorriente c1 = new CuentaCorriente("12345678C", "Paco", 1000);
		CuentaCorriente c2 = new CuentaCorriente("12345678C", "Paco", 2000);
		
		cuentas.add(c1);
//		cuentas.add(c2);
		
//		System.out.println(cuentas);
//		System.out.println(cuentas.contains(c2));
		
		System.out.println(Boolean.parseBoolean("false"));

	}

}
