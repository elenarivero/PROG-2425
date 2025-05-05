package boletin2.cliente.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import boletin2.cliente.entidades.Cliente;

public class GestionFicheros {

	public static final String FICHERO = "clientes.txt";
	
	public void escribeFichero(Set<Cliente> listaClientes) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("clientes.txt"))){
			
			String cadena;
			
			for(Cliente c : listaClientes) {
				cadena = c.getDNI() + ";" + c.getNombre();
				bw.write(cadena);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error en la escritura del fichero: " + e.getMessage());
		}
	}
}
