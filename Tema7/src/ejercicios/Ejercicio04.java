package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import utils.Constantes;

public class Ejercicio04 {

	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(Constantes.url, Constantes.usuario, Constantes.contraseña)){
			int[] res;
			String consulta = "INSERT INTO cursos (nombre, descripcion, año_escolar)"
					+ "VALUES (?, ?, ?)";
			
			PreparedStatement st = con.prepareStatement(consulta);
			
			st.setString(1, "Historia 1º");
			st.setString(2, "Curso de Historia del primer año");
			st.setInt(3, 2025);
			st.addBatch();
			
			st.setString(1, "Biología 1º");
			st.setString(2, "Curso de Biología del primer año");
			st.setInt(3, 2025);
			st.addBatch();
			
			res = st.executeBatch();
			
			System.out.println("Número de filas insertadas: " + Arrays.toString(res));
			
		} catch (SQLException e) {
			System.out.println("Error con la base de datos: " + e.getMessage());
		} 


	}

}
