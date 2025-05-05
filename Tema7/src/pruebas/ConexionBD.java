package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;

public class ConexionBD {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost/institutodb";
		String usuario = "root";
		String contraseña = "MySQL1234";
		
		try(Connection con = DriverManager.getConnection(url, usuario, contraseña)){
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from estudiantes");
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
			
			
		} catch(SQLTimeoutException e) {
			System.out.println("Se pasó el tiempo de espera de conexión");
		} catch (SQLException e) {
			System.out.println("Error con la base de datos: " + e);
		}
	}
}
