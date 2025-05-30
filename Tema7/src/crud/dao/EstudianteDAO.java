package crud.dao;

import static utils.Constantes.CONTRASEÑA;
import static utils.Constantes.URL;
import static utils.Constantes.USUARIO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import crud.entidades.Estudiante;

public class EstudianteDAO {
	
	private Connection conexion;
	
	public EstudianteDAO() {
	
		try {
			conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
		} catch (SQLException e) {
			System.out.println("Error al crear la conexión con la base de datos: " + e.getMessage());
		}
		
	}
	
	public Connection getConexion() {
		return conexion;
	}


	public void create (Estudiante est) {
		String sql = "INSERT INTO estudiantes (nombre, apellido, fecha_nacimiento, email, telefono)"
				+ "VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement ps;
		try {
			ps = conexion.prepareStatement(sql);
			ps.setString(1, est.getNombre());
			ps.setString(2, est.getApellido());
			ps.setString(3, est.getFechaNacimiento());
			ps.setString(4, est.getEmail());
			ps.setString(5, est.getTelefono());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Error al insertar el estudiante: " + e.getMessage());
		}
		
	}
	
}
