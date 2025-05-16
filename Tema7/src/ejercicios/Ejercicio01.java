package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import utils.Constantes;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		try(Connection con = DriverManager.getConnection(Constantes.url, Constantes.usuario, Constantes.contraseña)){
			String consulta = "INSERT INTO estudiantes (nombre, apellido, fecha_nacimiento, email, telefono)"
					+ "VALUES ('María', 'Pérez', '2000-03-03', 'maria.perez@prueba.es', '698745632')";
			
			Statement st = con.createStatement();
			
			int res = st.executeUpdate(consulta);
			
			System.out.println("Filas añadidas: " + res);
			
			
			
		} catch (SQLException e) {
			System.out.println("Error con la base de datos: " + e.getMessage());
		} 

	}

}
