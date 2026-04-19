import java.util.ArrayList;
public class Busqueda {
	
	public Estudiante buscarEstudiante(ArrayList<Estudiante> listaEstudiantes, int idEstudiante) {
    	for (Estudiante e : listaEstudiantes) { 
            if (e.getIdEstudiante() == idEstudiante) {
                return e;    
            }
        }
    	return null;
    }
    
	public Ciclo buscarCiclo(ArrayList<Ciclo> listaCiclos, String nombreCiclo) {
    	for (Ciclo c : listaCiclos) { 
            if (c.getNombreCiclo().equals(nombreCiclo)) {
                return c;  
            }
        }
    	return null;
    }
}
