package crud.alumno;

import java.util.ArrayList;
import java.util.List;

public class AlumnoCRUD {

	static List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	
	
	public static boolean modificaAlumno(Alumno a, double media) {
		boolean res = false;
		int indice = listaAlumnos.indexOf(a);
		if(indice >= 0) {
			listaAlumnos.get(indice).setNotaMedia(media);
			res = true;
		}
		
		return res;
	}
}
