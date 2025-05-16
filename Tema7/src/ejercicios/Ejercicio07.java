package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import utils.Constantes;

public class Ejercicio07 {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(Constantes.url, Constantes.usuario, Constantes.contraseña)) {
			String nombre = "Pepe";
			String apellidos = "Martínez";
			String fecha_nacimiento = "1999-05-01";
			String email = "pepe.martinez@prueba.es";
			String telefono = "698745632";

			String consulta = "INSERT INTO estudiantes (nombre, apellido, fecha_nacimiento, email, telefono)"
					+ "VALUES ('" + nombre + "', '" + apellidos + "', '" + fecha_nacimiento
					+ "', '" + email + "', '" + telefono + "')";

			Statement st = con.createStatement();

			int res = st.executeUpdate(consulta);

			System.out.println("Filas añadidas: " + res);

		} catch (SQLException e) {
			System.out.println("Error con la base de datos: " + e.getMessage());
		}

	}

}
